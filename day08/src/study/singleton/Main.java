package study.singleton;

public class Main {

	public static void main(String[] args) {
		
//		int a;
//		int b;
//		int c;
		
		//객체 힙에 생성됩니다.(메모리): 주소값으로 표현(레퍼런스)
//		SingleTonTest singleTonTest1 = new SingleTonTest();
//		SingleTonTest singleTonTest2 = new SingleTonTest();
//		SingleTonTest singleTonTest3 = new SingleTonTest();
//
//		System.out.println(singleTonTest1);
//		System.out.println(singleTonTest2);
//		System.out.println(singleTonTest3);
		
		SingleTonTest st1 = SingleTonTest.getInstance("kht");
		System.out.println(st1);
		SingleTonTest st2 = SingleTonTest.getInstance("thk");
		System.out.println(st2);
	}

}