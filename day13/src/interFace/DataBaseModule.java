package interFace;

// 자바 버전에 따른 변화
// 1. JDK7
// ~public static final 필드(상수필드)
// ~public abstract 메서드(추상메서드)
// 2. JDK8
// ~public static final 필드(상수필드)
// ~public abstract 메서드(추상메서드)
// ~public default 메서드
// ~public static 메서드
// 3. JOK 9
//~public static final 필드(상수필드)
//~public abstract 메서드(추상메서드)
//~public default 메서드
//~public static 메서드
// ~private static 메서드
public interface DataBaseModule {
	// public static final int DB_VERSION = 1;
	// ~JDK 7
	int DB_VERSION = 1;
	
	// 추상메소드
	// public abstract int insert(String s)
	int insert(String s);
	
	// public abstract String select()
	String select();
	
	//JDK 8~
	public static int add(int a, int b) {
		int iRet = subAdd(a,b);
//		int iRet = a + b;
		return iRet;
	}
	
	default int add(int a, int b, int c) {
		int iRet = a+b+c;
		return iRet;
	}
	
	// JDK 9~
	private static int subAdd(int a, int b) {
		return a+b;
	}
}
