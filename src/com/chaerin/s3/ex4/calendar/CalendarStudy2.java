package com.chaerin.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy2 {

	public static void main(String[] args) {
		//현재시간
		Calendar ca = Calendar.getInstance(); //calendar은 추상메소드라 new로 객체생성불가
		System.out.println(ca.getTime());	//gettime으로 바꿔서 출력하면 좀 더 보기편함
		
		//미래의 시간이나 과거의시간으로 바꾸려함
		
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.YEAR, 2023);		//날짜 바꿔주는거
		ca2.set(Calendar.MONTH, 2);
		ca2.set(Calendar.DATE, 15);
		System.out.println(ca2.getTime());
		
		
	}

}
