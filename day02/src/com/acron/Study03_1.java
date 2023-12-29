package com.acron;

import java.util.Scanner;

public class Study03_1 {

	public static void main(String[] args) {
		//계산기프로그램
		//메뉴
		//더하기
		//빼기
		//곱하기
		//나누기
		//종료
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		while(true) {
		System.out.println("계산기프로그램");
		System.out.println("메뉴");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("99. 종료");
		System.out.print("원하는 메뉴 선택>>");
		int iKeyValue = sc.nextInt();
		
		if(iKeyValue==99)
		{
			break;
		}
		
		if((iKeyValue != 1) && (iKeyValue != 2))
		{
			System.out.println("잘못된 메뉴를 선택하셨습니다");
			System.out.print("원하는 메뉴 다시 선택>>");
		}
		
		if(iKeyValue == 1) {
			System.out.print("첫번째 수 입력>>");
			int firstValue = sc2.nextInt();
			System.out.print("두번째 수 입력>>");
			int secondValue = sc2.nextInt();
			System.out.println("더하기 결과: "+(firstValue+secondValue));
		}else if(iKeyValue == 2){
			System.out.print("첫번째 수 입력>>");
			int firstValue = sc2.nextInt();
			System.out.print("두번째 수 입력>>");
			int secondValue = sc2.nextInt();
			System.out.println("빼기 결과: "+(firstValue-secondValue));
		}
		System.out.println("\n\n\n\n\n");
		}
		System.out.println("프로그램 실행 종료");
	}

}
