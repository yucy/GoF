package com.yucy.gof.责任链;


/**
 * 类描述： 抽象处理角色
 * @author:余从玉
 * @version   1.0
 * @since 2015年7月24日           
 */
public abstract class Handler {

	protected Handler successor;
	
	/**
	 * 功能描述： 处理方法
	 * @param confition
	 */
	public abstract void handlerRequest(String confition);

	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
}
