package com.chaerin.s2.util.collection;

import java.util.HashMap;

public class MapStudy {

	public void study1() {
		//HashMap
		HashMap<String, Integer> map = new HashMap<>();
		
		//put
		map.put("f1", 1);
		map.put("f2", 2);
		map.put("f3", 1);			//value는 중복허용
		
		System.out.println(map);
		
		Integer num = map.get("f2");
		System.out.println(num);
		
		map.remove("f3");
		System.out.println(map);
		
		map.put("f1", 100);
		System.out.println(map );
		
		
		
		map.clear();
		System.out.println(map);
	}
	
	
}
