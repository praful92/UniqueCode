package com.velocity;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class ClassAs {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<Integer>();
		set.add(40);
		set.add(30);
		set.add(50);
		set.add(10);
		
		System.out.println(set);
		
		ArrayList a = new ArrayList(set);
		System.out.println(a);
	}
}
