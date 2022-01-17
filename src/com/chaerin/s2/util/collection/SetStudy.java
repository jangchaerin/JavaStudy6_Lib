package com.chaerin.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;


public class SetStudy {

	public void study1() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);

		System.out.println(ar);

		System.out.println(hs);
		System.out.println(hs.size());
	}

	public void study2() {
		Random random = new Random();

		// Lotto 번호를 랜덤 1-45 6개를 모두 뽑고 list에 담아서 한번에 출력
		ArrayList<Integer> lotto = new ArrayList<>();

		for (int i = 0; i < 6; i++) { 		//중복이면 i 가 증가하지 않게끔 코딩해보기
			int num = random.nextInt(45) + 1;
			lotto.add(num);
		}

		System.out.println(lotto);
	}
	
	public void study3() {
		Random random = new Random();
		
		HashSet<Integer> lotto = new HashSet<>();
		
//		for(int i =0;i<6;i++) {
//			int num = random.nextInt(45) + 1;
//			lotto.add(num);
//		}
		
		while(lotto.size()!=6) {
			int num = random.nextInt(45)+1;
			lotto.add(num);
		}
		System.out.println(lotto);

	}
	
	public void study4() {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Iterator<Integer> it = hs.iterator();
//		while(lotto.size()!=6) {
//			int num = random.nextInt(45)+1;
//			lotto.add(num);
		}
		
	}
	

