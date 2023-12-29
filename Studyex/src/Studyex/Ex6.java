package Studyex;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님이 내신 금액: ");
		int money = sc.nextInt();
		
		if(money<120000) {
			if(money<=114000) {
				if(money<=108000) {
					System.out.println("고객님이 내신 금액은 'VIP' 요금입니다.");
				}
			}else {
				System.out.println("고객님이 내신 금액은 '회원' 요금입니다.");
			}
		}else {
			System.out.println("고객님이 내신 금액은 '비회원' 요금입니다.");
		}

	}
	
}
