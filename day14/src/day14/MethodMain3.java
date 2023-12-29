package day14;

public class MethodMain3 {

	public static void main(String[] args) {
		countdown(10);
	}

	public static void countdown(int count) {
		if(count <= 0) {
			System.out.println("count는 0보다 커야 합니다.");
			return;
		}
		
		for(int i = count; i>=0; i--) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}
