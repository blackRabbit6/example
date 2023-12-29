package Studyex;

public class FunctionPractice1 {

	public static void main(String[] args) {
		// 덧셈(add),뺄셈(sub),곱셈(mul),나눗셈(div)로 함수를 만드시오
		int num1 = 10; int num2 = 20;
		int iResult01 =0;
		iResult01 = add(num1,num2);
		System.out.print("덧셈: "+iResult01);
		
		System.out.println();
		
		int num3 = 60; int num4 = 20;
		int iResult02 =0;
		iResult02 = sub(num3,num4);
		System.out.print("뺄셈: "+iResult02);
		
		System.out.println();
		
		int num5 = 80; int num6 = 20;
		int iResult03 =0;
		iResult03 = div(num5,num6);
		System.out.print("나누기: "+iResult03);
		
		System.out.println();
		
		int num7 = 10; int num8 = 2;
		int iResult04 =0;
		iResult04 = mul(num7,num8);
		System.out.print("곱셈: "+iResult04);
	}
	
	public static int add(int num1, int num2) {
		int iResult01 = 0;
		iResult01 = num1 + num2;
		return iResult01;
	}
	
	public static int sub(int num3, int num4) {
		int iResult02 =0;
		iResult02 = num3 - num4;
		return iResult02;
	}
	
	public static int div(int num5, int num6) {
		int iResult03 = 0;
		iResult03 = num5 / num6;
		return iResult03;
	}
	
	public static int mul(int num7, int num8) {
		int iResult04 = 0;
		iResult04 = num7 * num8;
		return iResult04;
	}

}
