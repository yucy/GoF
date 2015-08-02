package com.yucy.gof.future;

public class FutureTest {

	public static String fileLoader(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "abc";
	}
	
	public static int fileCount(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 1;
	}
	
	public static void doTask(Data data){
		String file = fileLoader();
		if (file.contains(data.getDate())) {
			// TODO STH
		}
		fileCount();
	}
	
	public static void main(String[] args) {
		
		// 普通方式
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long s = System.currentTimeMillis();
				doTask(new NetData());
				System.out.println("使用普通方法耗时："+(System.currentTimeMillis()-s));
			}
		}).start();
		
		// Future方式
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long s = System.currentTimeMillis();
				doTask(new FutureData());
				System.out.println("使用Future方法耗时："+(System.currentTimeMillis()-s));
			}
		}).start();
		
		// JDK方式
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long s = System.currentTimeMillis();
				doTask(new JDKFuture());
				System.out.println("使用JDK方法耗时："+(System.currentTimeMillis()-s));
			}
		}).start();
	}

}

