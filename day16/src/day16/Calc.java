package day16;

public class Calc {
	
	// 필드 영역
	private int iFirstVal;
	private int iSecondVal;
	private int iAccumulateCnt2;
	private int[] iArrvalue1;
	
	// 생성자
	public Calc() {}
	public Calc(int iFirstVal,int iSecondVal,int iAccumulateCnt2,int[] iArrvalue1) {
		this.iFirstVal = iFirstVal;
		this.iSecondVal = iSecondVal;
		this.iAccumulateCnt2 = iAccumulateCnt2;
		this.iArrvalue1 = iArrvalue1;
	}
	
	// 메소드 영역
	// Getters/Setters 영역
	
	// 정적 메소드
	public static void printArray(int[] iArrvalue1) {
		iArrvalue1[2] =90;
		System.out.println(iArrvalue1[2]);
	}
	
	public static void printAcumVal(int iAccumulateCnt2) {
		while(iAccumulateCnt2<=5) {
			System.out.print(iAccumulateCnt2+" ");
			iAccumulateCnt2++;
		}
	}
	// 동적 메소드
	public static int add(int iFirstVal, int iSecondVal) {
		int iRet01 = 0;
		iRet01 = iFirstVal+iSecondVal;
		return iRet01;
	}
	public static int sub(int iFirstVal, int iSecondVal) {
		int iRet02 = 0;
		iRet02 = iFirstVal-iSecondVal;
		return iRet02;
	}
	public static int multi(int iFirstVal, int iSecondVal) {
		int iRet03 = 0;
		iRet03 = iFirstVal*iSecondVal;
		return iRet03;
	}
	public static double div(int iFirstVal, int iSecondVal) {
		double dRet04 = 0;
		dRet04 = (double) iFirstVal/iSecondVal;
		return dRet04;
	}

}
