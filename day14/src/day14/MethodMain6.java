package day14;

// 메서드 오버로딩
public class MethodMain6 {

	public static void main(String[] args) {
		int[] iSum = {10,20,100,200,90,70};
		int total = total(iSum);
		System.out.println(total);
	}

	public static int total(int[] iSum) {
		int total =0;
		for(int i=0; i<iSum.length; i++) {
			total += iSum[i];
		}
		return total;
	}
	
}
