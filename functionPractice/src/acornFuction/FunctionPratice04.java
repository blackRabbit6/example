package acornFuction;

import java.util.Scanner;

public class FunctionPratice04 {

	public static void main(String[] args) {
		// 블랙리스트 인원 
		Scanner sc = new Scanner(System.in);
		System.out.print("성함을 입력하세요: ");
		String name = sc.nextLine();
		// 함수변수 선언 String 초기화 = null
		String blackListName = null;
		blackListName = blackList(name);
		
		if(name == blackListName) {
			System.out.println(blackListName+" 님은 블랙리스트 명단에 있습니다. 죄송하지만 나가주시길 바랍니다.");
		}else {
			System.out.println(name+" 님 환영합니다. 무엇을 도와드릴까요?");
		}

	}
	// 함수 선언
	public static String blackList(String name){
		String blackListName = null;
		String[] blackLists = {"세주아니", "마스터이", "베인"};
		for(int i=0; i<blackLists.length; i++) {
			if(blackLists[i].equals(name)) {
				blackListName = name;
			}
		}
		return blackListName;
	}
	
}
