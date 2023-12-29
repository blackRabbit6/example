package day11;

import java.util.Scanner;

public class zzzz {

	public static void main(String args[]) {
		// 적정재고 초기화(4가지) 배열 써도 됨
		int iAdjustStock1 = 10;
		int iAdjustStock2 = 10;
//		int iAdjustStock3 = 10;
//		int iAdjustStock4 = 10;
		// 현재재고 초기화(4가지)
		int iCurrentStock1 = 0;
		int iCurrentStock2 = 0;
//		int iCurrentStock3 = 0;
//		int iCurrentStock4 = 0;
		
		Scanner sc = new Scanner(System.in);
		// 반복문(10)
		for(int i = 0; i<10; i++) 
		{
			// 현재재고와 적정재고 확인
			// 현재재고가 적정재고보다 작은지
			if(iCurrentStock1 < iAdjustStock1) 
			{
				// 적정재고와의 차이만큼 현재 재고를 보충
				//iCurrentStock1= iAdjustStock1+(iAdjustStock1-iCurrentStock1);
				iCurrentStock1 -= (iAdjustStock1-iCurrentStock1);
			}
			// 사용자 주문 시뮬레이셔(랜덤을 사용)
			int iCustomerOrderQty = (int)(Math.random()*iAdjustStock1);
				// 현재재고 - 사용자 주문량
			iCurrentStock1 -= iCustomerOrderQty;
			// 출력, 적정재고, 현재재고
			System.out.println("적정재고: "+iAdjustStock1+ "현재재고:%d"+iCurrentStock1);
			
			if(iCurrentStock2 < iAdjustStock2) 
			{
				iCurrentStock2 -= (iAdjustStock2-iCurrentStock2);
			}
			
			iCustomerOrderQty = (int)(Math.random()*iAdjustStock2);
			iCurrentStock2 -= iCustomerOrderQty;
			System.out.println("적정재고: "+iAdjustStock2+ "현재재고:%d"+iCurrentStock2);
			// 입력대기(Thread.sleep(1000))
			System.out.println("계속할려면 아무키나 누르세요...");
			sc.nextLine();
		}
		// 최종적인 출력: 적정재고, 현재재고
		System.out.println("적정재고:" + iAdjustStock1 + 
				"현재재고:" + iCurrentStock1);
		System.out.println("적정재고:" + iAdjustStock2 + 
				"현재재고:" + iCurrentStock2);
		sc.close();
		
	}
}
