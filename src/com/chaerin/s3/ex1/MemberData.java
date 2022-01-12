package com.chaerin.s3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberData {

	private String data;
	private Scanner sc;

	// 기본 생성자 선언
	public MemberData() {
		this.sc = new Scanner(System.in);
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data + "id2 - pw2 - name2 - name2@naver.com-42-";
		this.data = this.data + "id3 - pw3 - name3 - name3@daum.net-36-";
		this.data = this.data + "id4 - pw4 - name4- name4@daum.net-17-";
		System.out.println(this.data);
	}

	public void addMember(ArrayList<MemberDTO> ar) {

		// 새로 추가 할 MemberDTO생성
		// 키보드로부터 입력 받아서
		// memberDTO의 멤버변수값으로 대입
		// 매개변수로 받은 ar에 MemberDTO 추가

		MemberDTO memberDTO = new MemberDTO();
		System.out.println("id입력");
		memberDTO.setId(sc.next());
		System.out.println("pw입력");
		memberDTO.setPw(sc.next());
		System.out.println("name입력");
		memberDTO.setName(sc.next());
		System.out.println("email입력");
		memberDTO.setEmail(sc.next());
		System.out.println("age입력");
		memberDTO.setAge(sc.nextInt());

		ar.add(memberDTO);
	}

	public MemberDTO removeMember(ArrayList<MemberDTO> ar) {
		// 삭제하고 싶은 id 입력
		// arraylist에서 똑같은 아이디를 가진 멤버가 있으면 해당 dto 삭제
		MemberDTO memberDTO = null;

		System.out.println("삭제하고싶은 id 를 입력하세요.");
		String id = this.sc.next();
		// int index = -1;

		for (int i = 0; i < ar.size(); i++) {
			ar.get(i).getId().equals(id);
			if (ar.get(i).getId().equals(id)) {
				// index = i;
				memberDTO = ar.remove(i);
				break;
			}
		}
		return memberDTO; // 못찾으면 null 리턴
	}

	public ArrayList<MemberDTO> init() {
		// data에 있는 문자열을 StringTokenizer로 파싱해서
		// MemberDTO를 생성해서 멤버변수값으로 대입
		// MemberDTO들을 ArrayList에 담아서 리턴
		System.out.println("MemberEx1 Branch");

		StringTokenizer st = new StringTokenizer(this.data, "-");
		ArrayList<MemberDTO> ar = new ArrayList<>();

		while (st.hasMoreTokens()) {

			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(st.nextToken().trim());
			memberDTO.setPw(st.nextToken().trim());
			memberDTO.setName(st.nextToken().trim());
			memberDTO.setEmail(st.nextToken().trim());
			memberDTO.setAge(Integer.parseInt(st.nextToken().trim()));

			ar.add(memberDTO);

		}
		return ar;
	}

}