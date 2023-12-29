package day10.review;

import java.util.Scanner;

//반복문
//for(초기값; 조건식; 증감값)
public class ReviewMain06 {

	public static void main(String[] args) {
		
		// 키보드에서 생성하고자 하는
		// 배열 사이즈를 받아 배열 생성 - 정수
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 길이 입력: ");
		int iArrSize = sc.nextInt();
		int[] iArr01 = new int[iArrSize];
		int[] iArr02 = new int[iArrSize];
		System.out.println("배열값: ");
		int iValue = sc.nextInt();
		// iArr02를 반복문 이용해 짝수 인덱스 값을 저장
//		for(int i=0; i<iArr02.length; i++) {
//			if(i%2==0) {
//				iArr02[i] = iValue;
//			}
//		}
		dynamicMakeArr(iArr01,iArr02);
		sc.close();
	}
	
	public static void dynamicMakeArr(int[] iArr01, int[] iArr02) {
		// iArr02 -> iArr01: 같은 위치(짝수 인덱스)
		for(int i=0; i<iArr01.length; i++) {
			if(i%2==0) {
				iArr01[i]=iArr02[i];
			}
		}
		// iArr01 -> iArr02: 엇갈린 위치(짝수->홀수)
		for(int i=0; i<iArr01.length; i++) {
			if(i%2==0) {
				if(i>0) {
				iArr01[i-1]=iArr02[i];
				}
			}
		}
		
	}
	
}
