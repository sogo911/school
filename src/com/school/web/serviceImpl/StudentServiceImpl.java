package com.school.web.serviceImpl;

import java.awt.datatransfer.SystemFlavorMap;
import java.io.StringBufferInputStream;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	private StudentBean[] students;
	private int count;
	
	public StudentServiceImpl() {
		this.count = 0;
		students = new StudentBean[2];
	}
	@Override
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public int getCount() {
		return count;
	}
	@Override
	public void addStudent(StudentBean student) {
	/*	if (students.length == count) { // 집층수와 사람수가 같을때
			StudentBean[] a = new StudentBean[count];  // 사람수 만큼의 새집을 만든다.
			a = students;	// 새집에 사람을 옮긴다.
			students = new StudentBean[count+2]; // 사람수 보다 +2층의 집을 짓는다.
			System.arraycopy(a, 0, students, 0, 2); // 그전에 집을 허문다.
		} */
		if(count == students.length) {
			StudentBean[] newArr = new StudentBean[count+2];
			System.arraycopy(students, 0, newArr, 0, count);
			students = newArr;
		}
		students [count++] = student;
	}
	@Override
	public void addScore(StudentBean score) {
		
	}

	@Override
	public StudentBean login(StudentBean student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentBean find(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	//@Override
//	public void addCount(int count) {
	//	count++;
		//return 0;
//	}
	@Override
	public StudentBean[] list() {
		return students;
	}
	@Override
	public StudentBean findStudentById(String id) {
		StudentBean student = new StudentBean();
		for(int i = 0; i < count; i++) {
			if(id.equals(students[i].getId())) {
				student = students[i];
				break;
			}
		}
	//	String userid = students[6].getId();
		return student;
	}
	@Override
	public StudentBean[] findStudentByName(String name) {  //파인드(검색)
		StudentBean[] findName = null;
		int matchCount = 0;
		for(int i = 0; i < count; i++) {
			if(name.equals(students[i].getName())) {
				matchCount++;
				
			}
		}
		if(matchCount!=0) {
		findName = new StudentBean[matchCount];
		int j = 0;
		for(int i = 0; i < count; i++) {
			if(name.equals(this.students[i].getName())) {
				findName[j] = this.students[i];
				j++;
				if(j == matchCount) {
					break;
					}
				}
			}
		}
		return findName;
	}
	@Override
	public void updatePassword(StudentBean student) { //업데이트
		for(int i = 0; i < count;i++) {
			if(student.getId().equals(students[i].getId())) {
				students[i].setPass(student.getPass());
				break;
			}
		}
		/*StudentBean t = findStudentById(student.getId());	위에있는 파인드바이네임을 카피하여 객체속에 객체를 만든다.
		t.setPass(student.getPass());							
		
		findStudentById(student.getId()).setPass(student.getPass());*/
	}
	@Override
	public void delId(String next) {
		for(int i=0;i<count;i++) {
			if(next.equals(students[i].getId())) {
				students[i] = null;
				students[i]=students[count-1];
				students[count-1] = null;
				count--;
				break;
			}
		}
	}
}
