package day14;

// 메서드 오버로딩
public class MethodMain4 {

	public static void main(String[] args) {
		overLoadingTest();
		overLoadingTest("Korean");
		overLoadingTest(2023);
		overLoadingTest("korea",2023);
	}

	public static void overLoadingTest(String string, int i) {
		System.out.println("여긴 "+ string +" 이고"+" 현재는 "+i+"년 입니다.");
		
	}

	public static void overLoadingTest(int i) {
		System.out.println("이번년도는 "+ i +"년 입니다.");
	}

	public static void overLoadingTest(String string) {
		System.out.println("안녕 난 "+ string +" 이야.");
	}

	public static void overLoadingTest() {
		System.out.println("안녕");
	}
}
