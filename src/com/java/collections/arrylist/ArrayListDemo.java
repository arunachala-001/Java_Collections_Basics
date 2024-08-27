package com.java.collections.arrylist;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		// Adding elements
		al.add(1);
		al.add(2);
		al.add("Java");
		al.add('A');
		al.add(true);
		System.out.println(al);
		
		//Adding elements at 3rd index
		al.add(3, "Developer");
		System.out.println(al);
		//Removing element
		al.remove(5);
		System.out.println(al);
		
		//Get the specific element
		System.out.println(al.get(2));
		
		//Update the element
		al.set(4, "B");
		System.out.println(al);
		
		//copy the all the element to other List
		ArrayList al2 = new ArrayList();
		al2.addAll(al);
		System.out.println(al2);
		
		ArrayList al3 = new ArrayList();
		al3.add("Chennai");
		al3.add("Bangalore");
		al3.add("Kerala");
		
		//Add all the element from one List to another List at specific index
		al3.addAll(1, al);
		System.out.println(al3);
		
		//Get specific elements between 2 index
		List l1 = al3.subList(3, 6);
		System.out.println(l1);
	}

}
