package study.class_inheritance.test;

public class TestMain {

	public static void main(String[] args) {
		Test1 test1 = new Test1(20,30);
		Test2 test2 = new Test2(10,60);
		
		int a = test1.getA();
		int b = test1.getB();
		int c = test2.getC();
		int d = test2.getD();
		
//		System.out.println("Test1 클래스의 필드값: "+ a+":"+b);
//		System.out.println("Test2 클래스의 필드값: "+ c+":"+d);

		test1.setA(c);
		test1.setB(d);
		a = test1.getA();
		b = test1.getB();
		test2.setC(a);
		test2.setD(b);
		c = test2.getC();
		d = test2.getD();
		System.out.println("Test1 클래스의 필드값: "+ a+":"+b);
		System.out.println("Test2 클래스의 필드값: "+ c+":"+d);
	}

}
