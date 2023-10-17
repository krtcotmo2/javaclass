package com.krc.collections;

import java.util.HashMap;
import java.util.Map;

public class MappingRunner {

	public static void main(String[] args) {
		Map<String, Integer> aMap = new HashMap();
		aMap.put("weight", 211);
		aMap.put("age", 37);
		System.out.println(aMap);
		System.out.println(aMap.get("name")); // null
		System.out.println(aMap.get("age")); // 37

		Map<String, Integer> map = Map.of("A", 3, "B", 5, "R", 10, "E", 10);
		System.out.println(map);
		System.out.println(map.get("R")); // 10
		System.out.println(map.get("Q")); // null
		System.out.println(map.containsKey("R")); // true
		System.out.println(map.containsKey("Q")); // false
		System.out.println(map.containsValue(7)); // false
		System.out.println(map.containsValue(10)); // true
		System.out.println(map.keySet()); // array
		System.out.println(map.values()); // array

	}

}
