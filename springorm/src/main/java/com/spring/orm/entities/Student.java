package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")

public class Student {

	@Id
	@Column(name = "student_id")
	private int studentId;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "student_city")
	private String studenCity;

	public Student(int studentId, String studentName, String studenCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studenCity = studenCity;
	}

	public Student() {

	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudenCity() {
		return studenCity;
	}

	public void setStudenCity(String studenCity) {
		this.studenCity = studenCity;
	}

}
