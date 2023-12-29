package day13_1;

public class Main {
	public static void main(String[] args) {
//		TVChild objTV1 = new TVChild(false, 10, 20);
////		objTV.watch();
//		System.out.println(objTV1);
		
//		TVChild objTV2 = new TVChild(false, 10, 20);
//		System.out.println(objTV2);
		
		// 아래 있는거 있으면 위에 있는거랑 같은 뜻이라 삭제 가능
		TVChild[] objArr1 = new TVChild[2];
		objArr1[0] = new TVChild(false, 10,20);
		objArr1[1] = new TVChild(true, 20, 30);
		
		AudioChild[] objArr2 = new AudioChild[10];
		objArr2[0] = new AudioChild(true,10);
		
//		objTV1=objTV2;
//		objTV1=objChild;
//		
		
		// 다형성(polymorphism)
		// 여러 데이터타입의 자식 객체를 부모타입으로 부를 수 있음
		AudioTVParent objParent1 = new TVChild(true,30,40);
		AudioTVParent objParent2 = new AudioChild(true, 10);
		// 부모는 자식의 래퍼런스를 저장하는 것이 가능: 배열 가능
		AudioTVParent[] objArr = new AudioTVParent[2];
		objArr[0] = new TVChild(true,30,40);
		objArr[1] = new AudioChild(true, 10);
		// 부모는 자신의 영역에 있는 필드나 메소드만 접근 가능: 제한사항
		TVChild objTv = (TVChild)(objArr[0]);
		objTv.watch();
		AudioChild objAudio = (AudioChild)(objArr[0]);
		objAudio.tune();
	}
}
