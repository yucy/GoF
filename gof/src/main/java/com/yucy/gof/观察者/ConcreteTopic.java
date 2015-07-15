package com.yucy.gof.观察者;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述： 具体的主题
 * @author:余从玉
 * @version   1.0
 * @since 2015年7月15日           
 */
public class ConcreteTopic implements Topic {

	/**
	 * 存放观察者
	 */
	private List<Watcher> watchers = new ArrayList<Watcher>();
	
	@Override
	public void addWatcher(Watcher watcher) {
		watchers.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		watchers.remove(watcher);

	}

	@Override
	public void notifyWatcher(String msg) {
		// 自动调用实际上是主题发起的
		for (Watcher watcher : watchers) {
			watcher.update(msg);
		}
	}

}
