package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

/*
Map - HashMap : 빠른 검색 속도 (가장 많이 사용)
    - TreeMap : 정렬된 데이터를 필요할 경우 사용
    - LinkedHashMap : 순서를 유지하면서 저장하기 때문에 순서가 중요한 경우 사용
 
Map : 특정 키를 입력하면 해당되는 값을 얻을 수 있는 Collection 객체
	  키 = key
	  값 = value
	  
	  key:value 값으로 구성
	  
메서드
put(key, value) : 지정된 키와, 지정된 값의 쌍을 추가
get(key) : 지정된 키에 저장된 값을 보여줌
containsKey(key) : 지정된 키가 존재하는지 확인
containsValue(value) : 지정된 값이 존재하는지 확인
remove(key) : 지정된 키와 키에 저장된 값을 제거
keySet() : 키를 포함하는 집합을 반환
values() : 모든 값들을 포함하는 컬렉션 반환
entrySet() : 모든 키-쌍을 포함하는 집합을 반환
*/

public class MapEx {

	public static void main(String[] args) {
		Map<String, Integer> student = new HashMap<>(); 
		// 맵에 추가(key, value)
		student.put("철수", 90);
		student.put("영희", 85);
		student.put("민수", 88);
		
		System.out.println(student.get("철수"));
		System.out.println(student);
		
		student.remove("영희");
		
		System.out.println(student);

		// 키는 유일해야함, 중복 불가 / 아래의 경우 값이 마지막 입력한 값으로 갱신됨
		student.put("철수", 80);
		System.out.println(student);
		
		for(String name : student.keySet()) {
			int score = student.get(name);
			System.out.println(name+"의 성적은 : "+score);
		}
	}
}
