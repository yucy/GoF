package com.yucy.gof.future;

public interface Data {

	String getDate();
}

class NetData implements Data{

	private String data;
	
	public NetData() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		this.data = "真实数据";
	}
	
	@Override
	public String getDate() {
		return data;
	}
	
}

class FutureData implements Data{
	
	private String futureData;
	
	private volatile boolean isReady;
	
	public FutureData(){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				String realData = new NetData().getDate();// 耗时操作
				synchronized(FutureData.this){// TODO 锁定整个类
					if (isReady) {
						return;
					}
					isReady = true;
					FutureData.this.futureData = realData;
					FutureData.this.notifyAll();
				}
			}
			
		}).start();
	}

	@Override
	public synchronized String getDate() {
		
		while (!isReady) {
			try {
				wait();
			} catch (Exception e) {}
			
		}
		return futureData;
	}
	
}