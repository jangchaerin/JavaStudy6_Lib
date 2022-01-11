package com.chaerin.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {

	public void ex2() {
		// 키보드로부터 주민등록번호 입력
		// 9 7 1 2 2 4 - 1 2 3 4 5 6 7
		// 2 3 4 5 6 7 8 9 2 3 4 5 - 마지막번호는 체크용 번호 위랑 밑이랑 곱하기
		// 18 21 4 10 12 28 8 18 6 12 20 30
		// 결과를 모두 더함 만약에 이 값이 122가 나왔다

		// 모두 더한 결과 값을 11로 나누어서 나머지를 구함
		// 122/11 몫 : 11 나머지 : 1

		// 11로 나눈 나머지 값을 11에서 뺴고 그 값을 체크용 번호랑 같은지 비교
		// 11-1 = 10 이게 체크용 버노 7 이랑 같은 지 비교
		// 틀리면 잘못된 번호 맞으면 되는 번호

		// 만약에 결과값이 두자리라면 이 결과값을 다시 10으로 나누어서 그 나머지 값을
		// 체크용번호랑 같은지 비교
		// 같으면 정상적인 주민번호

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력하세요");
		String name = sc.next();

		String[] datas = name.split("");

		int number = 0;
		int numbers = 0;
		int sum = 0;
		int a = 0;

		for (int i = 0; i < datas.length; i++) {
			if (datas[i].equals("-")) {
				continue;
			}

			number = Integer.parseInt(datas[i]);

			for (a = 2; a < 15;) {
				if (a > 9)
					a = 2;
				else
					a++;

				System.out.println(a);
			}
		}

	}

	public void ex1() {
		// 키보드로부터 주민등록 번호 입력
		// 나이를 대충 계산
		// 키보드로 부터 주민등록번호 입력
		// 나이 계산 현재년도 - 출생년도
		// 남자 여자 1234
		// 3-5 봄 6-8 여름 9 -11 가을 12-2 겨울

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력하세요");
		String name = sc.next();

		String[] datas = name.split("");

		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
		System.out.println("================================");
//******************************************************************************
		int y = Integer.parseInt(datas[0]);
		int m = Integer.parseInt(datas[1]);
		int age = 2022 - Integer.parseInt("19" + y + m) + 1;
		System.out.println("현재 나이는 : " + age);
//******************************************************************************
		if (Integer.parseInt(datas[7]) == 1 || Integer.parseInt(datas[7]) == 3) {

			System.out.println("남자");
		} else if (Integer.parseInt(datas[7]) == 2 || Integer.parseInt(datas[7]) == 4) {

			System.out.println("여자");
		} else {
			System.out.println("잘못입력하셨습니다.");

		}
//******************************************************************************
		int num = Integer.parseInt(datas[2]);
		int num1 = Integer.parseInt(datas[3]);

		int season = num + num1;
		if (num == 0) {
			switch (num1) {
			case 1, 2:
				System.out.println("겨울");
			case 3, 4, 5:
				System.out.println("봄");
				break;
			case 6, 7, 8:
				System.out.println("여름");
				break;
			case 9:
				System.out.println("가을");
				break;

			}
		} else if (num == 1) {
			switch (num1) {
			case 0, 1:
				System.out.println("가을");
				break;
			case 2:
				System.out.println("겨울");
				break;
			}
		}

	}

}
