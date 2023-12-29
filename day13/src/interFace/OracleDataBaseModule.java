package interFace;

public class OracleDataBaseModule implements DataBaseModule {

	@Override
	public int insert(String s) {
		System.out.println("Oracle Insert "+s);
		return 1; //true로 해도 되는데 모든 int를 boolean로 해야되서 불필요!
	}

	@Override
	public String select() {
		String sRet = "Oracle select result";
		return sRet;
	}

}
