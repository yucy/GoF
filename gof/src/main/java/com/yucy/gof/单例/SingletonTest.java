package com.yucy.gof.单例;

public class SingletonTest {

	/**
	 * 此方式十分简洁，利用java的枚举机制，保证了单例，
	 * 且如有需要还可以保证同时存在多个对象（添加多个枚举实例即可）
	 */
	public static  enum 枚举单例 {
		 INSTANCE;
	}
	
	public static void main(String[] args) {
//		Singleton singleton = new Singleton() // 此句报错
		// 通过内建方法来获得实例，参考Runtime类
		饿汉单例 s = 饿汉单例.getSingleton();
		s.exec("清空缓存"); 
		枚举单例 ins = 枚举单例.INSTANCE;
		System.out.println(ins.name());
	}

}
