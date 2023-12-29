package abstract_class;

// 클래스내에 하나라도 추상메소드가 존재하면 추상클래스
// 예약어: abstract
// 추상메소드: 매소드 선언만 존재, 접근 제한자를 public
// 추상클래스는 직접 객체로 생성될 수 없음
// 다른 클래스가 추상클래스를 상속받아 객체를 생성
// 자식클래스에서 추상메소드와 반드시 동일한 이름의 메소드를 정의
public abstract class Shape {
	
	private String name;
	
	public Shape() {}
	public Shape(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract double area();
	public abstract double perimeter();
	
	public void draw() {
//		String info01 = (변수+"넓이= "+변수,"둘레= "+ 변수)
		String info = String.format("%s(넓이=%f, 둘레=%f)", name, area(), perimeter());
		System.out.println(info);
//		int iInfo = 1;
//		double dInfo = 1.1;
//		System.out.println(iInfo+":"+iInfo+":"+dInfo);
//		System.out.printf("%s:%d:%f",iInfo,iInfo,dInfo);
	}
}
