package day25;

import java.util.HashMap;

public class TableApp {

	public static void main(String[] args) {
		String departmentid = "20001";
		HashMap<String, String> deptHash =
				new HashMap<>();
		deptHash.put("10001", "컴퓨터");
		deptHash.put("20001", "전기");
		for(String key : deptHash.keySet()) {
			if(key.equals(departmentid)) {
				System.out.println(deptHash.get(key));
			}
		}

	}

}
