package study.static1;

public class Static {
	//필드 영역
	static int number1;
	int number2;
	
	//생성자
	public Static() {}
	
	//메소드
	//정적 메소드
	public static void printInfo() {
		System.out.println("number1= "+ number1);
//		System.out.println("number2= "+ number2);
	}
	
	//동적 메소드
	public void printInfo2() {
		System.out.println("number1= "+ number1);
		System.out.println("number2= "+ number2);
	}
}
