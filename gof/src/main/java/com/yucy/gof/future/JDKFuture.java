package com.yucy.gof.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * 类描述： jdk中关于future的实现
 * Java标准库已经内置了 Future 模式的实现，通过FutureTask和Callable API实现 
 * 其内部机制自动保证同步和阻塞，无需关心上文FutureData中的同步及wait/notify机制等问题，非常简洁 
 * 而且具有异步任务取消等功能
 * @author:余从玉
 * @version   1.0
 * @since 2015年8月2日           
 */
public class JDKFuture implements Data {

	private FutureTask<String> futureTask;
	
	public JDKFuture(){
		futureTask = new FutureTask<String>(new Callable<String>() { // 需要的数据是string，这里用泛型实现

			@Override
			public String call() throws Exception {
				String realData = new NetData().getDate();
				return realData;
			}
		});
		ExecutorService executor = Executors.newFixedThreadPool(1);
		executor.submit(futureTask);
		executor.shutdown();
	}
	
	@Override
	public String getDate() {
		String data = null;
		try {
			data=futureTask.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		return data;
	}

}
