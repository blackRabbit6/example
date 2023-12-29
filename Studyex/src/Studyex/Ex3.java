package Studyex;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// 객실예약, 예약부서 주요업무 나누기
		//그룹예약, 개별예약 배열 만들기
		Scanner sc = new Scanner(System.in);
		String[] groupList = new String[10];
		String[] aloneList = new String[10];
		
		while(true) {
			System.out.println("1. 예약접수");
			System.out.println("2. 예약명단");
			System.out.println("3. 예약확인서");
			System.out.println("4. 종료");
			System.out.print("1/2/3/4 중 사용하실 기능입력: ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: 
				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("숙박인원: ");
				int people = sc.nextInt();
				
				if(people>1) {
					System.out.print("그룹예약");
					System.out.println();
					for(int i=0; i<groupList.length; i++) {
						if(groupList[i] == null) {
							groupList[i]=name;
							break;
						}
					}
				}else if(people == 1) {
					System.out.print("개별예약");
					System.out.println();
					for(int i=0; i<aloneList.length; i++) {
						if(aloneList[i] == null) {
							aloneList[i]=name;
							break;
						}
					}
				}
				break;
			case 2:
				// 명단 출력할때 반복문이랑 조건문 써야 출력됨
				// 그냥 출력하면  [Ljava.lang.String;@26ba2a48 이런 에러뜸
				System.out.print("그룹예약명단: ");
				for(String groupName : groupList) {
					if(groupName != null) {
						System.out.print(groupName+" ");
					}
				}
				System.out.println();
				System.out.print("개별예약명단: ");
				for(String aloneName : aloneList) {
					if(aloneName != null) {
						System.out.print(aloneName+" ");
					}
				}
				System.out.println();
				break;
			case 3:
				System.out.print("이름을 입력해주세요: ");
				String names = sc.next();
				boolean findGroupList = false;
				boolean findAloneList = false;
				
				for(String groupName : groupList) {
					if(groupName != null && groupName.equals(names)) {
						findGroupList = true;
						break;
					}
				}
				for(String aloneName : aloneList) {
					if(aloneName != null && aloneName.equals(names)) {
						findAloneList = true;
						break;
					}
				}
				// (findGroupList? "그룹예약" : "개별예약")
				// 여기서 findGroupList? 란 조건부연산자 사용하는 표현
				// 조건(findGroupList) 평가 후 참일때 와 거짓을때 다른 값 반환
				// 위 ()에서 그룹예약은 참일때 나오는 값이고, 개별예약은 거짓일때 나오는 값이다.
				if(!findGroupList && !findAloneList) {
					System.out.println("명단에 없는 이름입니다. 다시 입력하세요");
				}else {
					System.out.println("1. 팩스");
					System.out.println("2. 이메일");
					System.out.print("1/2 중 보내야될 유형을 선택하시오: ");
					int nums = sc.nextInt();
					if(nums == 1) {
						System.out.println(names+" 님에게 팩스로 "+ (findGroupList? "그룹예약" : "개별예약") +" 확인서를 보냈습니다.");
					}else if(nums == 2) {
						System.out.println(names+" 님에게 이메일로 "+ (findGroupList? "그룹예약" : "개별예약") +" 확인서를 보냈습니다.");
					}
				}
				break;
			case 4:
				System.out.println("종료");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("다시 입력");
			}
		}
	}
}
