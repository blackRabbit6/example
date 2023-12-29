package day25;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RunMain {

	public static void main(String[] args) throws IOException{
		// 스트림 생성: File
//		File objFile = new File("tablelikedata.txt");
		// 스트림 연결: FileReader
//		FileReader objFr  = new FileReader(objFile);
		// 스트림 버퍼화: BufferedReader
//		BufferedReader br = new BufferedReader(objFr);
		BufferedReader br = new BufferedReader(
				new FileReader(new File("C:/Users/LG/eclipse-workspace/day25/src/day25/tablelikedata.txt")));
		// BufferedReader의 객체가 사용할 수 있는 내부 매소드: readline
		// readLine ! = null
		String oneLine = null;
		System.out.println("studentid name departmentid");
		int iLineType = 0;
		while((oneLine = br.readLine()) !=null) {
			if(oneLine.startsWith("Title")) {
				iLineType = 0;
			}else if(oneLine.startsWith("Data")) {
				iLineType = 1;
			}
			
			if(iLineType == 1) {
				String[] sSplitVal = oneLine.split("#");
				System.out.print(sSplitVal[1]+" ");
				System.out.print(sSplitVal[2]+" ");
				System.out.print(sSplitVal[3]+" ");
				System.out.println();
			}
		}
		
//		objFr.close();
		br.close();
	}

}
