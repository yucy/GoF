package com.yucy.gof.代理.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class BookFacadeCglib implements MethodInterceptor {
	
	private Object target;

	/**
	 * 功能描述： 创建代理对象
	 * @param target
	 * @return
	 */
	public Object getInstance(Object target){
		this.target = target;
		Enhancer enhancer = new Enhancer(); // 增强器
		enhancer.setSuperclass(this.target.getClass());
		// 回调
		enhancer.setCallback(this);
		// 创建代理对象
		return enhancer.create();
	}
	
	@Override
	// 回调方法
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("事务开始");
		proxy.invokeSuper(obj, args);
		System.out.println("事务结束");
		return null;
	}

}
