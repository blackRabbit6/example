package com.acorn.Threads;

public class RunnableThreadTest2 {
	
	public static long iSum1 = 0L;
	public static long iSum2 = 0L;
	public static long iSum3 = 0L;
	public static long iSum4 = 0L;
	
	public static long lTime1 = 0L;
	public static long lTime2 = 0L;
	public static long lTime3 = 0L;
	public static long lTime4 = 0L;
	
	public static void main(String[] args) {
		Runnable threadFirst = new RunnableThread2(0,250000,1);
		Runnable threadSecond = new RunnableThread2(250001, 500000, 2);
		Runnable threadThird = new RunnableThread2(500001, 750000, 3);
		Runnable threadFourth = new RunnableThread2(750001, 1000000, 4);
		
		Thread thread1 = new Thread(threadFirst);
		Thread thread2 = new Thread(threadSecond);
		Thread thread3 = new Thread(threadThird);
		Thread thread4 = new Thread(threadFourth);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		System.out.println("실행합계: "+iSum1+iSum2+iSum3+iSum4);
		System.out.println("시간합계: "+lTime1+lTime2+lTime3+lTime4);
	}

}
