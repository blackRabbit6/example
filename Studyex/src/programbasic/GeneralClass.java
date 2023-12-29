package programbasic;

public class GeneralClass {
	
	// 일반변수 영역 - 필드영역
	
	// 생성자 영역(필드에 있는거 초기화)
	// 기본생성자 == 디폴트 생성자
	public GeneralClass() {}
	
	// 메소드 영역
	// public 리턴타입(원시데이터(void, int, float, String), 사용자데이터타입(클래스))
	// 메소드 이름(인자1, 인자2...)
	
//	1
//	public int add(int iFirst, int iSecond) {
//		int iResult;
//		iResult = iFirst + iSecond;
//		return iResult;
//	}
	
//	2
//	void 돌려받지 않음
//	public void add(int iFirst, int iSecond) {
//		int iResult;
//		iResult = iFirst + iSecond;
//		System.out.println(iResult);
//	}
	
//	3
	public int add(int iFirst, int iSecond) {
		int iResult01;
		iResult01 = iFirst + iSecond;
		return iResult01;
	}
	
	
	public int sub(int iThird, int iFourth) {
		int iResult02;
		//함수 호출: 둘중 큰값 , 큰값에서 작은값빼기
		if(compare(iThird,iFourth)) {
			iResult02 = iThird - iFourth;
		}
		else {
			iResult02 = iFourth - iThird;
		}
		
		return iResult02;
	}
	
	public boolean compare(int iThird, int iFourth) {
		if(iThird >= iFourth) {
			return true;
		}else {
			return false;
		}
	}
	
	public int mul(int iFifth, int iSixth) {
		int iResult03;
		iResult03 = iFifth * iSixth;
		return iResult03;
	}
	
	
	public double div(int iSeventh, int iEigth) {
		double iResult04;
		// div iSeventh >iEigth 비교, 
		// 분모/분자 0이면 0으로 되돌리기
		if(check(iSeventh, iEigth)) {
			return 0;
		}
		else {
			iResult04 = iSeventh / iEigth;
			return iResult04;
		}
	}
	
	public boolean check(int iSeventh, int iEigth) {
		if((iSeventh == 0) || (iEigth == 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
