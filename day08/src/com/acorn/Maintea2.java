package com.acorn;

import java.util.Scanner;

//import 패키지명.클래스명;
import Maintea2.Add;
import Maintea2.Sub;
import Maintea2.Mul;
import Maintea2.Div;

public class Maintea2 {

	public static void main(String[] args) {
					// 필드 영역
			Scanner sc = new Scanner(System.in);
			String sInputMsg01 = "첫번째수:>>> "; String sInputMsg02 = "두번째수:>>> ";
			
			// 더하기 부분
			int iAddFirstNum; int iAddSecondNum; int iAddResultValue = 0; 
			// 오퍼레이션 영역		
			// 더하기 부분
				// 연산 대상 값 할당: 직접 or 키보드입력
				System.out.print(sInputMsg01); iAddFirstNum = sc.nextInt();
				System.out.print(sInputMsg02); iAddSecondNum = sc.nextInt();
//				// + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
//				iAddResultValue = iAddFirstNum + iAddSecondNum;
//				System.out.println(sResultMsg + iAddResultValue);			
				// 제약 조건: 값의 범위
				
				//정적메소드 호출
				iAddResultValue = Add.addOperation(iAddFirstNum, iAddSecondNum);
				System.out.println(iAddResultValue);
				Add add = new Add();
				//동적메소드 호출(new 뒤에)
				iAddResultValue = add.addOperation(iAddFirstNum, iAddSecondNum, "안녕");
				System.out.println(iAddResultValue);
				
				iAddResultValue = Sub.SubOperation(iAddFirstNum, iAddSecondNum);
				System.out.println(iAddResultValue);
				Sub Sub = new Sub();
				iAddResultValue = Sub.SubOperation(iAddFirstNum, iAddSecondNum,"누구");
				System.out.println(iAddResultValue);
				
				iAddResultValue = Mul.MulOperation(iAddFirstNum, iAddSecondNum);
				System.out.println(iAddResultValue);
				Mul Mul = new Mul();
				iAddResultValue = Mul.MulOperation(iAddFirstNum, iAddSecondNum,"어디");
				System.out.println(iAddResultValue);

				iAddResultValue = Div.DivOperation(iAddFirstNum, iAddSecondNum);
				System.out.println(iAddResultValue);
				Div Div = new Div();
				iAddResultValue = Div.DivOperation(iAddFirstNum, iAddSecondNum,"왜");
				System.out.println(iAddResultValue);

			sc.close();
		}

}
