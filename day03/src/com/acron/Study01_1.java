package com.acron;

public class Study01_1 {

	public static void main(String[] args) {
		// 배열 2개
		//1. 배열 2개놓은다음 숫자 입력하면 그만한 배열이 나오게 하기
//		int[] num = {1,2,3,4,5,6,7};
//		String[] alpha = {"a","b","c","d","e","f","g","a","b","c","d","e","f","g",
//				"a","b","c","d","e","f","g","a","b","c","d","e","f","g"};
//		
//		for(int i=0; i<num.length; i++) 
//		{
//			for(int j=0; j<num[i]; j++) 
//			{
//				System.out.print(alpha[j]);
//			}
//			System.out.println();
//		}
		
		//2. 숫자 넣으면 배열 나오는데 1누른 후 2누를때 1번에서 나온 배열값 빼고 나오게 하기
		int[] num = {1,2,3,4,5,6,7};
		String[] alpha = {"a","b","c","d","e","f","g","a","b","c","d","e","f","g",
				"a","b","c","d","e","f","g","a","b","c","d","e","f","g"};
		
		//풀이팁: 변수 두개 더주기 num인덱스값 뽑아놓기
		num[0]=1; num[1]=2; num[2]=3; num[3]=4; num[4]=5; num[5]=6; num[6]=7;
		int a = 0;
		
		for(int i=0; i<num.length; i++)
		{
			for(int j=a; j<(num[i]+a); j++)
			{
				System.out.print(alpha[j]);
			}
			System.out.println();
			a = a+num[i];
		}
	}

}
