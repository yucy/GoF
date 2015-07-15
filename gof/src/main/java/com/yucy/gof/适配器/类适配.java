package com.yucy.gof.适配器;
public class 类适配 extends Source implements Target {

	/**
	 *  由于源类Adaptee类没有方法method2，因此适配器补充上这个方法
	 */
	@Override
	public void method2() {
		System.out.println("Adapter.method2");
	}

}
