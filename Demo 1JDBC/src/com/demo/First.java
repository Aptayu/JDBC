package com.demo;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class First {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello again in student manage app");
//		Write basic crud operation
		Scanner sc = new Scanner(System.in);
		boolean applicationOn = true;
		while(applicationOn) {
		System.out.println("Enter 1 to add student");
		System.out.println("Enter 2 to delete student");
		System.out.println("Enter 3 to update student");
		System.out.println("Enter 4 to view student");
		System.out.println("Enter 0 to exit app");
			
		
		
		int input = sc.nextInt();
		
		
//		switch expression is evaluated only once. Please use break if you want to execute only that case if you'll
//		not use break all the following cases will be executed after it
		
		switch(input){
			case 0:
				System.exit(input);
			
			case 1:
				System.out.println("Enter student name");
				String sname = sc.next();
				
				System.out.println("Enter student id");
				String sid = sc.next();
				
				System.out.println("Enter student class");
				String sclass = sc.next();
				
				Student student = new Student(sid, sname, sname);
				StudentDao.add(student);
				
				break;
				
			case 2:
				System.out.println("Enter student id");
				sid = sc.next();
//				To remove student
				break;
			case 3:
				System.out.println("Enter student id to update");
				sid = sc.next();
				
				System.out.println("Press 1 to update name ");
				System.out.println("Press 2 to update class ");
				int toUpdate = sc.nextInt();
				if(toUpdate == 1) {
					String snewname = sc.next();
//					
					
				}
				else if(toUpdate == 2) {
					String snewclass = sc.next();
//					
					
				}
				else {
					System.out.println("Provide correct input");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("Press 1 to update name ");
					System.out.println("Press 2 to update class ");
				}
			case 4: 
				System.out.println("Enter student id to view student details");
				int toView = sc.nextInt();
				
				
			default:
			System.out.println("Invalid Input. Provide correct input. Press 0 to exit");
			
			
			TimeUnit.SECONDS.sleep(2);
		}
		
		
		
		}

	}

}
