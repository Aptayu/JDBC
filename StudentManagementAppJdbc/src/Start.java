import java.sql.SQLException;
import java.util.*;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the App");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("PRESS 1 TO ADD Student");
			System.out.println("PRESS 2 TO Delete Student");
			System.out.println("PRESS 3 TO Display All Students");
			System.out.println("PRESS 4 TO Update App");
			int n = sc.nextInt();
			
			if(n == 1) {
				//Add
				System.out.println("Enter name :");
				String name = sc.next();
				
				System.out.println("Enter phone :");
				String phone = sc.next();
				
				System.out.println("Enter city :");
				String city = sc.next();
				
//				Create Student object to create Student
				Student st = new Student(name, phone, city);
				boolean answer = StudentDao.insertStudentToDB(st);
				
				if(answer) {
					System.out.println("Added Successfully");	
				}
				else {
					System.out.println("Something went wrong. Please look at the server logs for more details.");
				}
			}
			else if(n == 2) {
				//Delete
				System.out.println("Enter ID to delete");
				int userId = sc.nextInt();
				boolean f = StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Deleted Successfuly");
				}
				else {
					System.out.println("Something went wrong");
				}
			}
			else if(n == 3) {
				//Display
				StudentDao.displayStudents();
			}
			else if(n == 4) {
				//Update
				System.out.println("Update Student");
				StudentDao.displayStudents();
				System.out.println("Select an ID to Update");
				int userId = sc.nextInt();
				System.out.println("Enter new name");
				String name = sc.next();
				
				System.out.println("Enter new phone");
				String phone = sc.next();
				
				System.out.println("Enter new city");
				String city = sc.next();
				boolean f = StudentDao.updateStudent(userId, name, phone, city);
				if(f) {
					System.out.println("Updated Successfuly");
				}
				else {
					System.out.println("Something went wrong");
				}
				
			}
			else {
				break;
			}
		}
		System.out.println("Bye bye");
		
		
  
	}

}
