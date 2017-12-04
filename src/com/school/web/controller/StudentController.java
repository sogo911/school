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
								+"4.학생 이름 리스트 5.내정보 보기 6.이름 검색");
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
			case 5:
				System.out.println("ID를 입력하세요");
				String id = scanner.next();
				StudentBean temp = studentService.findStudentById(id); // ID를 통해 학생정보를 가져온다.
				System.out.println(temp);
				break;
			case 6:
				System.out.println("검색 이름 입력");
				String name = scanner.next();
				StudentBean[] findName = studentService.findStudentByName(name);
				if(findName == null) {
					System.out.println("검색하려는 이름이 존재하지 않습니다.");
				}else {
					for(int i = 0; i < findName.length; i++) {
						System.out.println(findName[i].getName());
					}
				}
				break;
			}
		}
	}

}
