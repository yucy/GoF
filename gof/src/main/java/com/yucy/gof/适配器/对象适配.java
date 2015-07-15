package com.yucy.gof.适配器;

public class 对象适配 {
	private Source source ;
	
	/**
	 * 传入对象，调用其方法
	 */
	public 对象适配(Source source){
		this.source = source;
	}
	
	/**
	 * 源类Source有方法method1
     * 因此适配器类直接委派即可
	 */
	public void method1(){
		this.source.method1();
	}
	
	/**
	 * 源类Source没有有方法method2
     * 因此适配器类需要补充此方法
	 */
	public void method2(){
		// to do sth.
	}
	
}
