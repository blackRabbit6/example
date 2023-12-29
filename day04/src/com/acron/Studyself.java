package com.acron;

import java.util.Scanner;

public class Studyself {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1입력: ");
		int N = sc.nextInt();
		System.out.print("정수2입력: ");
		int X = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i]= sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<N; i++) {
			if(arr[i]<X) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}

