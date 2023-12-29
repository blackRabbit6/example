package Studyex;

public class Ex9 {

	public static void main(String[] args) {
		int[] iValue = new int[100];
		iValue[0] = 10;
		for(int i=1; i<100; i++) {
			iValue[i]=iValue[i-1]+10;
		}
		for(int i=0; i<100; i++) {
			System.out.println(iValue[i]);
		}
	}

}
