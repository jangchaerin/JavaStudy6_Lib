package com.chaerin.s1.lang.wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		
		int num = 10;
		Integer n = Integer.valueOf(num);	//wrapping
		
		n=num; //autoboxing
		num = n; //원래는 안되는데 오류 안뜸 //autoUnboxing
		
		double d = 3.14;
		Double dd = d;
		
		Integer num2 = (int)d;	
		
		
		
		
//		System.out.println(Integer.BYTES);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.SIZE);
//		System.out.println(Long.BYTES);

	}
}
