package com.acorn.java02;

public class VariableMain04 {

	public static void main(String[] args) {
		int number = 10;
		System.out.println("1: "+ (number==100));
		System.out.println("2: "+ (number!=100));
		
		int score = 50;
		int mean = 55;
		System.out.println("3: "+ (score>=40));
		System.out.println("4: "+ ((score>=40)||(mean>=60)));  // ||또는
		System.out.println("5: "+ ((score>=40)&&(mean>=60)));  // &&그리고
		
//		if(조건식) {}
//		else {}
		//삼항산 연산자
		int total = 49;
		String result = (total >= 50) ? "합격" : "불합격";
		System.out.println(result);
	}

}
