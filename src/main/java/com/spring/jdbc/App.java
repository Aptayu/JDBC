package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Program Started");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

//		String query = "insert into student(id, name, city) values(?,?,?)";
//		int result = template.update(query, 437, "Hi", "wow");
		Student student = new Student();
		student.setCity("Bundi");
		student.setId(123);
		student.setName("Rahul");

		StudentDaoImpl studentDao = context.getBean("studentDao", StudentDaoImpl.class);

		int result = studentDao.insert(student);

		System.out.println("numers of record inserted" + result);

//		get all student
		List<Student> students = studentDao.getAllStudent();
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
