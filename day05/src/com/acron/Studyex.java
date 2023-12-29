package com.acron;

import java.util.Scanner;

public class Studyex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 이름 성별 나이 키 출력
//		System.out.print("이름: ");
//		String name = sc.nextLine();
//		System.out.print("성별(남/여): ");
//		String gen = sc.nextLine();
//		System.out.print("나이: ");
//		int age = sc.nextInt();
//		System.out.print("키: ");
//		float hei = sc.nextFloat();
//		
//		System.out.println("키"+hei+" cm 인 "+age+"살 "+name+" 님 반갑습니다^^");
		
		//2. 정수 두개 입력 계산값 출력
//		System.out.print("첫 정수 입력:");
//		int a = sc.nextInt();
//		System.out.print("두번째 정수 입력:");
//		int b = sc.nextInt();
//		
//		System.out.println("더하기 결과 "+(a+b));
//		System.out.println("빼기 결과 "+(a-b));
//		System.out.println("곱하기 결과 "+(a*b));
//		System.out.println("나누기 결과 "+(a/b));
		
////////////////////////////////////////////////////////////////////////////////
		
		//1. 키보드 입력후 정수가 양수이면 '양수' 아니면 '아니다' 출력
//		System.out.print("정수: ");
//		int i = sc.nextInt();
//		if(i>0) {
//			System.out.println("양수다");
//		}else {
//			System.out.println("양수가 아니다");
//		}
		
		//2. 3번 문제 동일+0이면 0이다 출력
//		System.out.print("정수: ");
//		int i = sc.nextInt();
//		if(i>0) {
//			System.out.println("양수다");
//		}else if(i<0){
//			System.out.println("음수다");
//		}else {
//			System.out.println("0이다");
//		}
		
		//3번 정수 중 짝수면 '짝수' 홀수면 '홀수'출력
//		System.out.print("정수: ");
//		int i = sc.nextInt();
//		if(i%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
		
		//4번 사탕고루고루 인원 사탕수 입력 1인당 사탕수 남은 사탕수 출력
//		System.out.print("인원 수: ");
//		int peo = sc.nextInt();
//		System.out.print("사탕 개수: ");
//		int candy = sc.nextInt();
//		
//		System.out.println("1인당 사탕 개수: "+(candy/peo));
//		System.out.println("남는 사탕 개수: "+(candy%peo));
		
		//5번 변수 값 입력 M 누르면 남자 아니면 여자
//		System.out.print("이름: ");
//		String name = sc.nextLine();
//		System.out.print("학년(숫자만): ");
//		int grade = sc.nextInt();
//		System.out.print("반(숫자만): ");
//		int classNum = sc.nextInt();
//		System.out.print("번호(숫자만): ");
//		int num = sc.nextInt();
//		System.out.println("성별(M/F): ");
//		String gen = sc.next();
//		System.out.println("성적(소주점 아래 둘째자리까지): ");
//		float score = sc.nextFloat();
//		if(gen=="M") {
//			gen ="남학생";
//		}else {
//			gen ="여학생";
//		}
//		System.out.println(grade+"학년 "+classNum+"반 "+num+"번 "+name+" "+gen+" 의 성적은 "+score+"이다.");
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//1. 메뉴 출력후 메뉴 번호 클릭해서 뽑은 메뉴 출력
//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("7. 종료");
//		
//		System.out.print("메뉴 번호를 입력하세요: ");
//		int menu = sc.nextInt();
//		if(menu == 1) {
//			System.out.println("입력 메뉴입니다.");
//		}else if(menu == 2) {
//			System.out.println("수정 메뉴입니다.");
//		}else if(menu == 3) {
//			System.out.println("조회 메뉴입니다.");
//		}else if(menu == 4) {
//			System.out.println("삭제 메뉴입니다.");
//		}else if(menu == 7) {
//			System.out.println("프로그램이 종료됩니다.");
//		}
		
		//2. 키보드 정수 입력, 양수+짝수="짝수",짝수아니면"홀수",양수 아니면 "양수 입력"
