package com.acron;

import java.util.Scanner;

public class ex_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//char string 차이 -> char는 1개의 내용물제한 String은 무제한
		System.out.println("문자열을 입력하세요: ");
		String i = sc.nextLine();
		
		//substring()-> 인덱스 값 그 이후문자열만 나오게끔 한다. 인덱스 0부터1까지라고 칠려면 콤마 "," 쓴다
		System.out.println("첫번째문자"+i.substring(0,1));
		System.out.println("두번째문자"+i.substring(1,2));
		System.out.println("세번째문자"+i.substring(2,3));
		System.out.println(i.substring(7));
		
		sc.close();
	}

}
