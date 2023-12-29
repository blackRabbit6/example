package com.acron;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int iArraySize = 0;
//		int iOldArraySize;
//		int[] iArray;
//		//1. 사용자에게 입력 받은
//		iArraySize = sc.nextInt();
//		//2. 양의 정수만큼
//			//배열 크기를 할당
//		iArray = new int[iArraySize];
//		//3. 1부터 입력 받은 값까지
//		//배열에 저장
//		for(int i=0; i<iArraySize; i++)
//		{
//			iArray[i] =i+1;
//		}
//		//4. 출력
//		for(int i =0; i< iArraySize; i++)
//		{
//			System.out.println(iArray[i]+" ");
//		}
//		sc.close();
		
		//귤
//		String[] sArray = new String[5];
//		String sInputMsg="";
//		sArray[0]= "사과";
//		sArray[1]= "귤";
//		sArray[2]= "포도";
//		sArray[3]= "복숭아";
//		sArray[4]= "참외";
//		
//		System.out.print("좋아하는 과일: ");
//		sInputMsg = sc.nextLine();
//		for(int i=0; i< sArray.length; i++) {
//			if(sInputMsg.equals(sArray[i])) {
//				System.out.println("딩신이 좋아하는 과일: "+sArray[i]);
//			}else {
//				System.out.println(sArray[i]+"은 당신이 좋아하지 않는 과일");
//			}
//		}
		
		//문자입력
		String sInputMsg = "";
		char[] cArray;
		int iArraySize = 0;
		char cChar ='p'; int iCount = 0;
		
		System.out.print("문자열 입력: ");
		sInputMsg = sc.nextLine();
		
		iArraySize = sInputMsg.length();
		
		cArray = new char[iArraySize];
		for(int i=0; i<iArraySize; i++)
		{
			cArray[i] = sInputMsg.charAt(i);
		}
		for(int i=0; i<iArraySize; i++) {
			if(cArray[i]== cChar) iCount++;
		}System.out.println("일치하는 문자갯수: "+ iCount);
	}

}
