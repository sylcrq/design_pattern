package com.syl.dp.observer;


/**
 * 主题（被订阅信息）需要实现本接口
 * 
 * @author shenyunlong
 *
 */
public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
