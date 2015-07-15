package com.yucy.gof;

/**
 * 类描述： 具体的观察者
 * @author:余从玉
 * @version   1.0
 * @since 2015年7月15日           
 */
public class ConcreteWatcher implements Watcher {

	private String name ;
	
	public ConcreteWatcher(String name){
		super();
		this.name = name;
	}
	@Override
	public void update(String msg) {
		System.out.println(name+" , 【小雨菲】更新了一个朋友圈："+msg);
	}
	
}
