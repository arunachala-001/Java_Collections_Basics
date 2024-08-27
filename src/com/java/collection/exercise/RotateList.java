//Rotate element -> rotate method is used.

package com.java.collection.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		Collections.rotate(list, 4);
		System.out.println(list);
		
	}

}
