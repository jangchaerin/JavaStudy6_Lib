package com.chaerin.s1.lang.String.ex1;

public class MemberData {

	private String data;

	// dafault 생성자 (기본생성자 선언)

	public MemberData() { // 생성자
		this.data = "id1-pw1-name1-id1@gmail.com-42-";
		this.data = this.data + "id2-pw2-name2-name2@naver.com-36-";
		this.data = this.data + "id3-pw3-name3-name3@daum.com-17";

		System.out.println(this.data);

	}

	public MemberDTO[] init() { // 메소드/init는 뭔가를 초기화한다는 의미
		// this.data
		String[] datas = this.data.split("-");

		MemberDTO [] members = new MemberDTO[3];
		
		int index = 0;

		for (int i = 0; i < 3; i++) {
			MemberDTO memberDTO = new MemberDTO();
		
			memberDTO.setId(datas[index]);	//datas[0]	datas[4]	datas[8]
			memberDTO.setPw(datas[++index]);	//datas[1]	datas[5]	datas[9]
			memberDTO.setName(datas[++index]);	//datas[2]	datas[6]	datas[10]
			memberDTO.setEmail(datas[++index]);	//datas[3]	datas[7]	datas[11]
			memberDTO.setAge(Integer.parseInt(datas[++index]));
			members[i]=memberDTO;
			index++;
		}
		return members;
	}

}
