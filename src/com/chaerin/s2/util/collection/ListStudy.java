package com.chaerin.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {

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
