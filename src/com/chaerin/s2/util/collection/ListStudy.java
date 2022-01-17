package com.chaerin.s2.util.collection;


import java.util.ArrayList;
import java.util.LinkedList;

public class ListStudy {
	
	private final int NUM =1;
	
	public ArrayList<String> study5() {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		
		return list;
		
	}
	
	public void study4() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		
		System.out.println(list.get(0));
		
	}
	
	
	

	public void study3() {
		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add('b');
		ar.add(3.12);
		ar.add("iu");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}

}
