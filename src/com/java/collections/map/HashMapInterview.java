//Count of each char in a given String using Hash Map

package com.java.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapInterview {

	public static void main(String[] args) {

		String s = "ammaappa";
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		char[] c = s.toCharArray();
		
		for(char c1:c) {
			if(hm.containsKey(c1)) {
				hm.put(c1, hm.get(c1)+1);
			} else {
				hm.put(c1, 1);
			}
		}
		System.out.println(hm);
//		System.out.print(hm.get('m'));
		Set<Map.Entry<Character, Integer>> map = hm.entrySet();
		
		for(Map.Entry<Character, Integer> m :map) {
			if(m.getValue()>1) {
				System.out.println(m.getKey());
			}
		}
		
	}

}
