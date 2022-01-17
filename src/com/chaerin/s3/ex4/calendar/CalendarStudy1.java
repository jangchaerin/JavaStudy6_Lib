package com.chaerin.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {
	
	public static void main(String[] args) {
	
		//calendat는 추상클래스
		//gregoriancalendar가 Calendar클래스 상속
		//calendar의 메소드는 gregorianclendar에 있다
		
		GregorianCalendar gc = new GregorianCalendar();
		
		Calendar calendar = new GregorianCalendar();
		
		Calendar ca = Calendar.getInstance();
		
		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DATE);
		int h = ca.get(Calendar.HOUR); //=(calendar.hour_of_day)
		int mi = ca.get(Calendar.MINUTE);
		int s = ca.get(calendar.SECOND);
		
		long millis = ca.getTimeInMillis();
		
		Date date = ca.getTime();

		
		System.out.println(y);
		System.out.println(m+1);
		System.out.println(d);
		System.out.println(h);
		System.out.println(mi);
		System.out.println(s);
		
		
		
	}

}