//		System.out.print("숫자 한 개를 입력하세요: ");
//		int i = sc.nextInt();
//		
//		if(i>0 && i%2==0) {
//			System.out.println("짝수다");
//		}else if(i>0 && i%2!=0) {
//			System.out.println("홀수다");
//		}else {
//			System.out.println("양수만 입력하세요.");
//		}
		
		//3. 국 영 수 점수 입력, 합계 평균 계산, 합/불 처리기능
		//합 기준 세과목 다 40점 이상 평균 60이상+과목별 점수 출력
		//불 불합격 통보
//		System.out.print("국어점수: ");
//		int ko = sc.nextInt();
//		System.out.print("영어점수: ");
//		int en = sc.nextInt();
//		System.out.print("수학점수: ");
//		int ma = sc.nextInt();
//		
//		int total = (ko+en+ma);
//		float aver = (total/3);
//		
//		if((ko>=40)&&(en>=40)&&(ma>=40)&&(aver>=60))
//		{
//			System.out.println("국어 : "+ko);
//			System.out.println("수학 : "+ma);
//			System.out.println("영어 : "+en);
//			System.out.println("합계 : "+total);
//			System.out.println("평균 : "+aver);
//			System.out.println("축하합니다, 합격입니다");
//		}else {
//			System.out.println("불합격입니다.");
//		}
		
		//반대 조건
//		if((ko<40)||(en<40)||(ma<40)||(aver<60))
//		{
//			System.out.println("불합격입니다.");
//		}else {
//			System.out.println("국어 : "+ko);
//			System.out.println("수학 : "+ma);
//			System.out.println("영어 : "+en);
//			System.out.println("합계 : "+total);
//			System.out.println("평균 : "+aver);
//			System.out.println("축하합니다, 합격입니다");
//		}
		
		
		//4. if-> switch문으로 봄 여름 가을 겨울 출력
