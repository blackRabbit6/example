package programbasic;

public class RunMain2 {

	public static void main(String[] args) {		
		// 변수선언 == 객체선언
		// 데이터 타입 변수명 == 데이터타입 객체명
		// 원시데이터(int, double, char(String)타입+ 클래스
		// 변수 초기화
		// int iValue; iValue = 1;(초기화) iValue = 2;(대입)
		// GeneralClass objClass => 객체선언
		// objClass = new GeneralClass(); => 객체생성
		// 객체생성 -> 객체 내 함수(메소드) 호출 가능
		GeneralClass objClass = new GeneralClass();
		System.out.println(objClass.add(10,20));
		
		System.out.println(objClass.sub(20,10));

		System.out.println(objClass.mul(10,20));

		System.out.println(objClass.div(20,10));
		
	}

}
