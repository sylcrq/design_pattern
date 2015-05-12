package com.syl.dp;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Singleton obj = Singleton.getInstance();
//		obj.doSomething();
		
		System.out.println("Main Thread "+Thread.currentThread().getId());
		
		Main main = new Main();
				
		new Thread(main.new GetSingletonObj()).start();
		new Thread(main.new GetSingletonObj()).start();
		new Thread(main.new GetSingletonObj()).start();
		new Thread(main.new GetSingletonObj()).start();
	}

	public class GetSingletonObj implements Runnable {

		@Override
		public void run() {
			//SingletonThreadSafe obj = SingletonThreadSafe.getInstance();
			//SingletonThreadSafe obj_2 = SingletonThreadSafe.getInstance_2();
			SingletonThreadSafe obj_3 = SingletonThreadSafe.getInstance_3();
		}
		
	}
}
