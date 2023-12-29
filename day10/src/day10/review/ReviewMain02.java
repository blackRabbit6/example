package day10.review;

import java.util.Scanner;

public class ReviewMain02 {

//	public static void main(String[] args) {
//		// 입력된 네 개의 수가 있습니다.
//		Scanner sc = new Scanner(System.in);
//		// 두 개는 실수, 두 개는 정수
//		int iType =1; //1: 정수 2: 실수
//		//함수명A(sc, 값1, 값2); // 함수명A(1)
//		System.out.println("입력 가능한 수 10개까지");
//		int[] iRetNumArr = Key(sc,10); //함수 호출
//		System.out.println(iRetNumArr.length);
//		// 세 개 중 하나라도 5보다 작은 수가 출력
////		if(sc instance of type) {
////			type new_name = (type) sc;
////		}
//	}
	
//	public static int [] Key(Scanner sc, int iInputCnt) //함수 선언
//	{
//		int[] iArr = new int[iInputCnt];
//		// 함수 정의
//		int iInputValue;
//		for(int i=0; i<iArr.length; i++) {
//			System.out.println("정수: ");
//			iInputValue = sc.nextInt();
//			if(iInputValue == 9999) break;
//			else iArr[i] =iInputValue;
//		}
//		return iArr;
//	}
	
	
	
	
	public static void main(String[] args) {
		// 입력된 네 개의 수가 있습니다.
		Scanner sc = new Scanner(System.in);
		// 두 개는 실수, 두 개는 정수
		//함수명A(sc, 값1, 값2); // 함수명A(1)
		int iRetNum01 = Key(sc); //함수 호출
		int iRetNum02 = Key(sc); //함수 호출
		int iRetNum03 = Key(sc); //함수 호출
		
		compareNum(iRetNum01, iRetNum02, iRetNum03);
		// 세 개 중 하나라도 5보다 작은 수가 출력
//		if(sc instance of type) {
//			type new_name = (type) sc;
//		}
	}
	
	public static int Key(Scanner sc) //함수 선언
	{
		//int -> Integar: Integer.valueOf(iInputValue);
		// double -> Double: Double.valueOf();
		// Object[] = new.Object[10]
		// Object[0] =dd
//		if (sc instanceof type) {
//			type new_name = (type) sc;
//			
//		}
		// 함수 정의
		int iInputValue; 
		System.out.print("정수: ");
		iInputValue = sc.nextInt();
		
		return iInputValue;
	}
	
	//비교 처리 함수
	public static void compareNum(int iRetNum01, int iRetNum02, int iRetNum03)
	{
		//5보다 작은 수 출력
//		if(iRetNum01<5 || iRetNum02<5 || iRetNum03<5) {
//			if(iRetNum01<5) {
//				System.out.print(iRetNum01+" ");
//			}
//			if(iRetNum02<5) {
//				System.out.print(iRetNum02+" ");
//			}
//			if(iRetNum03<5) {
//				System.out.print(iRetNum03+" ");
//			}
//		}
//		else if(iRetNum01>=5 && iRetNum02>=5 && iRetNum03>=5) {
//			System.out.println("세 수 모두 5보다 크거나 같음");
//		}
		
		//교수님
		if(iRetNum01<5) {
			System.out.println(iRetNum01+" 은 5보다 작음");
		}else if(iRetNum02<5) {
			System.out.println(iRetNum02+" 은 5보다 작음");
		}else if(iRetNum01 == 5) {
			System.out.println(iRetNum01+" 은 5와 같음");
		}else if(iRetNum02 == 5) {
			System.out.println(iRetNum02+" 은 5와 같음");
		}
		
		//최대 최소 출력
		System.out.print(iRetNum01+" ");
		System.out.print(iRetNum02+" ");
		System.out.print(iRetNum03+" ");
		if(iRetNum01>iRetNum02) {
			if(iRetNum01>iRetNum03) {
				System.out.println("최대: "+iRetNum01);
			}
			else {
				System.out.println("최대: "+iRetNum03);
			}
		}else if(iRetNum02>iRetNum03) {
			if(iRetNum02>iRetNum01) {
				System.out.println("최대: "+iRetNum02);
			}
			else {
				System.out.println("최대: "+iRetNum01);
			}
		}else {
			System.out.println("최대: "+iRetNum03);
		}
	}
	
}
