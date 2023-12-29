package Study.class01.study01;

public class Main01 {

	public static void main(String[] args) {
		//변수 선언과 동시에 초기화
		//사원번호, 사원이름, 월급
		//1안(리턴세금 = 월급*비율;
		//System.out.println("회수세금: "+ 리턴세금);

		int iEmpNo=2;
		String sEmpName="홍길동";
		double dSalary=2000.0;
		double dRetTax=0.0;
		double dRatio=0.075;
		
		//1안(리턴세금 = 월급*비율;
		dRetTax = dSalary * dRatio;
		System.out.println("회수세금: "+dRetTax);
		//2안
		dRatio = 0.09;
		dRetTax = getReturnTaxStatic(dSalary, dRatio);
		System.out.println("회수세금: "+dRetTax);
		//3안
		Main01 main01 =new Main01();
		dRatio =0.1;
		dRetTax = main01.getReturnTaxDynamic(dSalary,dRatio);
		System.out.println("회수세금: "+ dRetTax);
	}
	//2번
	
	public static double getReturnTaxStatic(double dSalary, double dRatio) {
		double dRetTax = dSalary * dRatio;
		return dRetTax;
	}
	//3번
	public double getReturnTaxDynamic(double dSalary, double dRatio) {
		double dRetTax = dSalary * dRatio;
		return dRetTax;
	}
}

