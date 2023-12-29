package Studyex;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		// 가
		int[] num = {1,2,3,4,5};
		System.out.println(Arrays.toString(num));
		// 배열 전체 출력 syso 안에 Arrays.toString(변수명)
		System.out.println("=============================");
		// 나
		int[] num1 = {1,2,3,4,5,6,7,8,9,10};
		num1 = new int[10];
		System.out.println("==============================");
		// 다
		num1[5] = 11;
		for(int i=0; i<6; i++) {
			System.out.print(num1[i]+" ");
		}
		System.out.println();
		System.out.println("==============================");
		
		// 라
		// 에러 이유: 문제에서 제시한 배열의 길이는 6인데 
		// 7,8 번째 요소를 넣을려고 하면 배열길이가 넘어간다라는 에러가뜸
		// Index 6 out of bounds for length 6 
		// 에러가 떴기 때문에 주석처리 함
		
//		double[] num2 = new double[6];
//		num2[5] = 40.1;
//		num2[6] = 50.1;
//		num2[7] = 60.1;
//		for(int i =5; i<8; i++) {
//			System.out.print(num2[i]);
//		}
		
		// 바
		// 반복문 안에 조건문 넣어서 4단어 넣고 출력 시키기 
		String[] sArray = new String[4];
		for(int i=0; i<4; i++) {
			if(i==0) {
				sArray[i] ="korea";
			}
			else if(i==1) {
				sArray[i] ="england";
			}
			else if(i==2) {
				sArray[i] ="japan";
			}
			else {
				sArray[i] = "china";
			}
			System.out.print(sArray[i]+" ");
		}
	}
}
