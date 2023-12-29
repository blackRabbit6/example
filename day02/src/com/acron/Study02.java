package com.acron;

import java.util.Scanner; //scanner함수 쓸려면 이거 넣기

public class Study02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("국어점수:>>>");
		int nlpoint = sc.nextInt();
		System.out.println("영어점수:>>>");
		int elpoint = sc.nextInt();
		System.out.println("수학점수:>>>");
		int mapoint = sc.nextInt();
		
		// 평균+총합
		int total = nlpoint+elpoint+mapoint;
		System.out.println("전체 점수의 합:" + total);
		int aver = (total / 3);
		System.out.println("세과목 평균: "+ aver);
		if(total>=200 && aver>=70) {
			System.out.println("합격");
		}else if(total>=200 || aver<70)
		{
			System.out.println("평균 불합격");
		}else if(total<200 || aver>=70)
		{
			System.out.println("점수 불합격");
		}
		else {
			System.out.println("평균,점수 불합격");
		}
		
		//과락
		if(nlpoint>=70 && elpoint>=70 && mapoint>=60) {
			System.out.println("과락 없음");
		}else {
			System.out.println("과락 불합격");
		}
		
		sc.close();
	}
	//통지
	public static void toavg(int total, int aver) {
		if(total<200 || aver<70) {
			System.out.println("둘다 안되서 귀하는 우리 학교에 불합격하셨습니다");
		}
	}
}
