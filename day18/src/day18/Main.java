package day18;



import java.util.Scanner;

import day18.Car;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car car = new Car("현대",20.5f);
		
		System.out.println(car.getsManufacturer());
		System.out.println(car.getfFuel());
		System.out.println(car.getfSpeed());
		System.out.println(car.getIRegistrationNum());
		
		// 시동 on
		car.switchOn();
		while(true) {
			// 가속페달 밟기
			float fRet = car.accerlate();
			// 차량 정보 출력
			car.displayCarInfo();
			if(fRet==0) {
				System.out.println("기름?");
				String a = sc.next();
				System.out.println(a);
				if(a.equals("y")) {
					System.out.println("충전할양");
					car.fillFuel(sc.nextInt());}
				else{break;}
//					break;
			}
		}
		// 시동 off
		car.switchOff();
	}

}
