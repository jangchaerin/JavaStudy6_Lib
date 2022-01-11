package com.chaerin.s1.lang.String;

import java.util.Scanner;

public class StringStudy1 {
	
	public void splitTest() {
		String name = "iu, suji, choa, 펭수, 춘식이";
		String [] names = name.split(",");
		
		for(int i = 0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		
	}
	
	public void valueTest() {
		int num = 1000;
		String result = String.valueOf(num);
		System.out.println(result);
	}


	
	public void tolowercaseTest() {
		String msg = "Hello World";
		String result = msg.toLowerCase();
		System.out.println(msg);
		System.out.println(result);
	}

	public void touppercaseTest() {

		String mmm = "hi im chaerin";
		String result = mmm.toUpperCase();
		System.out.println(mmm);
		System.out.println(result);
		
	}

	public void replaceTest() {
		String title = "West Side Story";
		// 참조변수명.멤버메소드명()
		String result = title.replace('S', 't'); // 리턴
		System.out.println(title);
		System.out.println(result);
	}

	public void subStringEx1() {
		// 키보드로부터 업로드할 파일명을 입력
		// a.txt, b.pdf, iu.jpg
		// jpg, gif, png -> 이미지파일입니다 출력
		// txt, pdf, hwp -> 문서 파일입니다 출력
		// mp3, wav, ogg -> 음원 파일 입니다 출력
		// 나머지는 알 수 없는 파일 입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 입력");
		String fileName = sc.next();// abc.test.txt
		String result = fileName.substring(fileName.lastIndexOf(".") + 1);
		System.out.println(result);

		if (result.equals("jpg") || result.equals("gif") || result.equals("png")) {
			System.out.println("이미지 파일");
		} else if (result.equals("txt") || result.equals("pdf") || result.equals("hwp")) {
			System.out.println("문서 파일");
		} else if (result.equals("mp3") || result.equals("wav") || result.equals("ogg")) {
			System.out.println("음원 파일");
		} else {
			System.out.println("알수 없는 파일 형식");
		}

	}

	public void subStringTest() {
		String title = "West Side Story";
		// String result = title.substring(5);
		String result = title.substring(title.indexOf("S"));
		System.out.println(result);
		result = title.substring(5, 9);
		System.out.println(result);
	}

	public void lengthTest() {
		String title = "West Side Story";
		int len = title.length();
		System.out.println(len);

		String find = "e";
		// title find에 들어가있는 글자가 몇개 인지 출력
		int count = 0;
		for (int i = 0; i < title.length(); i++) {
			int index = title.indexOf(find, i);
			if (index >= 0) {
				count++;
				i = index;
			} else {
				break;
			}
		}
		System.out.println("Count : " + count);

		// 한글자씩 출력
		// W
		// e
		// s
//		for(int i=0;i<title.length();i++) {
//			System.out.println(title.charAt(i));
//		}

	}

	public void indexOfTest() {
		String msg = "Hello World";
		// indexOf 호출
		int num = msg.indexOf("o", 7 + 1);// int ch = 'W';
		System.out.println(num);

	}

	public void equalTest() {
		String str = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		String str4 = new String("iu");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str == str2);
		System.out.println(str3 == str4);
		System.out.println(str == str3);
		System.out.println("==================");
		System.out.println(str.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str.equals(str3));

	}

	public void study1() {
		String name = "hello";// 'h' 'e' 'l''l' 'o'

		// charAt 메서드 호출 코드 작성
		int i = 129;
		char ch = name.charAt(i);

		System.out.println(ch);

	}

}