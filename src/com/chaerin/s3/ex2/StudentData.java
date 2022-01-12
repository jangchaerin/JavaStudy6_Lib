package com.chaerin.s3.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentData {
	private String info;
	private Scanner sc;
	
	public StudentData() {
		this.sc = new Scanner(System.in);
		this.info = "name1,1,15,50,60,";
		this.info = this.info + "name2,2,52,68,40,";
		this.info = this.info + "name3,3,80,87,75,";
	}

	// 학생들의 정보를 파싱해서 총점과 평균도 계산 후 전체 출력
	// 학생의 정보를 추가
	// 학생의 정보를 삭제
	public void addStudent(ArrayList<StudentDTO> info) {
		
		StudentDTO studentDTO = new StudentDTO();
		
		System.out.println("이름입력");
		studentDTO.setName(sc.next());
		System.out.println("번호입력");
		studentDTO.setNumber(sc.nextInt());
		System.out.println("국어입력");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어입력");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학입력");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setSum(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getSum()/3.0);
		
		info.add(studentDTO);
	}
	
	
	public StudentDTO removeStuden(ArrayList<StudentDTO> info) {
		
		StudentDTO studentDTO = null;
		System.out.println("삭제할 학생의 번호를 입력");
		int a = this.sc.nextInt();
		
		for(int i =0;i<info.size();i++) {
			info.get(i).getNumber();
			if (info.get(i).getNumber()==a) {
				// index = i;
				studentDTO = info.remove(i);
				break;
			}
		}
		return studentDTO;
		
	}
	
	
	public ArrayList<StudentDTO> init(){
		
		StringTokenizer st = new StringTokenizer(this.info,",");
		ArrayList<StudentDTO> info = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			
			studentDTO.setName(st.nextToken());
			studentDTO.setNumber(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setSum(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getSum()/3.0);
			
			info.add(studentDTO);
		}

		return info;
		
	}

	

}
