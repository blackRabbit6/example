package day14;

// 메서드 오버로딩
public class MethodMain7 {

	public static void main(String[] args) {
		int[] iMaxArr = {5,10,30,20,4};
		int[] iMinArr = {100,94,92,99,101};
		
		int iMaxVal = 0;
		int iMinVal = 0;
		
		iMaxVal = getFindMaxVal(iMaxArr);
		iMinVal = getFindMinVal(iMinArr);
		
		System.out.println("최댓값: "+iMaxVal);
		System.out.println("최솟값: "+iMinVal);
	}

	public static int getFindMinVal(int[] iMinArr) {
		int iMinVal = iMinArr[0];
		for(int y : iMinArr) {
			if(iMinVal > y) {
				iMinVal = y;
			}
		}
		return iMinVal;
	}

	public static int getFindMaxVal(int[] iMaxArr) {
		int iMaxVal = iMaxArr[0];
		for(int x : iMaxArr) {
			if (iMaxVal < x) { //if(int i =0; i<iMaxArr.length; i++){ 뜻과 같음
				iMaxVal = x;
			}
		}
		return iMaxVal;
	}
	
}
