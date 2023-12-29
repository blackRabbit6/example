package com.acron;

import java.util.Scanner; 

public class study03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iClick = 0;
		int iAPoint = 0;
		int iBPoint = 0;
		while(true) {
		//계산기 프로그램
		System.out.println("계산기 프로그램");
		//메뉴
		System.out.println("------------------메뉴------------------");
		//1.더하기
		System.out.print("-더하기- ");
		//2.빼기
		System.out.print("-빼기- ");
		//3.곱하기
		System.out.print("-곱하기- ");
		//4.나누기
		System.out.print("-나누기- ");
		//99.종료
		System.out.println("-종료-");
		//원하는 메뉴 선택>>>
		System.out.println("원하는 기능 선택>>>");
		iClick = sc.nextInt();
		
		//선택기능 이동
		//처음 숫자 입력
		System.out.println("숫자1 입력: ");
		iAPoint = sc.nextInt();
		//두번째 숫자 입력
		System.out.println("숫자2 입력: ");
		iBPoint = sc.nextInt();
		//결과 출력
		System.out.println("결과: ");
		if(iClick == 1) {
			System.out.println(iAPoint+iBPoint);
		}
		else if(iClick == 2){
			System.out.println(iAPoint-iBPoint);
		}
		else if(iClick == 3){
			System.out.println(iAPoint*iBPoint);
		}
		else if(iClick == 4){
			System.out.println(iAPoint/iBPoint);
		}
		else if(iClick == 99){
			break;			
		}else{
			System.out.println("메뉴에 없는 숫자입니다.");
		}
		
		//메뉴 이동

		}
//		sc.close();
	}

}
