package acornFuction;

public class AfterModulation {

	public static void main(String[] args) {
		// 덧셈 함수 구현
		int iValue01 = 10; int iValue02 = 20;
		int iResult01 = 0;
		iResult01 = add(iValue01,iValue02);
		System.out.println(iResult01);
	}
	
	public static int add(int iValue01, int iValue02) {
		int iResult01 = 0;
		iResult01 = iValue01+iValue02;
		return iResult01;
	}
}
