package study.class_inheritance;

public class Person {
	//필드 영역
	protected String name;
//	protected String address;
	
	
	// 생성자 영역
	// 기본생성자
	public Person() {
		System.out.println("Person() 생성자");
	}
	// 인자있는 생성자
	public Person(String name) {
		System.out.println("Person(String name) 생성자");
		this.name = name;
	}
	// Getter/Setters 메소드 영역
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printObject() {
		System.out.println(this);
	}
	
	
	//오버라이드(재정의) 함수: toString(): return "이름: ";
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름: "+ this.name;
	}
}
