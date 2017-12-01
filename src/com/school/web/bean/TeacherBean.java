package com.school.web.bean;

public class TeacherBean {
	private String teacherId,teacherPass,teacherName,subject;
	
	public void setTeacherId(String teacherId){
		this.teacherId = teacherId;
	}
	public String getTeacherId() {
		return this.teacherId;
	}
	public void setTeacherPass(String teacherPass){
		this.teacherPass = teacherPass;
	}	
	public String getTeacherPass() {
		return this.teacherPass;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherName() {
		return this.teacherName;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return this.subject;
	}
}
