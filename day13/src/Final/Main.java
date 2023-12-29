package Final;


// 상수: 초기화 한번만 가능
// 상수: final 데이터타입 상수명 = 초기값
// 상수명: 대문자로 만듬.
public class Main {
	
	private static final String NAME = "tak";
	
	public static void main(String[] args) {
		int n = 1;
		final int m = 2;
		n = 2;
		
		System.out.println(n);
		System.out.println(m);
		
//		Main main = new Main();
//		System.out.println(main.NAME);
		System.out.println(NAME);
	}

}
