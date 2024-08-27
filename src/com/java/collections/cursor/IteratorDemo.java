package com.java.collections.cursor;

//import java.util.ArrayList;
import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add("Arun");
		al.add("Bala");
		al.add("Chandra");
		al.add("Dahnush");
		al.add("Kali");
		
		//ForEach
		System.out.println(">>>>>>>>>>>>>>>Using For Each>>>>>>>>>>>>>>>>>>>");
		for(Object name:al) {
			System.out.println(name);
		}
		System.out.println(">>>>>>>>>>>>>>>Using Itertaor>>>>>>>>>>>>>>>>>>>");
		//Iterator
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//List Iterator
		System.out.println(">>>>>>>>>>>>>>>Using List Itertaor>>>>>>>>>>>>>>>>>>>");
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
			
		}
		
		
		
		
	}

}
