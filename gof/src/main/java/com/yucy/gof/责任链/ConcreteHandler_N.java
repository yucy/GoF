package com.yucy.gof.责任链;

/**
 * 类描述： 具体处理角色
 * @author:余从玉
 * @version   1.0
 * @since 2015年7月24日           
 */
public class ConcreteHandler_N extends Handler {

	@Override
	public void handlerRequest(String confition) {
		if (confition.equals("z")) {
			System.out.println("ConcreteHandler_N handled");
		}else {
			System.err.println("this request has not handler.");
		}
	}

}
