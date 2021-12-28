package com.studentdetail.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	public void update() {
		System.out.println("Enter the Student no of student u want to update");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		System.out.println("press 1 to update student no");
		System.out.println("press 2 to update the student Name");
		System.out.println("press 3 to update student DOB");
		System.out.println("Press 4 to update student DOJ");
		int req=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
			Connection con2	 = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpm", "root","pritam1104");
			if (req==1) {
				int no;
			
					System.out.println("Enter the new Student no u want to update:");
			no=sc.nextInt();	
		String s2="update  STUDENT set STUDENT_NO=? where STUDENT_NO=?";
		PreparedStatement ptsmt=con2.prepareStatement(s2);
		
		
		
		ptsmt.setInt(1, no);
		ptsmt.setInt(2,id);
		
		int i=ptsmt.executeUpdate();
		if (i==0) {
			System.out.println("Record not updated");
		} else {
System.out.println("Record updated successsfully");
		}
			}
		
		else if (req==2) {
				String name;
			
					System.out.println("Enter the Name u want to update:");
			name=sc.next();	
		String s2="update  STUDENT set STUDENT_NAME=? where STUDENT_NO=?";
		PreparedStatement ptsmt=con2.prepareStatement(s2);
		
		
		
		ptsmt.setString(1,name );
		ptsmt.setInt(2,id);
		
		int i=ptsmt.executeUpdate();
		if (i==0) {
			System.out.println("Record not updated");
		} else {
System.out.println("Record updated successsfully");
		}
		
		
			}
			
	else if (req==3) {
				String dob;
				
				System.out.println("Enter the student DOB u want to update(YYYY-MM-DD):");
		dob=sc.next();	
	String s2="update  STUDENT set STUDENT_DOB=? where STUDENT_NO=?";
	PreparedStatement ptsmt=con2.prepareStatement(s2);
	
	
	
	ptsmt.setString(1,dob );
	ptsmt.setInt(2,id);
	
	int i=ptsmt.executeUpdate();
	if (i==0) {
		System.out.println("Record not updated");
	} else {
System.out.println("Record updated successfully");
	}
			}
			
	else if (req==4) {
		String doj;
		
		System.out.println("Enter the DOJ u want to update:");
doj=sc.next();	
String s2="update  STUDENT set STUDENT_DOJ=? where STUDENT_NO=?";
PreparedStatement ptsmt=con2.prepareStatement(s2);



ptsmt.setString(1,doj );
ptsmt.setInt(2,id);

int i=ptsmt.executeUpdate();
if (i==0) {
System.out.println("Record not updated");
} else {
System.out.println("Record updated successfully");
}
	}
	else {
		System.out.println("Plese enter valid number");
	}
	
		con2.close();
		
		}
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		
		
	
		
	}
}
