package study.class_inheritance;

public class BusinessPerson extends Person {
	// 필드 영역
	private String company;
	
	// 생성자 영역
	// 기본 생성자
	public BusinessPerson() {
		System.out.println("BusinessPerson()");
	}
	
	// 인자있는 생성자
	public BusinessPerson(String company, String name) {
		super(name);
		System.out.println("BusinessPerson()");
		this.company = company;
	}
	// 메소드 영역
	// Getters/Setters 영역
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("이름: %s, 회사: %s", this.getName(), this.company);
	}
}
