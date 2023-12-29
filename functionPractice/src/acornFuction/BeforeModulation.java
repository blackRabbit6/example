package acornFuction;

public class BeforeModulation {

	public static void main(String[] args) {
		// 계산 변수 선언
		int iValue01 = 10; int iValue02 = 20;
		// 연산결과 저장용 변수 선언
		int iResult01 = 0;
		// 명령문1: 산술연산자와 할당 연산자 사용
		iResult01 = iValue01 + iValue02;
		// 명령문 2: 결과 출력
		System.out.println("덧셈: "+iResult01);
//		System.out.println("덧셈: "+(iValue01+iValue02));
		
		// 계산 변수 선언
		int iValue03 = 20; int iValue04 = 10;
		// 연산결과 저장용 변수 선언
		int iResult02 = 0;
		// 명령문1: 산술연산자와 할당 연산자 사용
		iResult02 = iValue03 - iValue04;
		// 명령문 2: 결과 출력
		System.out.println("뺄셈: "+iResult02);
		
		// 계산 변수 선언
		int iValue05 = 20; int iValue06 = 10;
		// 연산결과 저장용 변수 선언
		int iResult03 = 0;
		// 명령문1: 산술연산자와 할당 연산자 사용
		iResult03 = iValue05 * iValue06;
		// 명령문 2: 결과 출력
		System.out.println("곱셈: "+iResult03);
		
		// 계산 변수 선언
		int iValue07 = 20; int iValue08 = 10;
		// 연산결과 저장용 변수 선언
		double iResult04 = 0;
		// 명령문1: 산술연산자와 할당 연산자 사용
		iResult04 = iValue07 / iValue08;
		// 명령문 2: 결과 출력
		System.out.println("나눗셈: "+iResult04);

	}

}
