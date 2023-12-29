package aloneStudy;

import java.util.Scanner;

public class Manager {
	public void manager() {
		Scanner sc = new Scanner(System.in);
		//Menu 판 보여주기
		while(true) {
			System.out.println("----------TAK'S STORE----------");
			System.out.println("       1. 상품목록 출력       ");
			System.out.println("        2. 재고량 추가       ");
			System.out.println("       3. 구매내역 출격       ");
			System.out.println("           4. 종료          ");
			System.out.print("원하시는 기능 입력: ");
			int functions = sc.nextInt();
			
			if(functions == 1) {
				Menu menu = new Menu();
				menu.menu();
			}else if(functions == 2) {
				Basket basket = new Basket();
				basket.basket();
			}else if(functions == 3) {
				BasketShow basketShow = new BasketShow();
				basketShow.basketShow();
			}else if(functions == 4) {
				System.out.println("프로그램 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 번호입니다. 다시 입력하세요");
				continue;
			}
			
		}
	}
}
