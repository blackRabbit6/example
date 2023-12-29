package Study.class01;

public class Main {

	public static void main(String[] args) {
		//객체를 선언하고 초기화: 클래스명 객체명= new 클래스명();
		Student student = new Student();
		System.out.println(student);
		
		String name = student.getSname();
		System.out.println(name);
		
		student.setSname("홍길동");
		name = student.getSname();
		System.out.println(name);
	}

}
