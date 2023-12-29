package Studyex;

import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		// 과제3: 가,나의 차이
		// 가. if(조건식){명령문 1,...,n;}
		// 나. if(조건식){명령문 1,...,n;}else{ 명령문1,....,n;}
		// '가'는 조건식이 참일때만 명령문을 출력하고 끝이지만
		// '나'는 조건식이 참이면 참일때 출력되는 명령문이 출력되고
		// 조건식이 참이 아니라면 거짓이고 거짓일때 출력되는 명령문이 출력되어
		// '가'와 '나'의 차이로는 조건문에서 오류가 났을때 바로 눈에 띌수있는 차이가 있다고 생각함
		
		// 과제4
		int[] nums = {5,3,1,4,2,7,6,9,8,10};
		// 1~5 비교연산자
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				if(nums[i]>nums[j]) {
					int change = nums[i];
					nums[i]=nums[j];
					nums[j]=change;
				}
			}
		}
		// 6~10 논리연산자
		for(int i=5; i<10; i++) {
			for(int j=i+1; j<10; j++) {
				boolean a = nums[i] % 2 ==0;
				boolean b = nums[j] % 2 ==0;
				if((a && b && nums[i]>nums[j]) || (!a && !b && nums[i]>nums[j])) {
					int change = nums[i];
                    nums[i] = nums[j];
                    nums[j] = change;
				}
			}
		}
		for(int num: nums) {
			System.out.print(num+" ");
		}
	}

}
