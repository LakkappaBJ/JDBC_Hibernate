package com.trinity.jdbcCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDetails {

	public static void main(String[] args) throws SQLException, Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		Statement statement=con.createStatement();
		String query="select * from studentDetails";
		ResultSet st=statement.executeQuery(query);
		while(st.next()) {
			System.out.println(st.getString(1)+" "+st.getString(2)+" "+st.getString(3));
		}
		st.close();
		con.close();
	}
}
