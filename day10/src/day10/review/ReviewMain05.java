package day10.review;

import java.util.Scanner;

public class ReviewMain05 {

	public static void main(String[] args) {
		// 배열: 같은 타입의 요소값을 저장하는 변수
		// 하나이상의 요소값을 하나의 변수로 저장
		// 문법
		// 선언: 데이터타입[] 배열변수명;
		// 최기화: 배열변수 = new 데이터타입[사이즈];->사이즈>0
		// 값을 대입: 배열변수명[위치값]
		// 값을 추출: int iArrValue = 배열변수명[위치값];
		
		// 키보드에서 생성하고자 하는
		// 배열 사이즈를 받아 배열 생성 - 정수
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 길이 입력: ");
		int iArrSize = sc.nextInt();
		dynamicMakeArr(sc,iArrSize);
		//배열 가운데 위치에 키보드 입력 받은
		//값을 저장
		sc.close();
	}
	
	public static void dynamicMakeArr(Scanner sc, int iArrSize) {
		int[] iArr = new int[iArrSize];
		int halfIdz = iArrSize/2;
		System.out.print("입력배열 값: ");
		int k = (iArrSize-1)/2;
		int iValue= sc.nextInt();
		iArr[halfIdz] = iValue;
		//입력한 값을 출력
		System.out.println(iArr[halfIdz-1]+":"+iArr[halfIdz]+":"+iArr[halfIdz+1]);
	}
	
}
