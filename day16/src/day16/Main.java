package day16;

public class Main {

	public static void main(String[] args) {
		// 0. 세상은 데이터(나이, 이름, 주소, 사회적정보)구성
		// 1. 변수: 데이터타입, 변수명(규칙: 영문자 시작, 숫자로 시작X)
		// 1.1 (일반, 원시변수) 변수선언: 데이터타입 변수명
		int iValue;
		double dValue;
		String sValue;
		// 1.1.2 초기화, 값할당(=할당연산자)
		iValue = 10;
		dValue = 11.1;
		sValue = "string";
		// 1.1.3 변수의 기본값: 자동지정 x
		// 초기에 값 할당을 하지 않는 경우, 자바 허용X
		// 정수: 0, 실수: 0.0, 문자열: null(클래스에서)
		// 1.2 특수변수: 배열, 객체(오라클제공+ 사용자개발)
		// 배열선언 -> 초기화
		// 데이터타입[] 배열변수명
//		int[] iArrValue;
		// 1.2.1 배열변수 초기화 방법1
		int[] iArrvalue1 = {10,20,30,40,50};
		iArrvalue1[2] =90;
		// 1.2.2 배열변수 초기화 방법2
		int[] iArrvalue2 = new int[5]; //{0,0,0,0,0}
		// 1.2.3 배열 변수의 요소에 접근: 배열변수명[위치값]
		// 	시작위치:0, 마지막위치: 배열사이즈-1
		// 	값 할당
		iArrvalue2[2] =30;
		System.out.println(iArrvalue1[2]+":"+iArrvalue2[2]);
		
		// 2. 제어문: 조건/반복문
		// 2.0 연산: 산술연산(+, -, *, /, %), 비교연산(>, >=, <, <=, ==, !=)
		// 2.1 조건: if(조건식) {참일때 실행할 명령문} else{거짓일때 실행하는 명령문}
		if(iValue > 10) {System.out.println("특대");} else {System.out.println("소");}
		// 2.2 반복: while(조건식) {조건식이 참일 동안 실행할 명령문}
		// for(초기값; 조건식; 증감값)
		// 1~5 출력
		// for 문
		int iAccumulateCnt1 =0;
		for(int i=0; i<5; i++) {
			iAccumulateCnt1++;
			System.out.print(iAccumulateCnt1+" ");
		}
		System.out.println("=========================");
		// while 문
		int iAccumulateCnt2 = 1;
		while(iAccumulateCnt2<=5) {
			System.out.print(iAccumulateCnt2+" ");
			iAccumulateCnt2++;
		}
		// 합계를 구하는 방법
		// 3. 체화된 기본 패턴 숙지
		// 4. 산술연산
		// 4.1: +,-,*,/
		// 4.2: %
		int iArithValue1 = 10;
		int iArithValue2 = 30;
		int iResultVal = iArithValue2 / iArithValue1;
		System.out.println("=========================");
		System.out.println(iResultVal);
		iResultVal = iArithValue2 % iArithValue1;
		System.out.println("=========================");
		System.out.println(iResultVal);
		// %: 나머지 할 수 있는 것: 짝수/홀수, 배수여부
		// 어떤 수 %2
		// 5. 계산기: +,-,/,*
		int iRet01 = 0; int iRet02 = 0; int iRet03 = 0; double dRet04 = 0; 
		int iFirstVal = 0; int iSecondVal =0;
		iFirstVal = 15;
		iSecondVal = 35;
		iRet01 = iFirstVal + iSecondVal;
		iRet02 = iFirstVal - iSecondVal;
		iRet03 = iFirstVal * iSecondVal;
		dRet04 = (double)iFirstVal / iSecondVal; //(double) 형변환
		System.out.println("=========================");
		System.out.println(iRet01+":"+iRet02+":"+iRet03+":"+dRet04);
		System.out.printf("%d : %d : %d : %.2f ",iRet01,iRet02,iRet03,dRet04);
		//5.1 연산의 결과는 양수, 나누기(분자와 분모에 조건에 맞는 값이 입력되는 것을 방지)
		iRet01 = iFirstVal + iSecondVal;
		if(iFirstVal >= iSecondVal) { iRet02 = iFirstVal - iSecondVal; } 
		else { iRet02 = iSecondVal - iFirstVal; }
		iRet03 = iFirstVal * iSecondVal;
		if(iFirstVal == 0) dRet04 = 0;
		else if(iSecondVal == 0) dRet04 = 0;
		else dRet04 = iFirstVal / iSecondVal;
		System.out.println("===========================");
		System.out.println(iRet01 + ":" + iRet02 + ":" + iRet03 + ":" + dRet04);
		
		
		
		// 6. 함수
		// 6.1 함수선언/정의
		// 리턴타입 함수명(파라메터1, 파라메터2,....파라메터n) {명령문집합;}
		// 6.2 함수호출: 함수명(아규먼트1, 아규먼트2, 아규먼트n);
	}

}
