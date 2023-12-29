package acornFuction;

import java.util.Scanner;

public class FunctionPractice03 {

	public static void main(String[] args) {
		// 예약이름 확인 후 인원 수대로 그룹예약, 개별예약 나누며 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("성함을 입력하세요: ");
		String name = sc.nextLine();
		System.out.print("숙박하고자 하는 인원을 입력하세요: ");
		int guests = sc.nextInt();
		
		// 함수 설정
		int guestNum = 0;
		guestNum = guest(guests);
		
		if(guestNum>1) {
			System.out.println(name+" 님의 "+guestNum+"명의 그룹예약이 완료되었습니다.");
		}else if(guestNum == 1) {
			System.out.println(name+" 님의 "+guestNum+"명의 개별예약이 완료되었습니다.");
		}else {
			System.out.println("잘못된 값입니다. 다시 입력하세요.");
		}

	}
	
	// 함수 쓰기
	public static int guest(int guests){
		int guestNum = 0;
		if(guests >1) {
			guestNum = guests;
		}else if(guests == 1) {
			guestNum = 1;
		}
		return guestNum;
	}
}
