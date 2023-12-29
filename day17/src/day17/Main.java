package day17;

public class Main {

	public static void main(String[] args) {
		int health = 100;
		int iEffect = 0;
		
		
		boolean bRet = makeHealthFull(health); //startplay에 대해 include
		if(bRet) {
			startPlay(); 
			int iRet = showCrashEffect(iEffect);
			if(iRet ==1) {
					
				}
		}
		
		showCrashEffect(iEffect);
		
		smashCar();

		
		playCrashAudio();
		
		
	}

	private static void playCrashAudio() {
		// TODO Auto-generated method stub
		
	}


	private static void smashCar(int iType) {
		showCrashEffect(iType); 
		
	}

	private static int showCrashEffect(int iEffect) {
		if(iEffect == 0) {
			return 0;
		}else {
			return 1;
		}
		
	}

	private static boolean makeHealthFull(int health) {
		if(health == 100) {
			return true;
		}else return false;
		
	}

	private static void startPlay() {
		// TODO Auto-generated method stub
		
	}

}
