package com.syl.dp;

/**
 * 一个简单的单例模式实现(Not Thread Safe)
 * @author shenyunlong
 *
 * Create by syl, 2015/05/12
 */

public class Singleton {
	// private 单例
	private static Singleton mSingletonObj;
	
	// private 构造函数
	private Singleton() {
		System.out.println("call Singleton Constructor");
	}
	
	// 全局访问接口
	public static Singleton getInstance() {
		// 延迟实例化
		if(mSingletonObj == null) {
			mSingletonObj = new Singleton();
		}
		
		return mSingletonObj;
	}
	
	public void doSomething() {
		System.out.println("Do Something");
	}
}
