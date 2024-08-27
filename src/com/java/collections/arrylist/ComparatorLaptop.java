package com.java.collections.arrylist;

import java.util.Comparator;

public class ComparatorLaptop implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Laptop l1 = (Laptop)o1;
		Laptop l2 = (Laptop)o2;
		
		int result = l1.getBrand().compareTo(l2.getBrand());
		if(l1.getPrice()>l2.getPrice()) {
			return 1;
		} else if(l1.getPrice()<l2.getPrice()) {
			return -1;
		}
		else {
			if(l1.getRam()>l2.getRam()) {
				return -1;
			} else if(l1.getRam()<l2.getRam()) {
				return +1;
			} 
			else {
				if(result>0) {
					return -1;
				} else if(result <  0) {
					return +1;
				}
			}
		}
		return 0;
	}

	
}
