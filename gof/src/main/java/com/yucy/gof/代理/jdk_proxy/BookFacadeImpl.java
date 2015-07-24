package com.yucy.gof.代理.jdk_proxy;
public class BookFacadeImpl implements BookFacade {

	@Override
	public void addBook() {
		System.out.println("BookFacadeImpl -> 增加图书");
	}

}
