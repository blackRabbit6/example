package com.acorn.intro01;

public class Review3Main {
	public enum Weekday {
		MON, TUE, WED, THU, FRI, SAT, SUN;
	}
	
	public static void main(String[] args) {
		// switch-case
		// 해당 case로 break를 만날 때까지 실행
		// 사용가능한 변수: 정수,문자,문자열		
        // break 안쓰면 그다음 break 나올때까지 게속감
		
		String day ="수";
		switch (day) {
		case "월":
			System.out.println("주중1");
			break;
		case "화":
			System.out.println("주중2");
			break;
		case "수":
			System.out.println("주중3");
			break;
		case "목":
			System.out.println("주중4");
			break;
		case "금":
			System.out.println("주중5");
			break;
		default:
			System.out.println("주말");
			break;
		}
		
		Weekday eday = Weekday.MON;
		switch(eday) {
		case MON:
			System.out.println("주중1");
			break;
		case TUE:
			System.out.println("주중2");
			break;
		case WED:
			System.out.println("주중3");
			break;
		case THU:
			System.out.println("주중4");
			break;
		case FRI:
			System.out.println("주중5");
			break;
		default:
			System.out.println("주말");
			break;
		}
	}
}
