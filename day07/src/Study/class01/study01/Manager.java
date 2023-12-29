package Study.class01.study01;

public class Manager {
	// 필드(속성) 영역(변수 선언)
	 int iEmpNo;
	 String sEmpName;
	 double dSalary;
	
	// 기본 생성자
	public Manager() {}
	
	//인자있는 생성자
	public Manager(int iEmpNo, String sEmpName, double dSalary) {
		this.iEmpNo = iEmpNo;
		this.sEmpName = sEmpName;
		this.dSalary = dSalary;
	}
	
	//메소드 영역 - 동적 메소드
	public double getReturnTax(double ratio) {
		double dRetResult = 0;
		dRetResult = (dSalary*ratio);
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
