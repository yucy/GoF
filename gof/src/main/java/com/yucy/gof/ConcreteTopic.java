package com.yucy.gof;

import java.util.ArrayList;
import java.util.List;

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
