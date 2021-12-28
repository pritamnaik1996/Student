package com.studentdetail.crud;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("*******Welcome********");
	System.out.println("press 1 to to get all student info");
	System.out.println("press 2 to add new student");
	System.out.println("press 3 to update existing student_data");
	System.out.println("Press 4 to delete student");
	System.out.println("press 5 to search student");
	int i=sc.nextInt();
	
	if (i==1) {
		new Read().read();
	}
	else if (i==2) {
		new Create().create();
	}
	else if (i==3) {
	new Update().update();	
	}
	else if(i==4) {
		new Delete().delete();
	}
	else if (i==5) {
		new Search().searchById();
		
	}
	else {
		System.out.println("Please enter a valid input");
	}
}

}
