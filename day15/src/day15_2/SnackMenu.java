package day15_2;

import java.util.Scanner;

public class SnackMenu {
	private Scanner sc;
	private SnackController snackControler;
		
	public void menu() {
		sc = new Scanner(System.in);
		snackControler = new SnackController();
		// 스낵류를 입력하세요
		System.out.println("스낵류를 입력하세요");
		// 종류:
		System.out.print("종류: ");
		String kind = sc.next();
		// 이름:
		System.out.print("이름: ");
		String name = sc.next();
		// 맛:
		System.out.print("맛: ");
		String flavor = sc.next();
		// 개수:
		System.out.print("개수: ");
		int numOf = sc.nextInt();
		// 가격:
		System.out.print("가격: ");
		int price = sc.nextInt();
		
		
		Snack i = snackControler.saveData(kind, name, flavor, numOf, price);
		
		System.out.print(i.getKind()+"("+i.getName()+" - "+i.getFlavor()+") "+i.getNumOf()+"개 "+(i.getPrice()*i.getNumOf())+"원");
		
		
	}
}
