package Studyex;

public class Ex10 {

	public static void main(String[] args) {
		int[] iValue = {1,2,3,4,5,6,7,8,9,10};
		for(int i =0; i<=iValue.length; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(iValue[j]);
			}
			System.out.println();
		}

	}

}
