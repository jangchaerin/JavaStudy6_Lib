package com.chaerin.s3.ex1;

import java.util.ArrayList;

import com.chaerin.s3.ex1.member.MemberDTO;
import com.chaerin.s3.ex1.member.MemberData;
import com.chaerin.s3.ex1.student.StudentData;


public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberData memberData = new MemberData();
		StudentData studentData = new StudentData();
		
		ArrayList<MemberDTO> ar =memberData.init();
		
		
	}

}
