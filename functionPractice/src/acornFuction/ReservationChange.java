package acornFuction;

import java.util.Scanner;

public class ReservationChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객 이름: ");
		String name = sc.nextLine();
		String changeName = reservationChange(name);
		if(changeName == name) {
			System.out.println(changeName+" 님이 예약을 취소하셨습니다.");
		}else {
			System.out.println("명단에 없는 고객입니다.");
		}
	}
	
	public static String reservationChange(String name) {
		String changeName = null;
		String[] list = {"탁창우"};
		for(int i=0; i<list.length; i++) {
			if(list[i].equals(name)) { //.equals() 이거는 () 안에 있는 값이 .앞에 있는 배열 값이있는지 보는것, changeName하고 name하고 위치 바뀌면 안됨 
				changeName = name;
			}
//			if(list[i] == name) {
//				changeName = name;
//			}
		}
		return changeName;
	}

}
