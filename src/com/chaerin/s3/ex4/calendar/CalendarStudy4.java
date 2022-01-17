package com.chaerin.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());

		Calendar calendar2 = Calendar.getInstance();
//		calendar2.set(Calendar.YEAR, 1997);
//		calendar2.set(Calendar.MONTH, 8);
//		calendar2.set(Calendar.DATE, 11);
		
		calendar2.set(1997,8,11);	//년 원 일 한방에 조정
		System.out.println(calendar2.getTime());
		
		long millis = calendar.getTimeInMillis();
		long millis2 = calendar2.getTimeInMillis();
		long result = millis - millis2;
		long dayresult=0;
		long yearresult=0;
		
		System.out.println(result);

		dayresult = result / (1000 * 60 * 60 * 24);
		System.out.println("내가 산 일 수 : " + dayresult);

		yearresult = dayresult/365;
		System.out.println("내가 산 년 수 : " + yearresult);

	}
}
