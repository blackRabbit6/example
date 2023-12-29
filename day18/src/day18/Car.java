package day18;

public class Car {
	// 필드
	private String sManufacturer;  //null
	private float fFuel; // 0.0
	private float fSpeed; //0.0
	private int IRegistrationNum; // 0
	private boolean bRunning; // false 주행여부
	
	// 생성자 영역
	public Car() {}
	public Car(String sManufacturer, float fFuel) {
		this.sManufacturer = sManufacturer;
		this.fFuel = fFuel;
	}
	
	public String getsManufacturer() {
		return sManufacturer;
	}
	public void setsManufacturer(String sManufacturer) {
		this.sManufacturer = sManufacturer;
	}
	public float getfFuel() {
		return fFuel;
	}
	public void setfFuel(float fFuel) {
		this.fFuel = fFuel;
	}
	public float getfSpeed() {
		return fSpeed;
	}
	public void setfSpeed(float fSpeed) {
		this.fSpeed = fSpeed;
	}
	public int getIRegistrationNum() {
		return IRegistrationNum;
	}
	public void setIRegistrationNum(int iRegistrationNum) {
		IRegistrationNum = iRegistrationNum;
	}
	public boolean isbRunning() {
		return bRunning;
	}
	public void setbRunning(boolean bRunning) {
		this.bRunning = bRunning;
	}
	// 메소드 영역
	public void switchOn() {
		bRunning = true;
	}
	
	public void switchOff() {
		bRunning = false;
	}
	
	public float accerlate() {
		// 속도 변화
		if(!bRunning) return 0.f;
		if (fSpeed >= 300) {fSpeed += 300;} else {
			fSpeed +=20;}
		
		if(fFuel > 0.f) { fFuel -= 1.0;
			if(fFuel<0) {fFuel = 0.f; _break();}
		}
		return fFuel;
	}
	
	public void _break() {
		// 속도 변화
		fSpeed  =0.f;
	}
	
	public void fillFuel(float fFloat) {
		fFuel += fFloat;
	}
	
	public void displayCarInfo() {
		System.out.println("연료"+fFuel);
		System.out.println("속도"+fSpeed);
	}
}
