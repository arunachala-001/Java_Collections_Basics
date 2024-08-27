package com.java.collections.arrylist;
import java.util.*;
public class ArrayListProjectDemo {

	public static void main(String[] args) {

		Laptop dell = new Laptop(60000,"DELL",6);
		Laptop hp = new Laptop(58000,"HP",6);
		Laptop mac = new Laptop(90000,"Apple Mac",8);
		Laptop acer = new Laptop(60000,"ACER",12);
		
		ArrayList lap = new ArrayList();
		lap.add(dell);
		lap.add(hp);
		lap.add(mac);
		lap.add(acer);
		
		System.out.println(lap);
		ComparatorLaptop cl = new ComparatorLaptop();
		Collections.sort(lap, cl);
		System.out.println(lap);
		
	}

}
