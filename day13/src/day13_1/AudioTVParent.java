package day13_1;

public class AudioTVParent {
	private boolean power;
    private int volumn;
    
    public AudioTVParent() {}
    	
    public AudioTVParent(boolean power, int volumn) {
    	this.power = power;
    	this.volumn = volumn;
    }
    
    public boolean getPower() { return power; }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getVolumn() { return volumn; }
    
    public void setVolumn(int volumn) {
    	this.volumn = volumn;
    }
}
