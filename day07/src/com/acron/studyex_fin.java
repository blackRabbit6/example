package com.acron;

import java.util.Scanner;

public class studyex_fin {

	public static void main(String[] args) {
		// 예제 다시 풀어보기중
		//p16. 4번
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("1이상 정수: ");
//			int num = sc.nextInt();
//			if(num>0) {
//				for(int i=num; i>0; i--) {
//					System.out.print(i+" ");
//				}return;
//			}else {
//				System.out.println("1이상 정수 입력");
//			}
//		}
//	}
		
		//5번
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수: ");
//		int num = sc.nextInt();
//		int total = 0;
//		for(int i=1; i<=num; i++) {
//			total += i;
//			if(i<num) {
//				System.out.print(i+"+");
//			}else {
//				System.out.print(i+"="+total);
//			}
//		}
//	}
		////////////////////////////////////////
		//1번
//		int[] num = new int[10];
//		for(int i=1; i<=num.length; i++) {
//			System.out.print(i+" ");
//		}
//	}
		//2번
//		int[] num = new int[10];
//		for(int i=num.length; i>0; i--) {
//			System.out.print(i+" ");
//		}
//	}
		//3번
//		Scanner sc = new Scanner(System.in);
//		System.out.print("양 정수: ");
//		int num = sc.nextInt();
//		int[] nums = new int[num];
//		for(int i=1; i<=nums.length; i++) {
//			System.out.print(i+" ");
//		}
//	}
		//4번
		Scanner sc = new Scanner(System.in);
		String[] fruit = new String[5];
		fruit[0]="사과";
		fruit[1]="귤";
		fruit[2]="포도";
		fruit[3]="복숭아";
		fruit[4]="참외";
		System.out.print("좋아하는 과일");
		String fruits = sc.nextLine();
		for(int i=0; i<fruit.length; i++) {
			if(fruits.equals(fruit[i])) {
				System.out.println("내가 좋아하는 과일: "+fruit[i]);
			}else {
				System.out.println(fruit[i]+"은 그저그런 과일");
			}
		}
	}	
}
