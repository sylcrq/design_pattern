package com.syl.dp;

/**
 * 一个线程安全的单例模式实现(Thread Safe)
 * 
 * @author shenyunlong
 * 
 * Create by syl, 2015/05/12
 */

public class SingletonThreadSafe {
	private static SingletonThreadSafe mSingletonObj;
	
	private SingletonThreadSafe() {
		System.out.println("Thread "+Thread.currentThread().getId()+": call SingletonThreadSafe Constructor");	
	}
	
	// 方法1. 同步getInstance方法
	public static synchronized SingletonThreadSafe getInstance() {
		if(mSingletonObj == null) {					
			mSingletonObj = new SingletonThreadSafe();
		}
		
		return mSingletonObj;
	}
	
	// 方法2. 不使用延迟实例化（静态初始化）
//	private static SingletonThreadSafe mSingletonObj_2 = new SingletonThreadSafe();
//	
//	public static SingletonThreadSafe getInstance_2() {
//		return mSingletonObj_2;
//	}
	
	// 方法3. 方法1的优化
	private static volatile SingletonThreadSafe mSingletonObj_3;
	
	public static SingletonThreadSafe getInstance_3() {
		// double-check
		if(mSingletonObj_3 == null) {
			
			synchronized (SingletonThreadSafe.class) {
				if(mSingletonObj_3 == null) {
					mSingletonObj_3 = new SingletonThreadSafe();
				}
			}
		}
		
		return mSingletonObj_3;
	}
}
