package day12;

import java.util.Scanner;

public class stock {

	public static void main(String[] args) {
		int iProperStock1 = 10; int iProperStock2 = 10;
		int iCurrentStock1 = 0; int iCurrentStock2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 2; ++i) {
			iCurrentStock1 = goodsStockProcess(iCurrentStock1, iProperStock1, sc);
			iCurrentStock2 = goodsStockProcess(iCurrentStock2, iProperStock2, sc);
		}

		stock bm = new stock();
		System.out.println("====================================");
		bm.printStock(iProperStock1, iCurrentStock1, iProperStock2, iCurrentStock2);
		
		sc.close();
		
//		int ret01 = add(10, 20);
//		int ret02 = ret01 - 5;
//		System.out.println(ret02);
		
	}

//	public static int add(int a, int b) { int c = a + b; System.out.println(c);  return c;}
	
	public void printStock(int iProperStock1, int iCurrentStock1, 
			int iProperStock2, int iCurrentStock2) {
		System.out.println("적정재고:" + iProperStock1 + "현재재고:" + iCurrentStock1);
		System.out.println("적정재고:" + iProperStock2 + "현재재고:" + iCurrentStock2);		
	}

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
	
//	private 
}

