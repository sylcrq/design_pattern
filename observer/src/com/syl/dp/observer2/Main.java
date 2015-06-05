package com.syl.dp.observer2;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		CurrentConditions board1 = new CurrentConditions();
		
		data.addObserver(board1);
		data.test();
	}

}
