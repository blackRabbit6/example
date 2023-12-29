package Studyex;

public class Ex1 {

	public static void main(String[] args) {
		// 함수안에는 오로지 명령문 만 존재
		////가
		int a = 5;
		int b = 5;
		System.out.println(a+b);
		
		double c = 4.1;
		double d=  5.9;
		System.out.println(c+d);
		
		String e = "안";
		String f = "녕";
		System.out.println(e+f);
		
		System.out.println("=================================");
		// 나
		int num1 = 6;
		int num2 = 3;
		double divNum;
		divNum = num1/num2;
		System.out.println(divNum);
		
		double num3 = 3.9;
		double num4 = 1.3;
		double divNum2 = num3/num4;
		int resultNum = (int) divNum2; 
		//그냥 double이 아닌 int를 쓰면 에러가 나기때문에
		// int 새로운 변수 = (int) double변수명 
		System.out.println(resultNum);
		
		System.out.println("=================================");
		// 다
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE+1);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MAX_VALUE+1);
		
	}

}
