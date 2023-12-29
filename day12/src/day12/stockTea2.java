package day12;

import java.util.Scanner;

public class stockTea2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		stockTea1 bm = new stockTea1();

		for(int i = 0; i < 2; ++i) {
			int iCurrentStock1 = stockTea1.goodsStockProcess(
					bm.getiCurrentStock1(), 
					bm.getiProperStock1(), sc);
			bm.setiCurrentStock1(iCurrentStock1);
			
			int iCurrentStock2 = stockTea1.goodsStockProcess(
					bm.getiCurrentStock2(), 
					bm.getiProperStock2(), sc);
			bm.setiCurrentStock2(iCurrentStock2);
		}
		
		System.out.println("====================================");
		bm.printStock(
				bm.getiProperStock1(), 
				bm.getiProperStock2(),
				bm.getiCurrentStock1(),
				bm.getiCurrentStock2()
				);
		
		sc.close();
	}
}
