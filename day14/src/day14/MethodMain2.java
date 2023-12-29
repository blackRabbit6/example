package day14;


public class MethodMain2 {

	public static void main(String[] args) {
		System.out.println("메서드");
		
		double dFirst = 11.1; double dSecond = 12.1;
		// 객체
		CalcDblJar calcDblJar2 = new CalcDblJar();
		double dRet = calcDblJar2.add(dFirst,dSecond);
		System.out.println(dRet); //-> add
		dRet = calcDblJar2.subtract(dFirst,dSecond); //-> subtract
		System.out.println(dRet);
		dRet = calcDblJar2.multiply(dFirst,dSecond);; //-> multiply
		System.out.println(dRet);
		dRet = calcDblJar2.divide(dFirst,dSecond); //-> divide
		System.out.println(dRet);
		}
	
}
