package com.acron;

public class Study01 {

	public static void main(String[] args) {
		//인공지능 뒤에 숫자 오는데 숫자 차례대로 나오기
//		for (int i=1; i<4; i++) {
//			System.out.println("인공지능 "+i);
//		}
		
		
		//2개 배열 
		int[] iCountArr = {1,2,3,4,5,6,7};
		char[] cInfoArr = {'a','b','c','d','e','f','g','a','b','c','d','e','f','g'
				,'a','b','c','d','e','f','g','a','b','c','d','e','f','g'};
		
		int iStartIndex = 0; //2번때 사용
//		int endIndex = 0; //2번때 사용
		
		iCountArr[0]=1; iCountArr[1]=2; iCountArr[2]=3; iCountArr[3]=4; 
		iCountArr[4]=5; iCountArr[5]=6; iCountArr[6]=7; //2번때 사용
		
		for(int i=0; i<iCountArr.length; i++)
		{
			//1 내가 한거(숫자 넣으면 배열 나오게 하기)
//			for(char j=0; j<i; j++) 
//			{	
//				
//				System.out.print(cInfoArr[j]);
//			}
//			System.out.println();
			
			//정답
//			for(int j=0; j<iCountArr[i]; j++) 
//			{
//				System.out.print(cInfoArr[j]);
//			}
//			System.out.println();
			
			//2 배열 (하다가 1넣으면 a 2넣으면 bc나오게 하기)
			for(int j=iStartIndex; j<(iCountArr[i]+iStartIndex); j++) 
			{
				System.out.print(cInfoArr[j]);
			}
			System.out.println();
			
			iStartIndex = iStartIndex + iCountArr[i];
		}
	}

}
