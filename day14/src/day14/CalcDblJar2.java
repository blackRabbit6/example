package day14;

public class CalcDblJar2 {
	// 필드영역

	// 생성자영역
	
	// 메소드 영역
	// Getters/sETTERS 영역
	
	// 정적 메소드 영역
	
	// 동적 메소드 영역
	/**
	 * 두 실수 값을 받아서 더하는 연산을 하는 함수
	 * @param dFirst
	 * @param dSecond
	 * @return dFirst+dSecond
	 */
	public static double add(double dFirst,double dSecond){
		double iRet=dFirst+dSecond;
		return iRet;
	}

	public static double subtract(double dFirst,double dSecond){
		double iRet=dFirst-dSecond;
		return iRet;
	}
	
	public static double multiply(double dFirst,double dSecond){
		double iRet=dFirst*dSecond;
		return iRet;
	}
	
	public static double divide(double dFirst,double dSecond){
		double iRet = 0.0;
		if(dFirst ==0) iRet = 0.0;
		if(dSecond == 0.0) iRet = -1.0;
		else {
			iRet=dFirst/dSecond;
		}
		return iRet;
	}
}
