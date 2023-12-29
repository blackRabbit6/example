package Studyex;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가격을 입력하시오: ");
		int count = sc.nextInt();
		System.out.println("등급을 입력하시오: ");
		String grade = sc.next();
		
		if(grade.equals("VIP")) {
			double finalCount = count - (count*0.1);
			System.out.println("고객님이 내셔야되는 금액: "+finalCount+"원");
		}else if(grade.equals("회원")) {
			double finalCount = count - (count*0.05);
			System.out.println("고객님이 내셔야되는 금액: "+finalCount+"원");
		}else if(grade.equals("비회원")) {
			int finalCount = count;
			System.out.println("고객님이 내셔야되는 금액: "+finalCount+"원");
		}

	}

}
