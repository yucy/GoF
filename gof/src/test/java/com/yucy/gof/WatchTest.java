package com.yucy.gof;

import com.yucy.gof.观察者.ConcreteTopic;
import com.yucy.gof.观察者.ConcreteWatcher;
import com.yucy.gof.观察者.Topic;
import com.yucy.gof.观察者.Watcher;

public class WatchTest {

	public static void main(String[] args) {
		Topic girl = new ConcreteTopic();
		
		Watcher watcher1 = new ConcreteWatcher("张钟");
		Watcher watcher2 = new ConcreteWatcher("Jone");
		Watcher watcher3 = new ConcreteWatcher("陈琦");
		
		girl.addWatcher(watcher1);
		girl.addWatcher(watcher2);
		girl.addWatcher(watcher3);
		
		girl.notifyWatcher("今天天气真好啊，O(∩_∩)O~~");
	}

}
