package com.acron;

public class Study01 {

//	public static void main(String[] args) //퀵 정렬땐 사용 안함 
	//1. 최대값 찾기
//	{
//		int [] scores = { 60, 50, 95, 80, 70 };
//		int maxValue = max (scores);
//		System.out.println("Max Value = " + maxValue);
//	}
//	public static int max(int [] arrays) {
//		// Maximum initialization value is 0
//		for (int i = 0; i < arrays.length - 1; i++) {
//			if (arrays[i] > arrays[i + 1]) { // swap
//				int temp = arrays[i];
//				arrays[i] = arrays[i + 1];
//				arrays[i + 1] = temp;
//			}
//		}
//		int maxValue = arrays[arrays.length - 1];
//		return maxValue;
//	}
	
	//2. 정렬
//	{
//		int [] scores = { 60, 50, 95, 80, 70 };
//		sort (scores);
//		for (int i = 0; i < scores.length ; i++) {
//		System.out .print(scores[i] + "," );
//		}
//	}
//		public static void sort(int [] arrays) {
//			for (int i = 0; i < arrays.length - 1; i++) {
//				boolean isSwap = false ;
//				for (int j = 0; j < arrays.length - i - 1; j++) {
//					if (arrays[j] > arrays[j + 1]) {//swap
//						int temp = arrays[j];
//						arrays[j] = arrays[j + 1];
//						arrays[j + 1] = temp;
//						isSwap = true ;
//					}
//				} 
//				if (!isSwap) //No swap so terminate sorting
//				{
//					break ;
//				}
//			}
//		}
	
	//3. 최솟값 찾기
//	{
//		int [] scores = { 60, 80, 95, 50, 70 };
//		int minValue = min (scores);
//		System.out .println("Min Value = " + minValue);
//	}
//		public static int min(int [] arrays) {
//			int minIndex = 0;// the index of the minimum
//			for (int j = 1; j < arrays.length ; j++) {
//				if (arrays[minIndex] > arrays[j]) {
//					minIndex = j;
//				}
//			} 
//			return arrays[minIndex];
//		}
	
	//4. 최솟값 차례대로 정렬
//	{
//		int [] scores = { 60, 80, 95, 50, 70 };
//		sort (scores);
//		for (int score : scores) {
//		System.out .print(score + "," );
//		}
//	}
//		public static void sort(int [] arrays) {
//			for (int i = 0; i < arrays.length - 1; i++) {
//				int minIndex = i; // the index of the selected minimum
//				for (int j = i + 1; j < arrays.length ; j++) {
//					if (arrays[minIndex] > arrays[j]) {
//						minIndex = j;
//					}
//				} 
//				if (i!= minIndex) //minimum arrays[i] is swaped with the arrays[minIndex]
//					{
//					int temp = arrays[i];
//					arrays[i] = arrays[minIndex];
//					arrays[minIndex] = temp;
//					}
//			}
//		}
		
	//5. 50~90 순서로 배치
//	{
//		int [] scores = { 80, 70, 100, 60, 50, 95};
//		sort (scores);
//		for (int score : scores) {
//			System.out .print(score + "," );
//		}
//	}
//		public static void sort(int [] arrays) {
//		for (int i = 1; i < arrays.length ; i++) {
//			//Take unsorted new elements
//			int insertElement = arrays[i];
//			int insertPosition = i;
//			for (int j = insertPosition - 1; j >= 0; j--) {
//				// insertElement is shifted to the right
//				if (insertElement < arrays[j]) {
//					arrays[j + 1] = arrays[j];
//					insertPosition--;
//				}else {
//					break ;
//				}
//			}
//		//Insert the new element
//		arrays[insertPosition] = insertElement;
//			}
//		}
	
	//6. 퀵정렬
	private static void quickSort(int [] array, int low, int high) {
		if (low > high) {
			return; 
			}
			int i = low; 
			int j = high;
			int threshold = array[low];
		// Alternately scanned from both ends of the list
			while (i < j) {
		// Find the first position less than value from right to left
				while (i < j && array[j] > threshold) {
					j--;
				} //Replace the low with a smaller number than the value
				if (i < j)
					array[i++] = array[j];
				// Find the first position greater than threshold from left to right
				while (i < j && array[i] <= threshold) {
					i++;
				} //Replace the high with a number larger than the value
				if (i < j)
					array[j--] = array[i];
			}
			array[i] = threshold;
			quickSort (array, low, i - 1); // left quickSort
			quickSort (array, i + 1, high); // right quickSort
			}
		 
			public static void quickSort(int [] array) {
				if (array.length > 0) {
					quickSort (array, 0, array.length - 1);
				}
			}
			public static void main(String[] args) {
				int [] scores = { 90, 60, 50, 80, 70, 100 };
				quickSort (scores);
				for (int i = 0; i < scores.length ; i++) {
					System.out .print(scores[i] + "," );
				}
			}
	}
