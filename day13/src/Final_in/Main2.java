package Final_in;


// 상수: 초기화 한번만 가능
// 상수: final 데이터타입 상수명 = 초기값
// 상수명: 대문자로 만듬.
public class Main2 {
	
	public static void main(String[] args) {
		Child child = new Child();
//		child.getChild01();
		System.out.println(child.getChild01());
		System.out.println(child.getParent01());
		System.out.println(child.getParent02());
		
		Child child1 = new Child(1);   
		System.out.println(child1.getChild01());
		System.out.println(child1.getParent01());
		System.out.println(child1.getParent02());
		// 이렇게 출력하면 1 0 0 나오는 이유
		//child 값을 1을 줘서 리턴 시켰기 때문
		//	child 클래스에서 값을 입력받으면 그 입력된값을 리턴 시켜주기 때문
		
		Child child2 = new Child(20, 10, 30);   
		System.out.println(child2.getChild01());
		System.out.println(child2.getParent01());
		System.out.println(child2.getParent02());
		
		System.out.println(child1.parent01);
	}

}
