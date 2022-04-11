//creating table without use select query
package com.trinity.jdbcCon;

import java.sql.DriverManager;
import java.sql.*;
public class EmloyeeDetails {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/employee"; //employee=db name
		String username="root";
		String password="root";
		String query="create table EmployeeDetail(enum int(10),ename varchar(15),esalary int(10));";
		Connection con=DriverManager.getConnection(url, username,password );
		Statement st=con.createStatement();
		st.executeUpdate(query); //using without select query
		System.out.println("Table created Successfully");
		st.close();
		con.close();
		
		//int rs=st.executeUpdate(query);
		
		
	}

}
