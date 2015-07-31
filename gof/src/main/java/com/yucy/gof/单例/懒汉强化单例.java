package com.yucy.gof.单例;

/**
 * 类描述： 上面讲了普通懒汉式会被多线程干扰，现在加以强化一下
 * 这种方式使用了静态内部类持有单例对象，使用JVM本身机制保证了线程安全问题。
 * 由于SingletonHolder是私有的，只有getInstance()可以访问此类，所以只有在第一
 * 次访问这个方法的时候SingletonHolder才会被加载进而创建Singleton，因此它是
 * 懒汉式的，而且是线程安全的。
 * 
 * @author:余从玉
 * @version   1.0
 * @since 2015年7月31日           
 */
public class 懒汉强化单例 {
	
	/**
	 * 功能描述： 私有构造器，不允许实例化此类
	 */
	private 懒汉强化单例(){}
	
	private static class SingletonHolder{
		private static final 懒汉强化单例 SINGLETON = new 懒汉强化单例();
	}
	
	public 懒汉强化单例 getSingleton(){
		return SingletonHolder.SINGLETON;
	}
	
	public void exec(String cmd){
		System.out.println("执行命令 : 【"+cmd+"】");
	}
}
