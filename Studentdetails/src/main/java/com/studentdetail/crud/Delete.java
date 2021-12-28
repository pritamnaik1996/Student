package com.studentdetail.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	public void delete() {
		int id;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID to delete the record:");
		id=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
			Connection con2	 = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpm", "root","pritam1104");
		
		String query="delete from  STUDENT where STUDENT_NO=?";
		PreparedStatement ptsmt=con2.prepareStatement(query);
		
		
		ptsmt.setInt(1,id);
		
		
		int i=ptsmt.executeUpdate();
		if (i==0) {
			System.out.println("Record not deleted");
		} else {
	System.out.println("Record deleted successfully");
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
