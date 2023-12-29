package com.acron;

import java.util.Scanner;

public class ex_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사탕 수: ");
		int i = sc.nextInt();
		System.out.print("인원: ");
		int j = sc.nextInt();
		
		System.out.println("1인당 사탕갯수: "+ (i/j)+"개");
		System.out.println("남은 사탕 개수: "+ (i%j)+"개");
		
		sc.close();
	}

}
