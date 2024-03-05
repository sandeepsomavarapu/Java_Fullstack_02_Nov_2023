package com.india.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTestDRL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		1)loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
//		2)creating the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/india", "root", "rpsconsulting");
//		3)creating the statement Statement,PreparedStatement,CallableStatement
		Statement stmt = conn.createStatement();
//		4)executing the query  DDL-->execute(),DML-->executeUpdate(),DRL-->executeQuery()
		//int result = stmt.executeUpdate("insert into emps_hyd values(125,'rajesh')");
//		int result = stmt.executeUpdate("update emps_hyd set ename='narendra'");
		ResultSet result = stmt.executeQuery("select * from emps_hyd");
//		5)closing the connection
		
		while(result.next())
		{
			System.out.println(result.getInt("eid")+" "+result.getString(2));
		}
		conn.close();
		

	}

}
