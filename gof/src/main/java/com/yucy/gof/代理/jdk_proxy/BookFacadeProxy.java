package com.yucy.gof.代理.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookFacadeProxy implements InvocationHandler {

	private Object target;
	
	/**
	 * 绑定委托对象并返回一个代理类
	 * 功能描述： 
	 * @param target
	 * @return
	 */
	public Object bind(Object target){
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this); //要绑定接口(这是一个缺陷，cglib弥补了这一缺陷)  
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		System.out.println("事务开始");
		// 执行方法并返回
		result = method.invoke(target, args);
		System.out.println("事务结束");
		return result;
	}

}
