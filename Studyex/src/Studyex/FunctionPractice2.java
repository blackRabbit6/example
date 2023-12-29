package Studyex;

import java.util.Scanner;

public class FunctionPractice2 {

	public static void main(String[] args) {
		// 예약취소하는 함수 만드시오 예약취소= cancel
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.nextLine(); // 이름은 nextLine으로 하세요
		String cancelName = cancel(name);
		
		if(cancelName == name) {
			System.out.println(cancelName+" 님이 예약을 취소하셨습니다.");
		}else {
			System.out.println("없는 이름입니다. 다시 확인해주세요.");
		}
	}
	
	public static String cancel(String name) {
		String cancelName = null;
		String[] names = {"제이스","아트록스","아지르"};
		for(int i=0; i<names.length; i++) {
			if(names[i].equals(name)) {
				cancelName = name;
			}
		}
		return cancelName;
	}
	
}
