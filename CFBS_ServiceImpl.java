package com.CFBSProj.sayali.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.CFBSProj.sayali.model.Branch;
import com.CFBSProj.sayali.model.Course;
import com.CFBSProj.sayali.model.Faculty;
import com.CFBSProj.sayali.model.Student;
import com.CFBSProj.sayali.service.CFBS_Service;

public class CFBS_ServiceImpl implements CFBS_Service {

	Scanner sc = new Scanner(System.in);
	List<Course> cList = new ArrayList<Course>();
	List<Faculty> fList = new ArrayList<Faculty>();
	List<Branch> bList = new ArrayList<Branch>();
	List<Student> sList = new ArrayList<Student>();

	@Override
	public void addCourse() {
		System.out.println("Enter how many courses you wand to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Course c = new Course();
			System.out.println("Enter cId");
			int cId = sc.nextInt();
			c.setcId(cId);
			System.out.println("Enter course name");
			String cName = sc.next();
			c.setcName(cName);// set name to course
			cList.add(c);// Adding to course to cList
		}
		System.out.println("courses added successfully......");
	}

	@Override
	public void displayCourse() {
		System.out.println("Course DEtails..");
		for (Course course : cList) {
			System.out.println(course);
		}

	}

	@Override
	public void addFaculty() {
		System.out.println("Enter how many Faculty you wand to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Faculty f = new Faculty();
			System.out.println("Enter fId");
			int fId = sc.nextInt();
			f.setfId(fId);
			System.out.println("Enter Faculty name");
			String fName = sc.next();
			f.setfName(fName);// set name to course
			System.out.println("Enetr the cId from bleow mentioned course list that will get added to faculty");
			displayCourse();
			int cid = sc.nextInt();
			for (Course c : cList) {
				if (c.getcId() == cid) {
					f.setC(c); //this came from reference object Aggregation concept
					break;
				} else {
					continue;
				}
			}
			fList.add(f);// Adding to course to cList
		}
		System.out.println("Faculties added successfully......");
	}

	@Override
	public void displayFaculty() {
		System.out.println("Facuty DEtails..");
		for (Faculty faculty : fList) {
			System.out.println(faculty);
		}

	}

	@Override
	public void addBatch() {
		System.out.println("Enter how many Batch you wand to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Branch b = new Branch();
			System.out.println("Enter BId");
			int bId = sc.nextInt();
			b.setbId(bId);
			System.out.println("Enter Batch name");
			String bName = sc.next();
			b.setbName(bName);// set name to course
			System.out.println("Enetr the fId from bleow mentioned faculty list that will get added to faculty");
			displayFaculty();
			int fid = sc.nextInt();
			for (Faculty f : fList) {
				if (f!=null && f.getfId() == fid) {
					b.setF(f); //this came from reference object Aggregation concept
					break;
				} else {
					continue;
				}
			}
			bList.add(b);// Adding to course to cList
		}
		System.out.println("Batch added successfully......");
	}

	@Override
	public void displayBatch() {
		System.out.println("Batch DEtails..");
		for (Branch batch : bList) {
			if(batch !=null) {
			System.out.println(batch);
		}

		}
	}

	@Override
	public void addStudent() {
		System.out.println("Enter how many Students you want to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Student s = new Student();
			System.out.println("Enter sId");
			int sId = sc.nextInt();
			s.setsId(sId);
			System.out.println("Enter Student name");
			String sName = sc.next();
			s.setsName(sName);// set name to Batch
			System.out.println("Enetr the bId from bleow mentioned Batch list that will get added to Student");
			displayBatch();
			int bid = sc.nextInt();
			for (Branch b : bList) {
				if (b!=null && b.getbId() == bid) {
					s.setB(b); //this came from reference object Aggregation concept
					break;
				} else {
					continue;
				}
			}
			sList.add(s);// Adding to course to cList
		}
		System.out.println("Studentd added successfully......");

	}

	@Override
	public void displayStudent() {
		System.out.println("Student DEtails..");
		for (Student student : sList) {
			if(student !=null) {
			System.out.println(student);
		}

		}

	}

	@Override
	public void updateStudent() {
		System.out.println("Update Student so enter Student Id");
		int studId=sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		boolean flag=true;
		
		while (flag) {
			System.out.println("|** Update Details: **|");
			System.out.println("    1: Update Student Details  ");
			System.out.println("    2: Update Batch Details    ");
			System.out.println("    3: Update Faculty Details  ");
			System.out.println("    4: Update Course Details   ");
			System.out.println("    5: EXIT                    ");

			System.out.println("** ENTER YOUR CHOICE **");
			int choice = sc1.nextInt();

			
			switch (choice) {
			case 1:
				for (Student s : sList) {
					if (sList != null && s.getsId() == studId) {
						System.out.println("Enter Student name you want to upadate:");
						s.setsName(sc.next());
						System.out.println("Student name successfully updated!!");
					}
				}
				//displayStudent();
				break;

			case 2:

				for (Student s : sList) {
					if (sList != null && s.getsId() == studId) {
						System.out.println("Enter Batch name you want to upadate:");
						s.getB().setbName(sc.next());
						System.out.println("Batch name successfully updated!!");
					}
				}
				//displayBatch();
				break;

			case 3:

				for (Student s : sList) {
					if (sList != null && s.getsId() == studId) {
						System.out.println("Enter Faculty name you want to upadate:");
						s.getB().getF().setfName(sc.next());
						System.out.println("Faculty name successfully updated!!");
					}
				}
				//displayFaculty();
				break;

			case 4:

				for (Student s : sList) {
					if (sList != null && s.getsId() == studId) {
						System.out.println("Enter Course name you want to upadate:");
						s.getB().getF().getC().setcName(sc.next());;
						System.out.println("Course Name successfully updated!!");
					}
				}
				//displayCourse();
				break;

			case 5:
				flag = false;
				break;

			default:
				System.out.println("Wrong Choice");
				break;

			}

		}

	}

	@Override
	public void DeleteStudent() {
		
		System.out.println("Enter studentID you want to delete");
		int studentid=sc.nextInt();
	Student delete_stud=null;
	for(Student student:sList) {
		if(sList!=null && studentid==student.getsId()) {
			delete_stud=student;
		}
	}
	sList.remove(delete_stud);
	System.out.println("Student removed Successfully");
	}
		
		
	}


