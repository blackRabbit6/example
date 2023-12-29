package com.acorn;

import java.util.Scanner;

public class Main {
	//야자시간때 함수 넣엇 변경시키기
	public static void main(String[] args) {
		//필드(변수) 영역
		//실수=double //int나 float 대신 double쓰는 연습(double 하면 2/4-0.5 나옴)
		//개체 부분
		Scanner sc = new Scanner(System.in);
		//공통 부분
		double a  = sc.nextDouble();
		double b = sc.nextDouble();
		//결과 저장 부분
		double result = 0;
		//더하기 부분
		double addNum = 0;
		//빼기 부분
		double subNum = 0;
		//곱하기 부분
		double multiNum = 0;
		//나누기 부분
		double divNum = 0;
		System.out.print("기호 선택: ");
		String sym = sc.next();
		//오퍼레이션 영역
		//입력된 연산자를 비교할 때에는 == 대신 equals() 메서드를 사용
		//더하기 부분
		if(sym.equals("+")) {
			addNum = a+b;
			result = addNum;
			System.out.println(result);
		}
		//빼기 부분
		else if(sym.equals("-")) {
			subNum = a-b;
			result = subNum;
			System.out.println(result);
		}
		//곱하기 부분
		else if(sym.equals("*")) {
			multiNum = a*b;
			result = multiNum;
			System.out.println(result);
		}
		//나누기 부분
		else if(sym.equals("/")) {
			if(a==0) {
				System.out.println("분자 0이라 값 0 나옴");
			}else if(b==0) {
				System.out.println("분모가 0이라 연산불가");
			}else {
			divNum = a/b;
			result = divNum;
			//소수 둘째짜리 까지 출력 println이 아닌 printf로 변경
			//()안에 "%.2f" 소수둘째짜리 까지라는 이름, result라는변수 넣어야 섯째짜리에서 반올림함
			System.out.printf("%.2f",result);
			}
		}
		sc.close();
	}
	public static void addNum(Scanner sc) {}

}
