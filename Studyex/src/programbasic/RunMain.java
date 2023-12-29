package programbasic;

public class RunMain {

	public static void main(String[] args) {
//		GeneralClass objClass = new GeneralClass();
//		System.out.println(objClass.add(10,20)); // 1 
//		objClass.add(10,20); // 2
		
//		int iFirst, iSecond;
//		iFirst = 10; iSecond = 20;
//		int iResult01;
//		iResult01 = iFirst + iSecond;
//		System.out.println("덧셈: "+iResult01);
		
		GeneralClass objClass = new GeneralClass();
		System.out.println(objClass.add(10,20));
		
//		int iThird, iFourth;
//		iThird = 20; iFourth = 10;
//		int iResult02;
//		iResult02 = iThird - iFourth;
//		System.out.println("뺄셈: "+iResult02);

		System.out.println(objClass.sub(20,10));
		
//		int iFifth, iSixth;
//		iFifth = 10; iSixth = 20;
//		int iResult03;
//		iResult03 = iFifth * iSixth;
//		System.out.println("곱셈: "+iResult03);
		
		System.out.println(objClass.mul(10,20));
		
//		double iSeventh, iEigth;
//		iSeventh = 10.0; iEigth = 20.0;
//		double iResult04;
//		iResult04 = iSeventh / iEigth;
//		System.out.println("나눗셈: "+iResult04);
		
		System.out.println(objClass.div(20,10));
		
		
	}

}
