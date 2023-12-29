package com.acorn.intro01;

public class Review4Main {

	public static void main(String[] args) {
		// 반복문
		// for(초기값;조건식;증감값)
		//증가 연산자
//		int i; //변수주기
//		i =20; //변수초기화시키기 이거 쓸려면 for문 int 삭제
//		for(int i=1; i<50; i++) //i=i+1, 2씩증가-i+2
//		{
			// 실행문
			//1번째(수업)
//			System.out.print(i+"번째:");
//			if(i%2==0)
//			{
//				System.out.println("짝수");
//			}
//			else
//			{
//				System.out.println("홀수");
//			}
			
			//2번째
//			int k = i*2;
//			System.out.print(k+"번째:");
//			if(k%3==0)
//			{
//				System.out.println("3의배수");
//			}
//			else
//			{
//				System.out.println("3의배수가 아님");
//			}
//		}
		
		// 감소연산자
		for(int i=20; i>0; i--)
		{
			// 내가 한거
//			System.out.print(i+"번: ");
//			if(i%2==0) {
//				System.out.println("짝수");
//			}else {
//				System.out.println("홀수");
//			}
		}
		
		//배열(array):하나의 변수 이름에 같은 타입의 값들 여러개를 저장하기위한 데이터타입
		String[] names = {"k1","k2","k3","k4","k5"};
		System.out.println("세번째요소"+ names[2]);
		System.out.println("다섯번째요소"+ names[4]);
		for(int i=0; i<names.length; i++) //names.length=5임
		{
			System.out.println((i+1)+"번째 요소: "+names[i]);
		}
		
		//밑에 있는건 짧지만 이안에서 다 계싼하고 출력하기때문에 시간이 걸림
		for(String name :names)
		{
			System.out.println(name);
		}
		
		//while문 -> while(조건식) {반복증감}
		int j = 0;
		while(j<names.length)
		{
			System.out.println((j+1)+"번째 "+ names[j]);
			j++;
		}
//		while(true) 
//		{
//			if(j>=names.length) break;
//			
//			System.out.println((j+1)+"번째 "+ names[j]);
//			j++;
//		}
	}

}
