package com.syl.dp.observer;

import java.util.Calendar;
import java.util.Date;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		
		CurrentConditions board1 = new CurrentConditions(data);
		ForecastDisplay board2 = new ForecastDisplay(data);
		StatisticsDisplay board3 = new StatisticsDisplay(data);
		
		data.test();
	}

	
//	public static void xxx() {
//        Calendar cToday = Calendar.getInstance();
//        cToday.add(Calendar.DATE, 0);
//        
//        Calendar cWeekAgo = Calendar.getInstance();
//        cWeekAgo.add(Calendar.DATE, -7);        
//        
//        //Calendar cAddTime = Calendar.getInstance();
//        //cAddTime.setTime(new Date(addTime * 1000));
//        System.out.println(cToday.getTime());
//        System.out.println(cWeekAgo.getTime());
//	}
}
