package study.class_etc;

public class Book {
	// 필드(속성) 영역 - 데이터 은닉(Data Encryption)
	private String title;
	private String author;
	private String description;
	
	//생성자 영역
	public Book() {}
	public Book(String title, 
			String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}
	
	// Getters/Setter 메소드 영역- 생략
	
	//메소드
	// 동적메소드 - 오버라이드 메소드
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Book(title=%s, author=%s,"
				+ "description=%s)", this.title, this.author, this.description);
	}
}
