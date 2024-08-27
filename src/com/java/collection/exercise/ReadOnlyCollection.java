package com.java.collection.exercise;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ReadOnlyCollection {

	public static void main(String[] args) {

		Set<Integer> num = new HashSet<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		Iterator<Integer> i = num.iterator();
		while(i.hasNext()) {
			Integer number = i.next();
			if(number.equals(3)) {
				i.remove();
				
			}
		}
		System.out.println(num);
	
		
		try {
			num = Collections.unmodifiableSet(num);
			num.remove(2);
		}
		catch(UnsupportedOperationException unsupportedexception) {
			System.out.println("Exception "+unsupportedexception);
		}
		finally {
			System.out.println(num.contains(2));
			System.out.println(num+ " Now set is Read-only");
		}
	}

}
