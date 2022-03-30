//inserting data into company database employee table 
package com.trinity.jdbcCon;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.sql.*;

public class EmployeeDetails {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
try {
	Statement st = con.createStatement();
	ResultSet set = st.executeQuery("select * from employee");
	
	//insert values into database(table)

	String query="insert into employee values('Kalim','L','Agasar','cs181907','1997-03-13','Khanapur', 'F',45000,'S14143679',0000)";
		int sss=st.executeUpdate(query);
//		if(sss!=0) {
//			System.out.println("Data added");
//		}
//		else
//			System.out.println("no added");
		
	while (set.next()) {
		System.out.println(set.getString(1) + "\t" + set.getString(2) + "\t" + set.getString(3) + "\t"+ set.getString(4) + "\t" + set.getString(5) + "\t" + set.getString(6) + "\t" + set.getString(7) + "\t"+ set.getString(8) + "\t" + set.getString(9) + "\t" + set.getString(10));
	} 
	st.close();
	con.close();
	
} catch(Exception e) {
	System.err.println(e.getMessage());
}
		
	}
}