//		System.out.print("1~12 사이의 정수 입력: ");
//		int i = sc.nextInt();
//		
//		switch(i) {
//		case 12: case 1: case 2:
//			System.out.println(i+"월은 겨울입니다");
//			break;
//		case 3: case 4: case 5:
//			System.out.println(i+"월은 봄입니다.");
//			break;
//		case 6: case 7: case 8:
//			System.out.println(i+"월은 여름입니다.");
//			break;
//		case 9: case 10: case 11:
//			System.out.println(i+"월은 가을입니다.");
//			break;
//		default:
//			System.out.println(i+"월은 잘못 입력된 달입니다.");
//		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//1. 정수 입력, 1부터 그 수까지 모두 출력(1미만 나오면 "1이상 수 입력")
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		if(num>0) {
//			for(int i=1; i<(num+1); i++) {
//				System.out.print(i+" ");
//			}
//		}else {
//			System.out.println("1이상의 숫자를 입력해주세요.");
//		}
//		
//		sc.close(); //여기 전까지 sc.close(); 입력하세요. 다 써야되서 일부러 하나만 쓰면서 내려옴
		
		//2. 1번 동일+ 이상 수 입력하면 다시 돌아가서 누를수있게, sc.close 사용안함
		//(while 문 사용+ if 문안 for문 밖에 리턴해서 else에관련된것이 안나오게 하기)
//		while(true) { //while문을 맨 처음에 써야 0을 누르면 한번만 출력됨 다른곳에 쓰면 엄청 나옴
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			int num = sc.nextInt();
//				if(num>0) {
//					for(int i=1; i<(num+1); i++) {
//						System.out.print(i+" ");
//					}return;
//					}else {
//						System.out.println("1이상의 숫자를 입력해주세요.");
//					}
//		}
		
		//3. 1번 동일 이지만 거꾸로 출력
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		if(num>0) {
//			for(int i=num; i>=1; i--) {
//				System.out.print(i+" ");
//			}
//		}else {
//			System.out.println("1이상의 숫자를 입력해주세요.");
//		}
//		sc.close();
		
		//4. 3번 동일+다시 돌아오게(1미만 누르면) sc.close 사용안함
//		while(true) {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			int num = sc.nextInt();
//			if(num>0) {
//				for(int i=num; i>=1; i--) {
//					System.out.print(i+" ");					
//				}return;
//			}else {
//				System.out.println("1이상의 숫자를 입력해주세요.");
//			}
//		}

		//5. 1부터 받은 값의 합 나오게 하기
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		int sum=0;
//		for(int i=1; i<=num; i++) {
//			sum += i;
//			if(i<num) {
//				System.out.print(i+"+");
//			}else {
//				System.out.print(i+"="+sum);
//			}
//		}
//		sc.close();
		
///////////////////////////////////////////////////////////////////////////////
		
		//1. 길이10인 배열 선언 1~10 순서대로 배열 인덱스에 넣고 사용
//		int[] num = new int[10];
//		for(int i=1; i<=num.length; i++) {
//			System.out.print(i+" ");
//		}
		
		//2. 1번과 동일 but 역순
//		int[] num = new int[10];
//		for(int i=num.length; i>=1; i--) {
//			System.out.print(i+" ");
//		}
		
		//3.배열 크기 입력후 주기,초기화도
//		System.out.print("양의 정수: ");
//		int big = sc.nextInt();
//		int[] num = new int[big];
//		for(int i=1; i<=big; i++) {
//			System.out.print(i+" ");
//		}
//		sc.close();
		
		//4. 길이 5인 string배열 선언 
		//과일 5개 초기화 배열 인덱스로 귤 출력
//		String[] fruit = new String[5];
//		fruit[0]="사과";
//		fruit[1]="귤";
//		fruit[2]="포도";
//		fruit[3]="복숭아";
//		fruit[4]="참외";
//		System.out.println(fruit[1]);
		
		//5. 문자열 하나나 하나 배열에 넣고 
		//검색할 문자 문자개수, 몇번째 인덱스 위치하는지 출력
//		System.out.print("문자열: ");
//		String str = sc.next();
//		char[] sArr = new char[str.length()];
//		for(int i=0; i<str.length(); i++) {
//			sArr[i] =str.charAt(i);
//		}
//		System.out.print("문자: ");
//		String spell = sc.next();
//		char target = spell.charAt(0);
//		int k =0;
//		System.out.print("인덱스: ");
//		for(int i=0; i<sArr.length; i++) {
//			if(target==sArr[i]) {
//				System.out.print(i+" ");
//				k++;
//			}
//		}
//		System.out.println(); //안쓰니 같은 줄에 나옴
//		System.out.println(spell+" 일치 문자 개수: "+k);
//		sc.close();
		
		//6. 월~일 문자열 배열 넣고 숫자 넣어 인덱스 값출력 없는 인덱스 넣으면 잘못입력 출력
//		String[] day = {"월","화","수","목","금","토","일"};
//		System.out.print("0~6까지 숫자 입력: ");
//		int num = sc.nextInt();
//		if(num>0 && num<=6) {
//			System.out.println(day[num]);
//		}else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		//7. 정수 입력-배열 길이, 각각 인덱스 부여 밑 초기화
//		System.out.print("정수: ");
//		int num = sc.nextInt();
//		int[] nums = new int[num];
//		int sum =0;
//		for(int i=0; i<num; i++) {
//			System.out.print("배열"+i+"번째 인덱스에 넣을 값: ");
//			int k = sc.nextInt();
//			nums[i]= k;
//			sum += k;
//		}
//		//for(int a:b): b요소를 a넣겠다~
//		for(int number : nums) {
//			System.out.print(number+" ");
//		}
//		System.out.println();
//		System.out.println("총 합: "+sum);
//		sc.close();
		
		//8. 3이상 정수 입력 배열중간까지 1씩증가 이후부턴 1씩감소
		//짝수, 3미만-> 다시 입력
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num>=3 && num%2==1) {
				int[] nums = new int[(num*2)-1];
				for(int i=1; i<=num; i++) {
					nums[i-1]=i;
					System.out.print(nums[i-1]+" ");
				}//중앙값 출력 방지, 우측 대칭수열
				for(int i = num-1; i>0; i--) {
					System.out.print(i+" ");
				}
				return;
			}
			else {
				System.out.println("다시 입력하세요");
			}
		}
		
	} //여기 두개는 맨위 두줄의 마침을 포함하기에 삭제하면 안됨
}
