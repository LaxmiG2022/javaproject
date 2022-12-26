package com.javaproject;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("ram");
		al.add("seeta");
		al.add("tarun");
		
	
		for (String s : al) {
			System.out.println(al);
		}
	
	}
}
