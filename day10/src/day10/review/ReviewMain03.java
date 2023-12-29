package day10.review;

import java.util.Scanner;

public class ReviewMain03 {

	public static void main(String[] args) {

		// 입력된 네 개의 수가 있습니다.
		Scanner sc = new Scanner(System.in);
		// 두 개는 실수, 두 개는 정수
		//함수명A(sc, 값1, 값2); // 함수명A(1)
		int iRetNum01 = Key(sc); //함수 호출
		int iRetNum02 = Key(sc); //함수 호출

		compareNum(iRetNum01, iRetNum02);
		
//		int a = 0;
//		
//		int[] iArr = new int[10];
//		iArr[0] = 1;
//		A[] objArr = new A[10];
		Object[] objObArr = new Object[10];
//		int i
//		double d
//		
//		int -> Integer
//		double -> Double
//		Object[0] = Integer.valueOf(i);
//		Object[1] = d
//				
//		if (objObArr instanceof type) {
//			type new_name = (type) objObArr;
//			
//		}
	}
	
	public static int Key(Scanner sc) {
		int iInputValue; 
		System.out.print("정수: ");
		iInputValue = sc.nextInt();
		
		return iInputValue;
	}
	
	public static void compareNum(int iRetNum01, int iRetNum02)
	{
		if(iRetNum01<5) {
			System.out.println(iRetNum01+" 은 5보다 작음");
		}else if(iRetNum02<5) {
			System.out.println(iRetNum02+" 은 5보다 작음");
		}else if(iRetNum01 == 5) {
			System.out.println(iRetNum01+" 은 5와 같음");
		}else if(iRetNum02 == 5) {
			System.out.println(iRetNum02+" 은 5와 같음");
		}
	}
}
