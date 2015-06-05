package com.syl.dp.observer;

/**
 * 观察者
 * 
 * @author shenyunlong
 *
 */
public class StatisticsDisplay implements Observer, DisplayElement {

	private final Subject subject;
	
	private int data1;
	private String data2;
	private float data3;
	
	public StatisticsDisplay(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("StatisticsDisplay: "+data1+", "+data2+", "+data3);
	}

	@Override
	public void update(int data1, String data2, float data3) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		display();
	}


}
