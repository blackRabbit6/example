package day1212;

import day123.AudioTVParent;

public class Audio extends AudioTVParent{
	
    public Audio() {
    }

    public Audio(boolean power, int volumn) {
    	this.power = power;
    	this.volumn =volumn;
    	
    }

    public void tune() {
    	String sOnOff = power ?  "ha ha ha..." : "turn it on";
        System.out.println(sOnOff);
    }

}