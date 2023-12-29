package com.acorn.finals;

public class Add {

	public static void main(String[] args) {
		int iFirst1; int iSecond1;
		iFirst1 = 10;
		iSecond1 = 20;
		int iResult1;
		iResult1 = add(iFirst1, iSecond1);
		System.out.println("덧셈: "+iResult1);

	}
	public static int add(int iFirst1, int iSecond1){
		int iResult1;
		iResult1 = iFirst1 + iSecond1;
		return iResult1;
	}

}
