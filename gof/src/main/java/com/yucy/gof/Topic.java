package com.yucy.gof;

/**
 * 类描述： 抽象的主题
 * @author:余从玉
 * @version   1.0
 * @since 2015年7月15日           
 */
public interface Topic {

	public void addWatcher(Watcher watcher);
	
	public void removeWatcher(Watcher watcher);
	
	public void notifyWatcher(String msg);
}
