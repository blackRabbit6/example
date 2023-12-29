package com.acron;

import java.util.Scanner;

public class ex_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력이랑 출력 순서지키기(바꿔쓰면 입력을 기다리며 아무것도 안뜸)
		System.out.println("이름을 입력하세요: "); 
		String name = sc.nextLine();
		
		System.out.println("성별 입력하세요(남/여): ");
		String mw =sc.nextLine();
		
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.println("키를 입력하세요: ");
		float cent = sc.nextInt();
				
		System.out.println("키 "+cent+"cm인 "+age+"살 "+ mw+ " " +name+"님 반갑습니다^^");
		
		sc.close();
	}

}
