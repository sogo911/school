package com.school.web.serviceImpl;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	private StudentBean[] students;
	private int count;
	
	public StudentServiceImpl(int count) {
		this.count = 0;
		students = new StudentBean[count];
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
		students [count] = student;
		count++;
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
	public StudentBean[] findStudentByName(String name) {
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
}
