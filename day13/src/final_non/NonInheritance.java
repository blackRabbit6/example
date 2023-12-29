package final_non;

import Final_in.Parent;

public class NonInheritance {
	private int iNonInheri;
	
	public NonInheritance() {}
	public NonInheritance(int iNonInheri) {
		this.iNonInheri = iNonInheri;
	}
	public int getiNonInheri() {
		return iNonInheri;
	}
	public void setiNonInheri(int iNonInheri) {
		this.iNonInheri = iNonInheri;
	}
	
	public void printParentObj() {
		Parent parent = new Parent(1,2);
//		System.out.println(parent.parent01); 에러떠서 그냥 주석처리함 밑줄도 마찬가지
//		System.out.println(parent.parent02); 
		// 아까 parent02 에러난 이유: private로 되어있어서
	}
}
