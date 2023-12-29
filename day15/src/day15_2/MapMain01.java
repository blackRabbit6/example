package day15_2;

import java.util.HashMap;
import java.util.Map;

public class MapMain01 {

	public static void main(String[] args) {
		// 맵 개체 생성
		Map<String, Integer> map = new HashMap<>();
		// 맵 데이터 추가
		map.put("seoul",5000);
		map.put("ny", 2000);
		map.put("england", 1000);
		// 특정 키값으로 맵데이터 추출
		System.out.println(map.get("seoul"));
		System.out.println("========================");
		// 전체 맵 데이터 추출
		for(String x : map.keySet()) {
			System.out.println(map.get(x));
		}
		System.out.println("========================");
		//맵 데이터 사이즈 구하기
		System.out.println(map.size());
		
		System.out.println("========================");
		// 맵 요소 삭제
		map.remove("england");
		// 요소 삭제 후 전체 데이터 출력
		for(String x : map.keySet()) {
			System.out.println(map.get(x));
		}
		
		System.out.println("========================");
		// 맵 요소 전체 삭제
		map.clear();
		for(String x : map.keySet()) {
			System.out.println(map.get(x));
		}
	}

}
