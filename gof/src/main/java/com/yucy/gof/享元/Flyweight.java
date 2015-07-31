package com.yucy.gof.享元;

/**
 * 类描述： 享元模式采用一个共享来避免大量拥有相同内容对象的开销。
 * 这种开销最常见、最直观的就是内存的损耗。享元对象能做到共享的
 * 关键是区分内蕴状态(Internal State)和外蕴状态(External State)
 * 
 * @author:余从玉
 * @version   1.0
 * @since 2015年7月27日           
 */
public interface Flyweight {

	/**
	 * 功能描述： 一个示意性方法，参数state是外蕴状态
	 * @param state
	 */
	public void operation(String state);
}
