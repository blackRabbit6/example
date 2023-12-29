package day123;

public class AudioTVParent {
	protected boolean power;
	protected int volumn;
	
	public AudioTVParent() {}
	public AudioTVParent(boolean power, int volumn) {
		this.power = power;
		this.volumn = volumn;
	}
	
	public boolean getPower() {return power;}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public int getVolumn() { return volumn;}
	
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
}
