package com.java.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put(1, "Java");
		hm.put(2, "React");
		hm.put(3, "MySQL");
		hm.put(4, "AWS");
		
		System.out.println(hm.size());
		
		Set s1 = hm.entrySet();
		
		//Normal Iterator
		Iterator i = s1.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		//Manipulate the data using iterator like get keys and values separately
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			if(me.getKey().equals(4))
				me.setValue("Cloud");
			
			System.out.println(me);
		}
		
	}

}
