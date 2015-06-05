package com.syl.dp.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * 天气数据，可供观察者订阅
 * 
 * @author shenyunlong
 *
 */
public class WeatherData implements Subject {

	private final List<Observer> observers = new ArrayList<Observer>();
	
	private int data1;
	private String data2;
	private float data3;
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		
		if(index >= 0) {
			observers.remove(index);
		}
		
//		if(observers.contains(o)) {
//			observers.remove(o);
//		}
	}

	@Override
	public void notifyObservers() {
		for(int i=0; i<observers.size(); i++) {
			observers.get(i).update(data1, data2, data3);
		}
	}
	
	public void weatherDataChanged() {
		notifyObservers();
	}
	
	public void test() {
		data1 = 1024;
		data2 = "hello world";
		data3 = (float) 3.14;
		weatherDataChanged();
	}

}
