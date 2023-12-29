package com.acorn;

import java.util.Scanner;


//import 패키지명.클래스명;
import Maintea3.Add;

public class Maintea3 {

	public static void main(String[] args) {
					// 필드 영역
			Scanner sc = new Scanner(System.in);
			String sInputMsg01 = "첫번째수:>>> "; String sInputMsg02 = "두번째수:>>> ";
			
				String sAddFirstNum; String sAddSecondNum;
				int iAddResultValue01=0; double dAddResultValue01=0.0;
				// 제약 조건: 값의 범위
				
				
				Add add = new Add();
				
				System.out.println(sInputMsg01); sAddFirstNum = sc.nextLine();
				System.out.println(sInputMsg02); sAddSecondNum = sc.nextLine();
				iAddResultValue01 = add.addOperation(Integer.parseInt(sAddFirstNum),
						Integer.parseInt(sAddSecondNum));
				System.out.println(iAddResultValue01);
				
				System.out.println(sInputMsg01); sAddFirstNum = sc.nextLine();
				System.out.println(sInputMsg02); sAddSecondNum = sc.nextLine();
				dAddResultValue01 = add.addOperation(Double.parseDouble(sAddFirstNum),
						Double.parseDouble(sAddSecondNum));
				System.out.println(dAddResultValue01);
				
				

//				

			sc.close();
		}

}
