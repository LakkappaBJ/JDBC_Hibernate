package com.trinity.jdbcCon;
//Database connection and fetching table values
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection2 {

	public static void main(String[] args) throws SQLException {
		Connection connection=DriverManager.getConnection("jdbc:mysql:///student", "root", "root");
		Statement statement=connection.createStatement();
		String query="select * from studentDetails";
		ResultSet set=statement.executeQuery(query);
		//set.next();
	while(set.next()) {
		System.out.println(set.getString(1)+" \t"+set.getString(2));	//number of columns 
	}

		connection.close();
		statement.close();

	}

}
