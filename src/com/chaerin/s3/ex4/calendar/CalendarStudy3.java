package com.chaerin.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy3 {
	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());

		Calendar ca2 = Calendar.getInstance();

		ca2.set(Calendar.HOUR, 5);
		System.out.println(ca2.getTime());

		long millis = ca.getTimeInMillis();
		long millis2 = ca2.getTimeInMillis();
		long result = millis2 - millis;

		System.out.println(result);

		result = result /1000/60/60;

		System.out.println("시간 : " + result);

	}

}
