package javabasic;

//public 선언되는 클래스는 하나만 존재
//public 선언되는 클래스 파일이름이 된다.
public class Main {

	public static void main(String[] args) {
//		new Main02();
		// 변수선언: 데이터타입 변수명;초기화 데이터타입 변수명=값;, 변수명=값
		// 원시 데이터타입: int, long(주의: long lValue =12L), double, float(주의, 쓰지마시오): float fValue =0.0F; 
		// 객체형 데이터타입: String str = "abcdefg";
		// 동일 변수명을 가진 변수는 선언을 한 번 밖에 할 수 없다.
		// int a; -> (int) a;
		// 함수: 함수명()
		int a=2; int b=3; int c = a+b; //System.out.println(c);
		c = add(a, b); //함수 호출 a,b를 아규먼트(함수인자(변수))
		// 함수로부터 넘어온 값은 저장되어야한다. 저장->변수
		System.out.println(c);

		int i = 0;
		// 반복문
//		for(초기값; 조건문; 증감값)
		for(int i=0; i<10; i++)
		{
			System.out.println(10); //실행문장
		}
		// 조건문
//		if(조건식)
		int i =10;
		if(i<20) {
//			만족할 때(참일때) 실행문
		}else 
		{
			
		}
		
		// 배열
		//int,double,String
		//int[] iArray = new int[사이즈];
		//double[] dArray = new double[사이즈];
		//String[] sArray = new String[사이즈];
		//배열변수[인덱스]
		
	}
	
	public static int add(int a, int b){ //함수 호출 받은 쪽: 파라메터(함수인자(변수)): 리턴값 함수명(함수인자)
		int c;
		c = a + b;
		
		return c;
	}
	
}
