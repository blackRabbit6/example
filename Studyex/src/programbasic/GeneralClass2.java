package programbasic;

public class GeneralClass2 {
	
	// 일반변수 영역 - 필드영역
	private int iFirst;
	private int iSecond;
	private double dFirst;
	private double dSecond;
	// 생성자 영역(필드에 있는거 초기화)
	// 기본생성자 == 디폴트 생성자
	public GeneralClass2() {}
	
	// 인자있는 생성자
	public GeneralClass2(int iFirst, int iSecond, double dFirst, double dSecond) {
		this.iFirst = iFirst;
		this.iSecond = iSecond;
		this.dFirst = dFirst;
		this.dSecond = dSecond;
	}
	
	public int add(int iFirst, int iSecond) {
		int iResult01;
		iResult01 = iFirst + iSecond;
		return iResult01;
	}
	
	public int add() {
		int iResult01;
		iResult01 = iFirst + iSecond;
		return iResult01;
	}
	
	
	public int sub(int iThird, int iFourth) {
		int iResult02;
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
