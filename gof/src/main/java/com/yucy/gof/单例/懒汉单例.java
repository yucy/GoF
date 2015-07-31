package com.yucy.gof.单例;

/**
 * 类描述： 通过建立一个私有构造器来实现单例模式。
 * 懒汉式避免了程序加载的时候就新建一个类实例，在需要用到此实例的时候才创建。
 * 但是这种模式在多线程的环境下，可能会多次执行：new 懒汉单例()，这样就会有
 * 多个实例了。
 * 
 * @author:余从玉
 * @version   1.0
 * @since 2015年7月31日           
 */
public class 懒汉单例 {

	private  static 懒汉单例 SINGLETON ;
	
	/**
	 * 功能描述： 私有构造器，不允许实例化此类
	 */
	private 懒汉单例(){}
	
	public static 懒汉单例 getSingleton(){
		if (SINGLETON == null) {
			SINGLETON = new 懒汉单例();
		}
		return SINGLETON;
	}
	
	public void exec(String cmd){
		System.out.println("执行命令 : 【"+cmd+"】");
	}
}
