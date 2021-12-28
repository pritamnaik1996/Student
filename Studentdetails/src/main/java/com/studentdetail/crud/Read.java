package com.studentdetail.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Read {
		public void read() {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			
				Connection con	 = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpm", "root","pritam1104");
			
			
			
			Statement stmt=con.createStatement();
			String query="select * from student";
			ResultSet rs=stmt.executeQuery(query);
			
			while (rs.next()) {
				System.out.println("STUDENT_NO: "+rs.getInt(1));
				System.out.println("STUDENT_NAME: "+rs.getString(2));
				System.out.println("STUDENT_DOB "+rs.getDate(3));
				System.out.println("STUDENT_DOJ"+rs.getDate(4));
				
				
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

