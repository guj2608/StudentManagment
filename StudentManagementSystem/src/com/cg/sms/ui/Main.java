package com.cg.sms.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.sms.dto.Student;
import com.cg.sms.service.StudentService;
import com.cg.sms.service.StudentServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

StudentService service=new StudentServiceImpl();
Scanner sc=new Scanner(System.in);
int ch;
String mob;
String course;
do {
System.out.println("1.ADD STUDENT");
System.out.println("2. DISPLAY STUDENT DETAILS");
System.out.println("1.UPDATE DETAILS");
System.out.println("1.DISPLAY STUDENT LIST");
System.out.println("ENTER YOUR CHOICE");

 ch=sc.nextInt();


	
switch(ch){
case 1 :
	
System.out.println("Enter name");
String name=sc.next();

System.out.println("Enter course name");
String cname=sc.next();

System.out.println("age");
int age=sc.nextInt();

System.out.println("Enter Mobile No");
 mob=sc.next();

 Student student = new Student();
student.setName(name);
student.setCoursename(cname);
student.setAge(age);
student.setMobileNo(mob);
int rn=service.addStudent(student);
System.out.println("Studen record added "+rn);

break;

case 2 :
	System.out.println("ENTER ROLL NO.");
	rn=sc.nextInt();
	
	student=service.getStudent(rn);
	if(student==null)
		System.out.println("Record not found");
 
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getCoursename());
		System.out.println(student.getMobileNo());
		
		break;
		
		


case 3 :
	 
	System.out.println("ENTER ROLL NO.");
	rn=sc.nextInt();
	student=service.getStudent(rn);	
	
	if(student == null)
		System.out.println("record not found");
	
	else{
	
		System.out.println("enter mobile number");
		mob= sc.next();
		student.setMobileNo(mob);
		System.out.println("record upodated");
		System.out.println(student.getName());
		System.out.println(student.getMobileNo());
	
	}

case 4 :

	System.out.println("Enter course name");
	course=sc.next();
	
	ArrayList<Student> list= service.getStudentList(course);
	if(list.size()==0)
		System.out.println("No student enrolled to this record");
	
	else{
		for(Student s: list){
			System.out.println(s.getName()+" "+s.getMobileNo());
		}
	}
} //end of switch
	
}
while(ch!=5);

	}
}
