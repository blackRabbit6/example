package com.acron;

import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//중간 기말 과제 출석
		System.out.println("중간 점수: ");
		int mExam = sc.nextInt();
		System.out.println("기말 점수: ");
		int fExam = sc.nextInt();
		System.out.println("과제 점수: ");
		int hWork = sc.nextInt();
		System.out.println("출석일: ");
		int attend = sc.nextInt();	
		//평가 20 30 30 20%, 출석->20일에서 출석한날 계싼, 평가70이상 패스, 미만 or 강의30%이상 결석 fail
		if(attend>20) {
			System.out.println("다시 입력하세요");
		}else {
			System.out.println(attend+"일 출석");
		}
		double total = 0;
		total = ((mExam*0.2)+(fExam*0.3)+(hWork*0.3)+(attend));
		System.out.println(total+" 점");
		
		if(total>=70 && attend>14) {
			System.out.println("pass 하셨습니다.");
		}else if(total<70 || attend<=14) {
			System.out.println("Fail 하셨습니다.");
		}
		sc.close();
	}

}
