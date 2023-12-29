package com.acron;

public class Study {
	//코드 입력파트1
	
	public static void main(String[] args) 
	{
//		// 코드 입력파트2
//		// 일반 변수 선언(초기화) 숫자,문자열
//		byte bNumber = 0; //1 byte    //-128~127 숫자
//		System.out.println(bNumber);
//		
//		short sNumber = 0;
//		System.out.println(sNumber);
//		
//		int iNumber = 0; //4byte
//		System.out.println(iNumber);
//		
//		sNumber = (short)iNumber;
//		
//		long lNumber = 0;
//		System.out.println(lNumber);
//		
//		float fNumber = 0.0F;
//		System.out.println(fNumber);
//		
//		char cChar='c';
//		System.out.println(cChar);
//		
//		String str ="str";
//		System.out.println(str);
//		
//		//특수 변수
//		byte[] bNumberArr = {1, 2, 3, 4, 5};
//		System.out.println(bNumberArr.length);
//		int size = bNumberArr.length;
//		System.out.println(bNumberArr[3]);
//		System.out.println(bNumberArr[size-2]);
		
//		//조건문: if/switch-case
//		if(조건문) {		}
//		else {			}
//		
//		if(조건식) {}
//		else if(조건식){}
//		else {}
//		//1~10
//		int[] iNumberArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int iIndex = 0;
//		
//		if(iNumberArr[iIndex] % 1 == 0){
//			System.out.println("1의 배수");
//		} else if(iNumberArr[iIndex] % 2  == 0){
//			System.out.println("even");
//			if(iNumberArr[iIndex] % 4  == 0){
//				System.out.println("4의 배수");
//			} else if(iNumberArr[iIndex] % 6  == 0) {
//				System.out.println("6의 배수");
//			} else if(iNumberArr[iIndex] % 8  == 0) {
//				System.out.println("8의 배수");
//			} else if(iNumberArr[iIndex] % 10 == 0) {
//				System.out.println("10의 배수");
//			} else {
//				System.out.println("2의 배수");
//			}			
//		}
//		else if(iNumberArr[iIndex] % 3  == 0){
//			System.out.println("3의 배수");
//		}
//		else if(iNumberArr[iIndex] % 5  == 0){
//			System.out.println("5의 배수");
//		}
//		else if(iNumberArr[iIndex] % 7  == 0){
//			System.out.println("7의 배수");
//		}
//		else if(iNumberArr[iIndex] % 9  == 0){
//			System.out.println("9의 배수");
//		}
//		
//		iIndex++;
//		
		//반복문:for((선언된 변수를)초기화; 조건식; 증감값){}
		
//		for(int i=1; i<=10; i++){ System.out.print(i+" ");}
//		System.out.println("출력완료");
//		System.out.print("출력완료");
		
		//구구단	
//		for(int i=2; i<10; i++) {
//			System.out.print(i + ": ");
//			for(int j=1; j<10; j++) {
//				System.out.print((i*j)+ " ");
//				}
//			System.out.println();
//		}
//		System.out.println("구구단 종료");
		 
//		printVerifyNumber(iIndex);
//		iIndex++;
//		printVerifyNumber(iIndex);
//		iIndex++;
//		printVerifyNumber(iIndex);
//		iIndex++;
//		printVerifyNumber(iIndex);
//		iIndex++;
//		printVerifyNumber(iIndex);
//		iIndex++;
		
		//별
	for(int i=1; i<=5; i++) {
//			if(i == 1) System.out.println(" ");
//			if(i == 2) System.out.println("  ");
//			if(i == 3) System.out.println("   ");
//			if(i == 4) System.out.println("     ");
//			if(i == 5) System.out.println("      ");
			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
			}
//			System.out.println();
		}
	
		int[] iEvenOddCountArr = {0,0};
//		iEvenOddCountArr[0]: 짝수 개수, [1]:홀수 개수
		int iWhileValue = 1;
		while(iWhileValue <= 30) {
//			System.out.println(iWhileValue); 쓰면 숫자 세로로 쭉나옴
			iWhileValue++; //루프탈출 위한 변수
			
			//짝수 홀수 갯수 출력
			if(iWhileValue % 2 == 0) {
				iEvenOddCountArr[0]++;
			}else {
				iEvenOddCountArr[1]++;
			}
		}
		System.out.println("짝수갯수: "+iEvenOddCountArr[0]);
		System.out.println("홀수갯수: "+iEvenOddCountArr[1]);
//		
	}
	
//	//코드 입력파트3
//	public static void printVerifyNumber(int iIndex) {
//		int[] iNumberArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		if(iNumberArr[iIndex] == 1) {
//			System.out.println(iNumberArr[iIndex]+"1이요");
//		}
//		if(iNumberArr[iIndex] % 2  == 0){
//		System.out.println("even");
//		if(iNumberArr[iIndex] % 4  == 0){
//			System.out.println("4의 배수");
//		} else if(iNumberArr[iIndex] % 6  == 0) {
//			System.out.println("6의 배수");
//		} else if(iNumberArr[iIndex] % 8  == 0) {
//			System.out.println("8의 배수");
//		} else if(iNumberArr[iIndex] % 10 == 0) {
//			System.out.println("10의 배수");
//		} else {
//			System.out.println("2의 배수");
//		}			
//	}
//	else if(iNumberArr[iIndex] % 3  == 0){
//		System.out.println("3의 배수");
//	}
//	else if(iNumberArr[iIndex] % 5  == 0){
//		System.out.println("5의 배수");
//	}
//	else if(iNumberArr[iIndex] % 7  == 0){
//		System.out.println("7의 배수");
//	}
//	else if(iNumberArr[iIndex] % 9  == 0){
//		System.out.println("9의 배수");
//	}
//	}
}
