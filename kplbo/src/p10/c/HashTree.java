package p10.c;

import java.util.HashMap;
import java.util.TreeMap;

public class HashTree {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		
		hashMap.put("FISH", "FISH");
		hashMap.put("DOG", "DOG");
		hashMap.put("CAT", "CAT");
		hashMap.put("RAT", "RAT");
		hashMap.put("ZEBRA", "ZEBRA");
		
		treeMap.put("FISH", "FISH");
		treeMap.put("DOG", "DOG");
		treeMap.put("CAT", "CAT");
		treeMap.put("RAT", "RAT");
		treeMap.put("ZEBRA", "ZEBRA");
		
		System.out.println("Menelusuri Hashmap");
		for (String string : hashMap.values()) {
			System.out.println(string);
		}
		
		System.out.println();
		System.out.println("Menelusuri TreeMap");
		for (String string : treeMap.values()) {
			System.out.println(string);
		}
		
	}

}
