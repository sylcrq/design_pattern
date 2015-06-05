package com.syl.dp.observer2;

import java.util.Observable;
import java.util.Observer;

import com.syl.dp.observer.DisplayElement;

/**
 * 观察者
 * 
 * @author shenyunlong
 *
 */
public class CurrentConditions implements Observer, DisplayElement {
	
//	private final Observable observable;
	
	private int data1;
	private String data2;
	private float data3;
	
//	public CurrentConditions(Observable observable) {
//		this.observable = observable;
//		observable.addObserver(this);
//	}
	
	@Override
	public void update(Observable observable, Object object) {
		if(observable instanceof WeatherData) {
			// 从被订阅者主动pull数据
			data1 = ((WeatherData) observable).getData1();
			data2 = ((WeatherData) observable).getData2();
			data3 = ((WeatherData) observable).getData3();
		}
		
		display();
	}

	@Override
	public void display() {
		System.out.println("CurrentConditions: "+data1+", "+data2+", "+data3);
	}

}
