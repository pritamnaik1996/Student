package com.studentdetail.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Create {
	public void create()  {
		Scanner sc=new Scanner(System.in);
		int no;
		String name;
		String DOB;
		String DOJ;
		System.out.println("Enter no of Student:");
		no=sc.nextInt();
		System.out.println("Enter Name of Student:");
		name=sc.next();
		System.out.println("Enter DOB of Student(YYYY-MM-DD):");
		DOB=sc.next();
		System.out.println("Enter DOJ of Student(YYYY-MM-DD):");
		DOJ=sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
			Connection con	 = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpm", "root","pritam1104");
		
		String query="insert into STUDENT values(?,?,?,?)";
		PreparedStatement ptsmt=con.prepareStatement(query);
		
		ptsmt.setInt(1, no);
		ptsmt.setString(2, name);
		ptsmt.setString(3,DOB);
		ptsmt.setString(4,DOJ);
		
		int i=ptsmt.executeUpdate();
		if (i==0) {
			System.out.println("Record not inserted");
		} else {
System.out.println("Record inserted successsfully");
		}
	
		con.close();
		
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
