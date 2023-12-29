package Class;

public class class1 {
	
	// 필드 생성
	private String hName;
	private String sAddr;
	private int iAvaRoom;
	private int employNum;
	
	// 생성자 영역
	public class1() {}
	public class1(String hName,String sAddr,int iAvaRoom, int employNum) {
		this.hName = hName;
		this.sAddr = sAddr;
		this.iAvaRoom = iAvaRoom;
		this.employNum = employNum;
	}
	//메소드
	// Getters/Setters 영역
	public String gethName() {
		return hName;
	}
	public void sethName(String hName) {
		this.hName = hName;
	}
	public String getsAddr() {
		return sAddr;
	}
	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}
	public int getiAvaRoom() {
		return iAvaRoom;
	}
	public void setiAvaRoom(int iAvaRoom) {
		this.iAvaRoom = iAvaRoom;
	}
	public int getEmployNum() {
		return employNum;
	}
	public void setEmployNum(int employNum) {
		this.employNum = employNum;
	}
	
	// 정적메소드 영역: 접근제한자 리턴 값 메소드명(인자1,인자2)
	
	// (동적) 메소드 영역: 접근 제한자 static 리턴값 메소드명(인자1,인자2...)
	// 예약
	public void reser() {
		// 1 빈 방 확인(조건)
		// 2 빈방-예약방 변경- 방 상태변경(전체-예약방)
	}
	// 체크인
	public void checkIn() {
		// 1 고객확인
		// 2 결제
	}
	// 체크아웃
	public void checkOut() {
		// 1 고객확인
		// 2 예약방-빈방 변경
	}
}
