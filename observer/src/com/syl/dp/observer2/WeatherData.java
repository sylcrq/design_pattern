package com.syl.dp.observer2;

import java.util.Observable;

/**
 * 天气数据，提供观察者订阅
 * 
 * @author shenyunlong
 *
 */
public class WeatherData extends Observable {
	
	private int data1;
	private String data2;
	private float data3;
	
	public int getData1() {
		return data1;
	}
	
	public String getData2() {
		return data2;
	}
	
	public float getData3() {
		return data3;
	}
	
	public void test() {
		data1 = 1024;
		data2 = "hello world";
		data3 = (float) 3.14;
		
		setChanged();
		notifyObservers();
	}
}
