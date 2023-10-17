package com.krc.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MappingRunner {

	public static void main(String[] args) {
		Map<String, Integer> aMap = new HashMap();
		aMap.put("weight", 211);
		aMap.put("height", 71);
		aMap.put("yearsMarried", 17);
		aMap.put("age", 37);
		System.out.println(aMap); // note order is NOT in tact
		System.out.println(aMap.get("name")); // null
		System.out.println(aMap.get("age")); // 37

		LinkedHashMap<String, Integer> lMap = new LinkedHashMap();
		lMap.put("weight", 211);
		lMap.put("height", 71);
		lMap.put("yearsMarried", 17);
		lMap.put("age", 37);
		System.out.println(lMap); // note order is in tact

		TreeMap<String, Integer> tMap = new TreeMap();
		tMap.put("weight", 211);
		tMap.put("height", 71);
		tMap.put("yearsMarried", 17);
		tMap.put("age", 37);
		System.out.println(tMap); // note order is sorted by the key

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

		String rootData = "It was the worst of times, it was the best of times. Java Programming for Beginners to Java Object Oriented Programming. Core Java + REST API with Spring Boot. Java 8 to 16.";

		HashMap<String, Integer> letters = new HashMap();
		for (String c : rootData.split("")) {
			if (c.charAt(0) == ' ') {
				continue;
			}

			if (letters.containsKey(c)) {
				letters.put(String.valueOf(c), letters.get(c) + 1);
			} else {
				letters.put(String.valueOf(c), 1);
			}
		}
		System.out.println(letters);

		HashMap<String, Integer> words = new HashMap();
		for (String word : rootData.split(" ")) {
			String s = word.replaceAll(
					"[!'#%\"&()*+,-./:;<=>?@[/]^_{|}~]",
					"");
			if (words.containsKey(s)) {
				words.put(String.valueOf(s), words.get(s) + 1);
			} else {
				words.put(String.valueOf(s), 1);
			}
		}
		System.out.println(words);
	}

}
