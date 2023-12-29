package study.main;

import study.class_etc.Book;

// 정적필드(속성), 정적메소드: 클래스명.필드, 클래스명,메소드명
//(동적)필드, (동적)메소드: 클래스명.객체명 = new 클래스명();
// String name;
// if(name != null) { System.out.println(); }
public class Main {

	public static void main(String[] args) {
		
		Book book = new Book(
				"꿀벌의 예언1",
				" 베르나르베르베르 ",
				"인류의 미래를 둘러싸고 펼쳐지는 대모험"
				);
		
		System.out.println(book.toString());
		System.out.println(book);
	}

}
