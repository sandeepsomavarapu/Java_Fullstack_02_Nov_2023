package com.india.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTestDDL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		1)loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
//		2)creating the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/india", "root", "rpsconsulting");
//		3)creating the statement Statement,PreparedStatement,CallableStatement
		Statement stmt = conn.createStatement();
//		4)executing the query  DDL-->execute(),DML-->executeUpdate(),DRL-->executeQuery()
               stmt.execute("create table emps_hyd(eid int,ename varchar(20))");
//		5)closing the connection
		conn.close();
		System.out.println("table created");

	}

}
