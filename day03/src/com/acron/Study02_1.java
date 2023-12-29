package com.acron;

import java.util.Scanner;

public class Study02_1 {
	
	public static void main(String[] args) {
		// 요소 없는 배열 생성: 데이터타입[] 변수명 = {};	
		int[] iRandomNum = new int[100];
		int iResult01 = 0;
		int iResult02 = 0;
		// 난수발생기를 사용해 배열에 값을 할당:  반복문
		for(int i = 0; i < 100; i++)
		{
			iRandomNum[i] = (int)((Math.random()*100))+1;
		}		
		
		// 타입 지정: 1(사람), 2(컴퓨터)
		byte iType = 1;
		// 키보드 입력 객체 생성
		Scanner sc = new Scanner(System.in);
		while(true) {
			int iWinCondition = 0;
			System.out.println("메뉴");
			System.out.println("1.우승조건1");
			System.out.println("2.우승조건2");
			System.out.println("99.종료");
			System.out.println("우승조건 선택하세요:>>>");
	
			int iSelectNum = sc.nextInt();
			// 종료여부 확인
			if(iSelectNum == 99) break;
			if(iSelectNum == 1) iWinCondition = 1;
			else if(iSelectNum == 2) iWinCondition = 2;
				
			// 두 개의 숫자를 키보드 입력
			System.out.println("숫자입력1:>>>");
			int iInputVal01 = iRandomNum[sc.nextInt()];
			System.out.println("숫자입력2:>>>");
			int iInputVal02 = iRandomNum[sc.nextInt()];
			
			// 입력한 수 대소 비교
			if( (iInputVal01 - iInputVal02) >= 0) { iResult01 = iInputVal01 - iInputVal02;}
			else { iResult01 = iInputVal02 - iInputVal01;}
			
			// 두 개의 난수를 생성
			int iRanNum01 = (int)((Math.random()*100))+1;
			int iRanNum02 = (int)((Math.random()*100))+1;
			
			// 난수 대소 비교
			if( (iRanNum01 - iRanNum02) >= 0) { iResult02 = iRanNum01 - iRanNum02;}
			else { iResult02 = iRanNum02 - iRanNum01;}
			
			System.out.println("사람:" + iInputVal01 + "," + iInputVal02);
			System.out.println("컴퓨터:" + iRanNum01 + "," + iRanNum02);
			
			if(iWinCondition == 1)
			{
				// 우승조건: 두 개의 수의 차가 가장 적은 수
				if( iResult01 > iResult02 )
				{
					iType = 2;
				}				
			}
			else if(iWinCondition == 2)
			{
				if( iResult01 < iResult02 )
				{
					iType = 2;
				}	
			}
				
			// 우승 여부 출력
			if(iType == 2) System.out.println("컴퓨터 우승");
			else System.out.println("사람 우승");
			
			System.out.println("\n");
		}

		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
	}
}
