package z1;

//import z1.AudioTVParent;

public class AudioTVP {
	public static void main(String args[]) {
		
//		AudioTVParent AudioTV = new AudioTVParent(true, 50);
		
//		boolean power = AudioTV.getPower();
//		int volumn = AudioTV.getVolumn();
//		
//		System.out.println("power: "+ power);
//		System.out.println("volumn: "+ volumn);
//		
//		AudioTV.setPower(false);
//		AudioTV.setVolumn(30);
		
		TV objTV = new TV();
		objTV.watch();
		Audio objAudio = new Audio();
		objAudio.tune();
	}
}
