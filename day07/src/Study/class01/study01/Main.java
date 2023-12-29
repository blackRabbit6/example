package Study.class01.study01;
//ODP
// 객체(개체:object): new 생성자()
// 클래스:필드(속성)+생성자+메소드
// 인스턴스(Instance)
// 클래스 선언(정의)
// [수식어] class 클래스명{}
public class Main {
//여기 꼭 알아야됨
	public static void main(String[] args) { //Employee에 필드 부분에 private 쓰니 에러뜸
//		Employee employee = new Employee();
//		System.out.println(employee);
//		System.out.println(employee.iEmpNo);
//		System.out.println(employee.sEmpName);
//		System.out.println(employee.dSalary);
		
		Employee employee1 = new Employee(1,"홍길동",1000.0);
//		System.out.println(employee1);
//		System.out.println(employee1.iEmpNo);
//		System.out.println(employee1.sEmpName);
//		System.out.println(employee1.dSalary);
		
		double dRet = employee1.getReturnTax(0.075);
		System.out.println("회수세금: "+dRet);
		
		dRet = employee1.getReturnTax(0.075,1);
		System.out.println("회수세금: "+dRet);
		
		
//		Manager manager = new Manager(10, "홍길동관리자", 5000.0);
//		dRet = manager.getReturnTax(0.2);
//		System.out.println("회수세금: "+dRet);
	}

}