package acornFuction;

import java.util.ArrayList;
import java.util.Scanner;



public class HotelReservation {

	public static void main(String[] args) {
		// 호텔 예약, 예약확인, 예약변경 ,블랙리스트
		while(true) {
			System.out.println("-------------------------");
			System.out.println("1. 예약");
			System.out.println("2. 에약 확인");
			System.out.println("3. 예약 내용변경");
			System.out.print("원하시는 메뉴를 선택하세요: ");
			Scanner sc = new Scanner(System.in);
			int menuNum = sc.nextInt();
			ArrayList<String> nameArray = new ArrayList<>(); // String[] nameArray = {}; 이건 배열을 초기화 할뿐 추가 불가함
			ArrayList<Integer> guestsArray = new ArrayList<>(); 
			// int 대신 integer 쓰는이유: ArrayList의 제네릭 타입은 참조형(Reference Types)만 허용
			// 그래서 데이터 타입인 int는 사용불가
			ArrayList<Integer> guestsGroupArray = new ArrayList<>(); 
			
			
			if(menuNum == 1) {
				System.out.print("이름: ");
				String name = sc.nextLine();
				sc.nextLine();
				nameArray.add(name);
				System.out.print("숙박 인원: ");
				int guests = sc.nextInt();
				sc.nextLine();
				if(guests >1) {
					guestsGroupArray.add(guests);
				}
				else if(guests == 1) {
					guestsArray.add(guests);
				}
				System.out.println(name+"님의 예약이 완료되었습니다.");
				
			}
			else if(menuNum == 2) {
				System.out.print("이름: ");
				String name = sc.nextLine();
				sc.nextLine();
				if(nameArray.contains(name)) {
					int index = nameArray.indexOf(name);
					if(guestsGroupArray.contains(index)) {
						int size = guestsGroupArray.get(index);
						System.out.println(name+" 님은 "+size+"명의 그룹예약이 되어있습니다.");
					}else if(guestsArray.contains(index)) {
						System.out.println(name+" 님은 1명 개인예약이 되어있습니다.");
					}
				}
				else {
					System.out.println("예약이 되어있지 않은 손님이십니다.");
				}
			}
		}
		
	}

}
