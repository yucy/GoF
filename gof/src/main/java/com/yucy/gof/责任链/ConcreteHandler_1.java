package com.yucy.gof.责任链;

/**
 * 类描述： 具体处理角色
 * @author:余从玉
 * @version   1.0
 * @since 2015年7月24日           
 */
public class ConcreteHandler_1 extends Handler {

	@Override
	public void handlerRequest(String confition) {
		if (confition.equals("a")) {
			System.out.println("ConcreteHandler_1 handled");
			return;
		}else {
			System.out.println("ConcreteHandler_1 passed");
			getSuccessor().handlerRequest(confition);
		}
	}

}
