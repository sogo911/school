package com.school.web.controller;

import java.util.Scanner;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;
import com.school.web.serviceImpl.StudentServiceImpl;

public class StudentController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 수 입력");
		int count = scanner.nextInt();
		StudentService studentService = new StudentServiceImpl(count);
	//	StudentBean student = new StudentBean();
		StudentBean student = null;
		while(true) {
			System.out.println("[메뉴] 0.종료 1.학생 등록 2.성적 등록 3.총 학생 수"
								+"4.학생 이름 리스트");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("시스템 종료");
				return;
			case 1:
		//		StudentBean student = new StudentBean();
				student = new StudentBean();
				System.out.println("ID 입력");
				student.setId(scanner.next());
				System.out.println("PW 입력");
				student.setPass(scanner.next());
				System.out.println("이름 입력");
				student.setName(scanner.next());
				studentService.addStudent(student);
				break;
			case 2:
				break;
			case 3:
			//	int count1 = StudentService.getCount();
				System.out.println("총학생수는"
							+studentService.getCount());
				break;
			case 4:
				StudentBean[] students = studentService.list();
				for(int i=0;i<students.length;i++) {
					System.out.println(students[i].getName());
				}
				break;
			}
		}
	}

}
