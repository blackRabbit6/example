package com.acron;

import java.util.Scanner; //3,5,6때 사용함

public class Study01_2 {

	public static void main(String[] args) {
//		int[] intArray = new int[10]; //1,2 때 사용함
		//1.1~10 순서대로 뽑기
//		for(int i=0; i<intArray.length; i++) {
//			intArray[i]=i+1;
//			System.out.print(intArray[i]);
//		}
		
		//2.역순
//		for(int i=9; i>=0; i--) {
//			intArray[i]=i+1;
//			System.out.println(intArray[i]);
//		}
		
		//3.사용자에게 입력, 배열크기 할당, 1부터 입력받은 값까지 배열에 초기화, 출력
//		Scanner sc = new Scanner(System.in);
//		int[] iArr;
//		System.out.print("양의 정수: ");
//		int size = sc.nextInt();
//		iArr = new int[size];
//		
//		for(int i=0; i<size; i++) {
//			iArr[i] = i+1;
//			System.out.println(iArr[i]);
//		}
//		sc.close();
		
//		//4. string 배열선언, 길이 5, 초기화, 사과 귤 포도 복숭아 참외 로 배열 인덱스, 귤 출력
//		String[] fruit = new String[5];
//		fruit[0]="사과"; fruit[1]="귤"; fruit[2]="포도"; fruit[3]="복숭아"; fruit[4]="참외";
//		//교수님이 하신것(출력 귤)
////		for(int i=0; i<fruit.length; i++) {
////			if(fruit[i].equals("귤")) {
////				System.out.println(fruit[i]);
////			}else {
////				System.out.println("귤 아님");
////			}
////		}
//		System.out.println(fruit[1]);
		
		//5. 문자열 입력, 문자 하나하나 배열 박아버리기(변수명.charAt())
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자 입력: ");
//		String word = sc.nextLine();
//		char[] wArr = new char[word.length()];
//		for(int i=0; i<word.length(); i++) 
//		{
//			wArr[i]= word.charAt(i);
//		}
//		//검색한문자 문자열 몇개 있는지(증감연산자) 그 위치가 어디있는지 출력
//		System.out.print("철자입력: ");
//		String spell = sc.nextLine();
//		char target = spell.charAt(0);
//		int k = 0;
//		for(int i=0; i<wArr.length; i++)
//		{
//			if(target == wArr[i]) {
//				k++;
//			}
//		}
//		System.out.println("일치 문자개수: "+ k);
//		sc.close();
		
		//6. 월~일 입력 배열 넣기, 0~6 수 입력해서 인덱스에있는 요일 가져오기, 범위에 없는 숫자쓰면 다시입력 출력
		Scanner sc = new Scanner(System.in);
		String[] day = new String[7]; //초기화 시키는 범위는 마지막인덱스+1한 값 넣어야됨
		day[0]="월"; day[1]="화"; day[2]="수"; day[3]="목"; day[4]="금"; day[5]="토"; day[6]="일";
		
		System.out.print("(0~6)숫자입력: ");
		int num = sc.nextInt();
		if(num>=0 && num<=6) {
		System.out.println(day[num]+"요일");
		}else {
			System.out.println("다시 입력하세요");
		}
		
		// 교수님이 하신거
//		System.out.print("(0~6)숫자입력: ");
//		int index = sc.nextInt();
//		System.out.println(day[index]);
		
		sc.close();
	}

}
