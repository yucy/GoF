package com.yucy.gof.代理.cglib;
public class CglibTest {

	public static void main(String[] args) {
		BookFacadeCglib cglib = new BookFacadeCglib();
		BookFacadeImpl bookCglib = (BookFacadeImpl) cglib.getInstance(new BookFacadeImpl());
		
		bookCglib.addBook();
	}

}
