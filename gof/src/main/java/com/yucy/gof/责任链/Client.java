package com.yucy.gof.责任链;

/**
 * 类描述： 责任链测试
 * @author:余从玉
 * @version   1.0
 * @since 2015年7月24日           
 */
public class Client {

	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler_1();
		Handler handler2 = new ConcreteHandler_2();
		Handler handler3 = new ConcreteHandler_3();
		Handler handlern = new ConcreteHandler_N();
		
		handler1.setSuccessor(handler2);
		handler2.setSuccessor(handler3);
		handler3.setSuccessor(handlern);
		
		handler1.handlerRequest("x");
	}

}
