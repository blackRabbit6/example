package com.acron;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		
		//1. 사용자 vs 컴퓨터 차이 대결
		
		//사람이 입력한 큰 수 작은수
		int iMoreNum = 0;
		int iLessNum = 0;
		//컴퓨터가 만든 랜덤한 큰수 작은수
		int iComMoreNum = 0;
		int iComLessNum = 0;
//		//타입지정 1-사람 2-컴퓨터
//		
//		//키보드입력 객체 생성
//		Scanner sc= new Scanner(System.in);
//		
//		int num1 = 0;
//		int num2 = 0;
//		//두 개의 숫자를 키보드 입력
//		System.out.println("숫자 1: ");
//		num1 = sc.nextInt();
//		System.out.println("숫자 2: ");
//		num2 = sc.nextInt();
//		
//		//두개 난수 생성 math.random+1 해야 1부터 나옴
//		int iRan01= (int)((Math.random()*100))+1;
//		System.out.println(iRan01);
//		int iRan02= (int)((Math.random()*100))+1;
//		System.out.println(iRan02);
//		
//		//규칙 승리조건:두개의 수의 차가 가장 적은 수
//		int sub1 = num1-num2;
//		int sub2 = iRan01-iRan02;
//		System.out.println(sub1+":"+sub2);
//		//우승여부출력
//		if(sub1>sub2)
//		{
//			System.out.println("사용자 승리");
//		}else
//		{
//			System.out.println("컴퓨터 승리");
//		}
//		sc.close();
		
//		2. 모든수 랜덤으로 해서 만들기(중복 금지)

		//요소 없는 배열 생성 : 데이터타입[] 변수명 ={};
		int[] iRanNum = {};
		//넌수발생기 이용 배열값 할당:반복문
		for(int i=0; i<100; i++)
		{
			iRanNum[i] = (int)((Math.random()*100))+1;
		}
		//이전코드
		//키보드입력 객체 생성
		Scanner sc= new Scanner(System.in);
		
		//두 개의 숫자를 키보드 입력
		System.out.println("숫자 1: ");
		int num1 = iRanNum[sc.nextInt()];
		System.out.println("숫자 2: ");
		int num2 = iRanNum[sc.nextInt()];
		
		//두개 난수 생성 math.random+1 해야 1부터 나옴
		int iRan01= (int)((Math.random()*100))+1;
		System.out.println(iRan01);
		int iRan02= (int)((Math.random()*100))+1;
		System.out.println(iRan02);
		
		//입력한 수 대소 비교
		if((num1-num2)>0)
		{
			iMoreNum = iComMoreNum ; iLessNum = iComLessNum;
		}
		else 
		{
			iMoreNum = iComLessNum ; iLessNum = iComMoreNum;
		}
		//규칙 승리조건:두개의 수의 차가 가장 적은 수
		int sub1 = num1-num2;
		int sub2 = iRan01-iRan02;
		System.out.println(sub1+":"+sub2);
		//우승여부출력
		if(sub1>sub2)
		{
			System.out.println("사용자 승리");
		}else
		{
			System.out.println("컴퓨터 승리");
		}
		sc.close();
		//우승 조건 체ㅡ: 큰수에서 작은수 뺄셈		
	}

}
