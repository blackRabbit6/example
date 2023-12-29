package day14;

// 메서드 오버로딩
public class MethodMain5 {

	public static void main(String[] args) {
		int iTotal = 0;
		int[] iSum = {10,20,100,200,90,70};
		for(int i=0; i<iSum.length; i++) {
			iTotal += iSum[i];
		}
		System.out.println(iTotal);
	}
}
