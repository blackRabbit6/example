package com.acorn.Threads;

public class RunnableThread2 implements Runnable{
	private int iStart;
	private int iEnd;
	private int iFlag;
	
	public RunnableThread2(int iStart, int iEnd, int iFlag) {
		this.iStart = iStart;
		this.iEnd = iEnd;
		this.iFlag = iFlag;
	}
	@Override
	public void run() {
		long lSum = 0;
		long lBeforeTime = System.currentTimeMillis();
		for(int i=iStart; i<iEnd; i++) {
			for(int j=0; j<5000; j++) {
				lSum += (i*j);
			}
		}
		
		long lAfterTime = System.currentTimeMillis();
		
		if(iFlag == 1) {
			RunnableThreadTest2.iSum1 = lSum;
			RunnableThreadTest2.lTime1 = lAfterTime - lBeforeTime;
		}else if(iFlag == 2) {
			RunnableThreadTest2.iSum2 = lSum;
			RunnableThreadTest2.lTime2 = lAfterTime - lBeforeTime;
		}else if(iFlag == 3) {
			RunnableThreadTest2.iSum3 = lSum;
			RunnableThreadTest2.lTime3 = lAfterTime - lBeforeTime;
		}else if(iFlag == 4) {
			RunnableThreadTest2.iSum4 = lSum;
			RunnableThreadTest2.lTime4 = lAfterTime - lBeforeTime;
		}
		
	}
	
}
