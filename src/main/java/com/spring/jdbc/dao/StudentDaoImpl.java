package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	@Autowired
	public JdbcTemplate jdbcTemplate;

	public int insert(Student student) {

		String query = "insert into student(id, name, city) values(?,?,?)";
		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;

	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int change(Student student) {
//		update
		String query = "update student set name=?, city=?, where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}

	public int delete(int studentId) {

		String query = "delete student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}

	public List<Student> getAllStudent() {
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;

	}

	public Student getStudent(int studentId) {
		String query = "select * from student where studentId=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);

//		If you dont want to make another class you can also make it as anonymous class
//		Student student = this.jdbcTemplate.queryForObject(query, new RowMapper() {
//			Student student = new Student();
//
//			student.setId(rs.getInt(1));
//			student.setName(rs.getString(2));
//			student.setCity(rs.getString(3));
//			return student;
//		}, studentId);
		return student;
	}

}
