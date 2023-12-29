package day16;

public class Main3 {

	public static void main(String[] args) {
		// 클래스 개체 선언 == 변수 선언
		Calc calc = new Calc();
		int[] iArrvalue1 = {10,20,30,40,50};
		Calc.printArray(iArrvalue1);
//		
		System.out.println("=========================");
		// while 문
		int iAccumulateCnt2 = 1;
		Calc.printAcumVal(iAccumulateCnt2);
	
		// 5. 계산기: +,-,/,*
		int iRet01 = 0; int iRet02 = 0; int iRet03 = 0; double dRet04 = 0; 
		int iFirstVal = 0; int iSecondVal =0;
		iFirstVal = 15;
		iSecondVal = 35;
		iRet01 = Calc.add(iFirstVal,iSecondVal);
		iRet02 = Calc.sub(iFirstVal,iSecondVal);
		iRet03 = Calc.multi(iFirstVal,iSecondVal);
		dRet04 = Calc.div(iFirstVal,iSecondVal); //(double) 형변환
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
		else dRet04 = (double)iFirstVal / iSecondVal;
		System.out.println("===========================");
		System.out.println(iRet01 + ":" + iRet02 + ":" + iRet03 + ":" + dRet04);
		

		
		// 7. 클래스
		// 7.1 데이터타입
		// public class 클래스명{
		//}
		// 7.2 클래스 구성 요소: 필드영역, 생성자영역(기본생성자/인자있는생성자),
		// 메소드 영역(Getters/Setters, 정적, 동적)
	}
	
}
