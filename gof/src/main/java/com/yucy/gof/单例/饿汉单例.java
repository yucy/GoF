package com.yucy.gof.单例;

/**
 * 类描述： 通过建立一个私有构造器来实现单例模式。
 * 类里面定义了一个final的唯一实例，此实现为饿汉模式。
 * 这种模式在ClassLoader加载类后第一时间被创建，但在某些情况下将无法使用，
 * 比如创建过程需要一些配置参数等依赖其它一些工作，另外这种创建方式会增加
 * 类加载时的负担，而且可能创建出的实例很长时间都不使用。
 * 
 * @author:余从玉
 * @version   1.0
 * @since 2015年7月31日           
 */
public class 饿汉单例 {

	private final static 饿汉单例 SINGLETON = new 饿汉单例();
	
	/**
	 * 功能描述： 私有构造器，不允许实例化此类
	 * 但是反射可以规避掉这个限制，呵呵
	 */
	private 饿汉单例(){}
	
	public static 饿汉单例 getSingleton(){
		return SINGLETON;
	}
	
	public void exec(String cmd){
		System.out.println("执行命令 : 【"+cmd+"】");
	}
}
