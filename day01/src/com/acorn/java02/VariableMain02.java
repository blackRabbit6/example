package com.acorn.java02;

public class VariableMain02 {

	public static void main(String[] args) {
		// 강제(명시적) 전환
		// (데이터타입)
		// int testData = 200;
		// short testData2;
		// testData2 = (short)testData;
		// byte-> 256크기임, 담을수있는크기->127~(-128)
		byte byteNumber = 0;
		short shortNumber = 128;
		byteNumber = (byte)shortNumber;
		System.out.println(byteNumber);
		
//		byte byteNumber1 = 0;
//		short shortNumber1 = 255;
//		byteNumber1 = shortNumber1;
//		System.out.println(byteNumber1);
//		int number = 123;
		
		int intNum = 20;
		intNum = intNum + 1;
		intNum += 1;
	}

}
