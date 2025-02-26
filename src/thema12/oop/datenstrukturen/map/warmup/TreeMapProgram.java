package thema12.oop.datenstrukturen.map.warmup;

import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Bob", 25);
		map.put("Alice", 30);
		map.put("Charlie", 35);
		System.out.println("TreeMap: " + map);		
	}

}
