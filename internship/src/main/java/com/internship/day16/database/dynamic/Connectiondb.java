package com.internship.day16.database.dynamic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class Connectiondb {
	
	static String insert="insert into tblEmployee (id,name,city,salary) values(?,?,?,?);";
	
	public static Connection getConnection2() throws ClassNotFoundException, SQLException, IOException {
		String DRIVER_STRING;
		String DB_URL;
		String DB_USERNAME;
		String Db_PASSWORD;

		File file1 = new File(
				"C:\\Users\\Atharva\\Documents\\Maven\\internship\\src\\main\\java\\com\\internship\\day15\\jdbc\\db.properties");
		FileInputStream ff = new FileInputStream(file1);

		Properties p1 = new Properties();

		p1.load(ff);

		DRIVER_STRING = p1.getProperty("driver");
		DB_URL = p1.getProperty("db_url");
		DB_USERNAME = p1.getProperty("db_username");
		Db_PASSWORD = p1.getProperty("db_password");
		
		String fetch = "SELECT id, name, city, salary FROM tblEmployee;";

		Class.forName(DRIVER_STRING);
		Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, Db_PASSWORD);
		System.out.println("CONNECTION TO DB ESTABLISHED SUCCESSFULLY");
		return conn;
		
		
	}

}
