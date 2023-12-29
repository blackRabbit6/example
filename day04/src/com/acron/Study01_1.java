package com.acron;

import java.util.Scanner;

public class Study01_1 {

	public static void main(String[] args) {
		// 4자리 정수 입력 
		//자리수넘어가면 자리수맞지 않음 출력
		//중복 자리 있으면 중복있다 출력
		// 자리수 4자리 중복 없음- 성공 출력
		// 앞자리(1~9)
		Scanner sc = new Scanner(System.in);
//		
		System.out.println("비번입력:");
		String pw = sc.nextLine();
		
		for(int i=0; i<pw.length(); i++)
		{
			pw.charAt(i);
		}
		
//		
//		if(pw>=1000 && pw<=9999) {
//			System.out.println("생성 성공");
//		}else {
//			System.out.println("자리수 안맞음");
//		}
//		
//		
		sc.close();
	}

}
