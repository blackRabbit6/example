package z1;

import z1.AudioTVParent;

public class TV extends AudioTVParent{
	private int size;
	
    public TV() {
    }
    
    public TV(boolean power, int volumn, int size) {
    	super(power,volumn);
    	this.size = size;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
    	this.size = size;
    }

    public void watch() {
    	String sOnOff = power ? "Have fun" : "Switch on";
        System.out.println(sOnOff);
    }

}