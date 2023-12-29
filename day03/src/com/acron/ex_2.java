package com.acron;

import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) { //while문을 써야 break 정상작동(오류 안나옴)
		System.out.println("메뉴");
		System.out.println("1. 더하기"); 
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("99. 종료");
		System.out.println("원하는 기능 입력");
		int click = sc.nextInt();
		
		//종료, 오류 메세지
		if(click == 99) {
			System.out.println("시스템 종료");
			break;
		}
		else if((click<1) || (click>4)) {System.out.println("다시 선택하세요"); continue;}
		//수 입력
		System.out.println("첫 번째 정수: ");
		int i = sc.nextInt();
		System.out.println("두 번째 정수: ");
		int j = sc.nextInt();
		
		//기호 밑 결과
		if(click == 1) {
			System.out.println("더하기 결과: "+ (i+j));
		}
		else if(click == 2)
		{
			System.out.println("빼기 결과: "+(i-j));
		}
		else if(click == 3)
		{
			System.out.println("곱하기 결과: "+(i*j));
		}
		else if(click == 4)
		{
			System.out.println("나누기 결과: "+(i/j));
		}
		
		sc.close();
		}
	}

}
