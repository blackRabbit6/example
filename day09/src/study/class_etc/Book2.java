package study.class_etc;

public class Book2 {
	// 필드(속성) 영역 - 데이터 은닉(Data Encryption)
	private String title;
	private String author;
	private String description;
	
	//생성자 영역
	public Book2() {}
	public Book2(String title, 
			String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Book(title=%s, author=%s, description=%s)"
				, this.title, this.author, this.description);
	}
	// 내부 클래스(inner class)
	public static class Bookbuilder{
		// 필드 영역
		private String title; private String author; private String description;
		// 생성자
		public Bookbuilder() {}
		// 메소드 영역
		public Bookbuilder title(String title) {
			this.title = title;
			return this;
		}
		
		public Bookbuilder author(String author) {
			this.author = author;
			return this;
		}
		
		public Bookbuilder description(String description) {
			this.description = description;
			return this;
		}
		
		public Book2 build() {
			return new Book2(this.title, this.author, this.description);
		}
	}

	public static Bookbuilder builder() {
		return new Bookbuilder();
	}
}
