package com.acron;

import java.util.Scanner; //scanner함수 쓸려면 이거 넣기

public class Study02_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//교수님 버전
		//과목별 과락(별)점수 지정
		int idropMarginPoint = 60;
		int iSumDropPoint = 160;
		int iAvgDropPoint = 60;
//		//과목별 입력 점수 저장
		int iAPoint = 0;
		int iBPoint = 0;
		int iCPoint = 0;
		//합산 평균 점수 저장
		int iSumPoint = 0;
		int iAvgPoint = 0;
		//임의의 과목 3개에 대해 각각의 점수를 입력받음
		System.out.println("A과목:>");
		iAPoint = sc.nextInt();
		System.out.println("B과목:>");
		iBPoint = sc.nextInt();
		System.out.println("C과목:>");
		iCPoint = sc.nextInt();
		//모든 점수를 합산
//		iSumPoint = iAPoint+iBPoint+iCPoint;
		//모든 점수 평균 구함
		iAvgPoint = (iAPoint+iBPoint+iCPoint)/3;
		//합산 점수의 합격/불합격 여부 결정
//		if(iSumPoint>iSumDropPoint) System.out.println("합격: 합산점수초과");
//		else System.out.println("불합격: 합산점수미만");
		//평균 점수 합 불
		if(iAvgPoint>iAvgDropPoint) System.out.println("합격: 평균점수초과");
		else System.out.println("불합격: 평균점수미만");
		//과락 기준 합 불
//		if((iAPoint > idropMarginPoint)&&(iBPoint> idropMarginPoint)&&(iCPoint>idropMarginPoint))
//			System.out.println("합격: 과락점수없음");
//		else System.out.println("불합격: 과락점수존재");
		sc.close();
	}
	// 총점에 따른 합격여부
	public static void passTotalScore(int iAPoint,int iBPoint,int iCPoint, int passLine) {
		int iSumPoint = 0;
		iSumPoint = iAPoint+iBPoint+iCPoint;
		if(iSumPoint>passLine) System.out.println("합격: 합산점수초과");
		else System.out.println("불합격: 합산점수미만");
	}
	
	//평균에 따른 합격여부
	public static void passAvg(int iAvgPoint, int passLine) {
		if(iAvgPoint>passLine) System.out.println("합격: 평균점수초과");
		else System.out.println("불합격: 평균점수미만");
	}
	// 과락에 따른 합격여부
	public static void passDrop(int iAPoint,int iBPoint,int iCPoint, int passLine) {
		if((iAPoint > passLine)&&(iBPoint> passLine)&&(iCPoint>passLine))
			System.out.println("합격: 과락점수없음");
		else System.out.println("불합격: 과락점수존재");
	}

}
