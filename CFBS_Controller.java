package com.CFBSProj.sayali.controller;

import java.util.Scanner;

import com.CFBSProj.sayali.service.CFBS_Service;
import com.CFBSProj.sayali.serviceimpl.CFBS_ServiceImpl;



public class CFBS_Controller {

	public static void main(String[] args) {
		System.out.println("-----Welcome To Bank------");
		Scanner sc=new  Scanner(System.in);
		boolean flag=true;
		CFBS_Service cfbs_Service=new CFBS_ServiceImpl();//indirect object
		while(flag) {
			System.out.println("1:create Course        |");
			System.out.println("2:show Course          |");
			System.out.println("3:Create Faculties     |");
			System.out.println("4:Show Faculties       |");
			System.out.println("5:Create Batch         |");
			System.out.println("6:Show Batch           |");
			System.out.println("7:Create Stuent        |");
			System.out.println("8:Show Student         |");
			System.out.println("9.UpdateStudent        |");
			System.out.println("10.DeleteStudent       |");
			System.out.println("11.:Exit               |");
			
			
			System.out.println("Enter your choice in betwwen 1 to 9");
			int ch=sc.nextInt();
			
			switch (ch) {
			
			case 1:
				cfbs_Service.addCourse();
				break;
			case 2:
				cfbs_Service.displayCourse();
				break;
			case 3:
				cfbs_Service.addFaculty();
				break;
			case 4:
				cfbs_Service.displayFaculty();
			case 5:
				cfbs_Service.addBatch();
				break;
			case 6:
				cfbs_Service.displayBatch();
				break;
			case 7:
				cfbs_Service.addStudent();
				break;
			case 8:
				cfbs_Service.displayStudent();
				break;
			case 9:
				cfbs_Service.updateStudent();
				break;
			case 10:
				cfbs_Service.DeleteStudent();
				break;
			case 11:
				flag=false;
				break;

			default:
				System.out.println("Invalid choice please enter choice to continue:");
				break;
			}
		}
		sc.close();
	
	}
}
