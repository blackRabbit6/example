package day12;

import java.util.Scanner;

public class stockTea1 {
	// 필드(속성, 변수) 영역
		private int iProperStock1; 
		private int iProperStock2;
		private int iCurrentStock1; 
		private int iCurrentStock2;	
		
		// 생성자 영역
		// 생성자 선언: public 클래스명(시그네처)
		// 생성자 정의: {}, { this.필드명 = 시그네처 필드명, ....}
		// 주의: 인자있는 생성자를 만들 경우, 기본생성자가 생성되지 않음
		// 기본 생성자: 클래스에 속한 필드가 전부 데이터타입의 기본값으로 초기화
		public stockTea1() {
			this(10, 10);
		}
		
		// 인자있는 생성자: 시그네처 넘겨진 값은 해당 값으로 초기화, 
		// 나머지는 데이터타입의 기본 값으로 초기화 된다.
		public stockTea1(int iProperStock1, int iProperStock2) {
			this.iProperStock1 = iProperStock1;
			this.iProperStock2  = iProperStock2;
		}
		
		public stockTea1(int iProperStock1, int iProperStock2, 
				int iCurrentStock1, int iCurrentStock2) {
			this.iProperStock1 = iProperStock1;
			this.iProperStock2  = iProperStock2;
			this.iCurrentStock1 = iCurrentStock2;
			this.iCurrentStock2 = iCurrentStock2;	
		}

		// OOP 특징
		// 데이터(필드)보안, 상속, 다형성
		// 메서드(함수) 영역
		// Getters/Setters 영역: 데이터 보안
		public int getiProperStock1() {
			return iProperStock1;
		}

		public void setiProperStock1(int iProperStock1) {
			this.iProperStock1 = iProperStock1;
		}

		public int getiProperStock2() {
			return iProperStock2;
		}

		public void setiProperStock2(int iProperStock2) {
			this.iProperStock2 = iProperStock2;
		}

		public int getiCurrentStock1() {
			return iCurrentStock1;
		}

		public void setiCurrentStock1(int iCurrentStock1) {
			this.iCurrentStock1 = iCurrentStock1;
		}

		public int getiCurrentStock2() {
			return iCurrentStock2;
		}

		public void setiCurrentStock2(int iCurrentStock2) {
			this.iCurrentStock2 = iCurrentStock2;
		}	
		
		// 리턴타입: int/int[], double/double[], boolean/boolean[], 개체타입
		// 정적메서드(함수) 영역: public static 리턴값의 타입 메서드명(시그네처들...)
		public static int goodsStockProcess(int iCurrentStock, int iProperStock, Scanner sc) {
			if(iCurrentStock < iProperStock) {
				iCurrentStock += (iProperStock - iCurrentStock);
			}
			System.out.print("주문하시겠습니까?>>>(1) ");
			int iInputValue = sc.nextInt();
			if(iInputValue == 1) {
				iCurrentStock = userOrderProcess(iCurrentStock, sc);
			}

			System.out.println("적정재고:" + iProperStock + "현재재고:" + iCurrentStock);	
			
			return iCurrentStock;
		}
		
		private static int userOrderProcess(int iCurrentStock, Scanner sc) {
			System.out.print("주문량을 입력하세요:>>> ");
			int iInputValue = sc.nextInt();
			iCurrentStock -= iInputValue;
			
			return iCurrentStock;
		}	
		
		// (동적)메서드(함수) 영역: public 리턴값의 타입 메서드명(시그네처들...)
		public void printStock(int iProperStock1, int iCurrentStock1, 
				int iProperStock2, int iCurrentStock2) {
			System.out.println("적정재고:" + iProperStock1 + "현재재고:" + iCurrentStock1);
			System.out.println("적정재고:" + iProperStock2 + "현재재고:" + iCurrentStock2);		
		}
}
