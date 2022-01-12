package com.chaerin.s3.ex2;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		StudentData studentData = new StudentData();

		ArrayList<StudentDTO> student = studentData.init();
		
		//studentData.addStudent(student);
		studentData.removeStuden(student);
		for(int i =0;i<student.size();i++) {
			System.out.println("이름 : "+student.get(i).getName());
			System.out.println("번호 : " +student.get(i).getNumber());
			System.out.println("국어 : "+student.get(i).getKor());
			System.out.println("영어 : "+student.get(i).getEng());
			System.out.println("수학 : "+student.get(i).getMath());
			System.out.println("총점 : "+student.get(i).getSum());
			System.out.println("평균 : " +student.get(i).getAvg());
			System.out.println("=========================");
		}
		
	}

}
