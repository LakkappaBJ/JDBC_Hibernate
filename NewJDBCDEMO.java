package com.xworkz.mysqlJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewJDBCDEMO {
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql:///student", "root", "root");
			Statement st=con.createStatement();
			String query="select student_name from studentDetails";
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(1)/*+"\t"+rs.getString(2)+""+rs.getString(3)*/);
			}
			con.close();
			st.close();
			
		} catch (SQLException e) {
			System.err.println(e);
		}
	}
}
