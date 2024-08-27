package com.java.collections.comparator;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		String[] names = {"Arunachalam","Sridhar","Bakkiyalakshmi","Harini"};
		Arrays.sort(names);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<Default Sorting>>>>>>>>>>>>>>>>>>>>");
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("<<<<<<<<<<<<<<<<<Comparator Sorting>>>>>>>>>>>>>>>>>");
		ComparatorDemo cd = new ComparatorDemo();
		Arrays.sort(names, cd);
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
