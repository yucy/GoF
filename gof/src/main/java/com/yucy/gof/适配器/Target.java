package com.yucy.gof.适配器;

/**
 * 类描述： 适配器模式
 * @author:余从玉
 * @version   1.0
 * @since 2015年7月15日           
 */
public interface Target {

	/**
	 * 这个是源类adaptee也有的方法 
	 */
	public void method1();
	
	/**
	 * 这个是源类adaptee没有的方法 
	 */
	public void method2();
}
