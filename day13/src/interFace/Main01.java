package interFace;

public class Main01 {

	public static void main(String[] args) {
		DataBaseModule db = new OracleDataBaseModule();
		int iRet = db.insert("test");
		System.out.println(iRet);
		
		System.out.println("==================");
		
		String sRet = db.select();
		System.out.println(sRet);
		
		System.out.println(DataBaseModule.DB_VERSION);
		
		System.out.println("==================");
		
		System.out.println(DataBaseModule.add(1, 2));
		
		int iRet2 = db.add(1,2,3);
		System.out.println(iRet2);
	}

}
