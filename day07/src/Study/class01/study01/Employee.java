package Study.class01.study01;

public class Employee {
	// 필드(속성) 영역(변수 선언)
	// 이곳에서 잘 쓰고 변수도 알잘딱깔샌으로 해야 메인부분에서 에러가 안생김
	 private int iEmpNo;
	 private String sEmpName;
	 private double dSalary;
	
	 // 클래스를 작성할 때 생성자를 만들지 않으면
	 // 자바 컴파일러가 기본생성자를 자동으로 생성
	 // 생성자 리턴타입이 없고 클래스이름과 동일
	// 기본 생성자:필드값을 필드의 데이터 타입 기본값을 초기화
	public Employee() {}//this(); {}안에 넣어도 됨
	

	//인자있는 생성자
	public Employee(int iEmpNo, String sEmpName, double dSalary) {
		this.iEmpNo = iEmpNo;
		this.sEmpName = sEmpName;
		this.dSalary = dSalary;
	}
	
	//Getters/Setters 메소드
	public int getiEmpNo() { return iEmpNo;	}
	public void setiEmpNo(int iEmpNo) {	this.iEmpNo = iEmpNo; }

	public String getsEmpName() { return sEmpName; }
	public void setsEmpName(String sEmpName) {	this.sEmpName = sEmpName; }

	public double getdSalary() { return dSalary;	}
	public void setdSalary(double dSalary) { this.dSalary = dSalary; }
//	dRetResult = ((dSalary*12)+(dSalary*1.13))*ratio;
	//메소드 영역 - 동적 메소드

/**
 * 
 * @param ratio
 * @param type
 * @return
 */
//	public double getReturnTaxPerMonth(double ratio,int type) {
//		//tax 금액 계산
//		//변수 선언
//		double dRetResult = 0.0;
//		//리턴텍스 계산 dSalary*0.075
//		//else 쓰면 에러 잘뜰수도 잇음, 쓸데없는 조건 없게하기
//		dRetResult = (dSalary*ratio);
//
//		//계산된 결과를 변수에 저장
//		//return 변수명
//		return dRetResult;
//	}
	
	//메서드 오버로딩
	public double getReturnTax(double ratio) {
		//tax 금액 계산
		//변수 선언
		double dRetResult = 0.0;
		//리턴텍스 계산 dSalary*0.075
		//else 쓰면 에러 잘뜰수도 잇음, 쓸데없는 조건 없게하기
					dRetResult = (dSalary*12)*ratio;
		//계산된 결과를 변수에 저장
		//return 변수명
		return dRetResult;
	}
	//메서드 오버로딩
	public double getReturnTax(double ratio,int months) {
		//tax 금액 계산
		//변수 선언
		double dRetResult = 0.0;
		//리턴텍스 계산 dSalary*0.075
		//else 쓰면 에러 잘뜰수도 잇음, 쓸데없는 조건 없게하기
		if(months ==12)
			dRetResult = ((dSalary*12)+(dSalary*1.13))*ratio;
		else if((months>=1)&&(months<12))
			dRetResult = (dSalary*12)*ratio;
		//계산된 결과를 변수에 저장
		//return 변수명
		return dRetResult;
	}
	
//	// Getter/Setter
//	public int getEmpNo() { return iEmpNo; }
//	public void setEmpNo(int empNo) { this.iEmpNo = empNo; }
//
//	public String getsEmpName() { return sEmpName; }
//	public void setsEmpName(String sEmpName) { this.sEmpName = sEmpName; }
//
//	public double getdSalary() { return dSalary; }
//	public void setdSalary(double dSalary) { this.dSalary = dSalary; }
}
