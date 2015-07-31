package com.yucy.gof.享元;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;

public class ConcreteFlyweight  {

	
	private static ConcreteFlyweight currentConcreteFlyweight = new ConcreteFlyweight();
	
	/**
	 * 创建私有构造器后，其他类都不能实例化此类
	 * 功能描述： 
	 * @author:余从玉
	 * @since 2015年7月29日  
	 * @param:
	 * @version 1.0
	 */
	private ConcreteFlyweight(){}
	
	
	
	private Character intrinsicState = null;
	
	/**
	 * 功能描述： 构造函数，
	 * @author:余从玉
	 * @since 2015年7月27日  
	 * @param:
	 * @version 1.0
	 */
//	public ConcreteFlyweight(Character state) {
//		this.intrinsicState = state;
//	}



	public void operation(String state) {
//		BlockingQueue<String> queue = new
		
		HashMap<String, String > map = new HashMap<>();
		LinkedList<String > list = null;
		ConcreteFlyweight c = new ConcreteFlyweight();
		System.out.println(c.intrinsicState);
	}

}
