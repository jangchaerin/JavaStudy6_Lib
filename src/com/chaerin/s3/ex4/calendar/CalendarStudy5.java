package com.chaerin.s3.ex4.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarStudy5 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		
		//카카오택시에서 30분이 걸린대
		//그럼 도착예정시간은?
		//1000*60*30 - > 30분에 관련되 ㄴ밀리세컨즈
		System.out.println("현재시간 : "+ca.getTime());
		
		long time = ca.getTimeInMillis();
		time = time + 1000*60*30;
		
		ca.setTimeInMillis(time);
		System.out.println("도착시간 : "+ca.getTime());
		
		ca.roll(Calendar.MINUTE, 60);
		
		System.out.println("도착시간 : "+ca.getTime());
		
		//2022년 01월 14일 - 16:44:11 로 표현하고싶음
		String pattern = "yyyy년 MM월 dd일 - HH:mm:ss";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		String r =sd.format(ca.getTime());
		System.out.println(r);
		
	}

}
