package com.school.web.controller;
//import java.util.Scanner;
import javax.swing.JOptionPane;
import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;
import com.school.web.serviceImpl.StudentServiceImpl;
import com.school.web.ui.MainPage;

public class StudentController {
	public static void main(String[] args) {
	//	Scanner scanner = new Scanner(System.in);
//		int count = scanner.nextInt();
	//	StudentBean student = new StudentBean();
		StudentService studentService =
				new StudentServiceImpl();
		StudentBean student = null;
		StudentBean[] students = null;
		while(true) {
			switch (JOptionPane.
					showInputDialog(
							"[메뉴] 0.종료 \n"
							+ "1.학생 등록 2.성적 등록 3.총 학생 수\n"
							+"4.학생 이름 리스트 5.내정보 보기 6.이름 검색\n "
							+"7.PW 변경 8.삭제 9.화면보기\n")) {
			case "0":
				System.out.println();
				JOptionPane.showMessageDialog(null, "시스템 종료");
				return;
			case "1":
		//		StudentBean student = new StudentBean();
				student = new StudentBean();
				student.setId(JOptionPane.showInputDialog("ID 입력"));
				student.setPass(JOptionPane.showInputDialog("PW 입력"));
				student.setName(JOptionPane.showInputDialog("이름 입력"));
				studentService.addStudent(student);
				JOptionPane.showMessageDialog(null, "등록되었습니다.");
				break;
			case "2":
				
				break;
			case "3":
			//	int count1 = StudentService.getCount();
				JOptionPane.showMessageDialog(null, "총학생수는"
						+studentService.getCount());
				break;
			case "4":
				String message = "";
				students = studentService.list();
				for(int i=0;i<studentService.getCount();i++) {
					message += students[i].getName()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;	
			case "5":
				System.out.println("ID를 입력하세요");
				StudentBean temp = studentService.findStudentById(
						JOptionPane.showInputDialog("ID를 입력하세요")); // ID를 통해 학생정보를 가져온다.
				System.out.println(temp);
				break;
			case "6":
				System.out.println("검색 이름 입력");
				StudentBean[] findName = studentService.findStudentByName(JOptionPane.showInputDialog("검색 이름 입력"));
				if(findName == null) {
					System.out.println("검색하려는 이름이 존재하지 않습니다.");
				}else {
					for(int i = 0; i < findName.length; i++) {
						System.out.println(findName[i].toString());
					}
				}
				break;
			case "7":
				student = new StudentBean();
				student.setId(JOptionPane.showInputDialog("수정하고자하는 PW의 Id"));
				student.setPass(JOptionPane.showInputDialog("수정할 PW"));
				studentService.updatePassword(student);
				break;
			case "8":
				//String delId = scanner.next();
				studentService.delId(JOptionPane.showInputDialog("삭제하고자하는 ID를 입력하세요"));
				break;
			case "9": 
				MainPage mp = new MainPage();
				break;
			}
		}
	}

}
