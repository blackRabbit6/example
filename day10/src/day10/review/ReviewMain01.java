package day10.review;

import java.util.Scanner; //(1번 제외하고 다씀)

public class ReviewMain01 {

	public static void main(String[] args) {
//		//1번
//		// 변수
//		// 정수 변수 세 개 선언: 데이터타입 변수명
//		int a ;
//		int b ;
//		int c ;
//		// 선언된 세 개의 변수 중 두번째 변수에 임의의 값으로 할당
//		b = 2;
//		// 세 개의 변수를 출력
//		System.out.println(a+","+b+","+c);
		
		//2번
		// 입력된 네 개의 수가 있음 2개 실수, 2개정수
		// 네 수 검사, 5보다 작은수를 출력
//		int a = 6;
//		int b = 4;
//		double c = 7.1;
//		double d = 0.5;
//		
//		if(a<5) {
//			System.out.println(a);
//		}
//		if(b<5) {
//			System.out.println(b);
//		}
//		if(c<5) {
//			System.out.println(c);
//		}
//		if(d<5) {
//			System.out.println(d);
//		}
		//교수님 답안(내 것도 맞지만 이렇게하면 입력한 값을 만들어 출력하는시스템이 정답에 가까움)
//		Scanner sc = new Scanner(System.in);
//		int a, b;
//		double c, d;
////		boolean aF =false;
////		boolean bF =false;
////		boolean cF =false;
////		boolean dF =false;
//		System.out.print("정수를 입력: ");
//		a=sc.nextInt();
//		System.out.print("정수를 입력: ");
//		b=sc.nextInt();	
//		System.out.print("실수를 입력: ");
//		c=sc.nextDouble();
//		System.out.print("실수를 입력: ");
//		d=sc.nextDouble();
//		
//		if(a<5) { //aF =true;
//			System.out.println(a);
//		}
//		if(b<5) {
//			System.out.println(b);
//		}
//		if(c<5) {
//			System.out.println(c);
//		}
//		if(d<5) {
//			System.out.println(d);
//		}
		
		//3번
//		Scanner sc = new Scanner(System.in);
//		
//		int a, b, c;
////		int iType = 0; //1:정수로, 2:실수로
////		System.out.print("정수를 입력: ");
//		a=sc.nextInt();
////		System.out.print("정수를 입력: ");
//		b=sc.nextInt();	
////		System.out.print("정수를 입력: ");
//		c=sc.nextInt();	
////		함수명A(sc, 어떤값1, 어떤값2); // 함수명A(1)
//		TAK(sc, a, b, c); //함수 호출
//		if(a<5 || b<5 || c<5) {
//			if(a<5) { 
//				System.out.println(a);
//			}
//			if(b<5) {
//				System.out.println(b);
//			}
//			if(c<5) {
//				System.out.println(c);
//			}
//		}
//		else if(a>=5 && b>=5 && c>=5) {
//			System.out.println("5보다 작은수 없음");
//		}
		
		//교수님 답변
//		if(a<5) { 
//			System.out.println(a);
//		}	else if(b<5) {
//				System.out.println(b);
//			}	else if(c<5) {
//				System.out.println(c);
//			} else { System.out.println("5보다 작은수 없음");}
		
		
		//4번 똑같지만 배열길이 주기
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("배열 길이 입력: ");
//		int numA = sc.nextInt();
//		int[] num = new int[numA];
//		
//		for(int i=0; i<numA; i++) {
////			System.out.print("배열 값 입력: ");
//			int nums = sc.nextInt();
//			num[i]=nums;
//
//			if(num[i]<5) {
//				System.out.print(num[i]+" ");
//			}
//		}
	}
	
//	// 키 입력 처리 함수(3번-또 다른 함수)
//	public static void TAK(Scanner sc, int a, int b, int c)
//	// 변수선선 == 파라메터 지정방법 => int a
//	{
////		조건
//		int count =0;
////		if(a<5) { 
////			System.out.println(a);
////		}	else if(b<5) {
////				System.out.println(b);
////			}	else if(c<5) {
////				System.out.println(c);
////			} else { System.out.println("5보다 작은수 없음");}
//		if(a<5) { 
//			System.out.println(a);
//			count++;
//		}
//		if(b<5) {
//			System.out.println(b);
//			count++;
//		}
//		if(c<5) {
//			System.out.println(c);
//			count++;
//		} 
//		if(count ==0) { 
//			System.out.println("5보다 작은수 없음");
//			}
//		
////		명령문; 
//	}
}
