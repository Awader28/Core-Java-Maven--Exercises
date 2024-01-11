package com.internship.day16.database.dynamic;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.internship.day16.database.dynamic.repo.Create;

public class InsertQu implements Create{
	static String insert = "INSERT INTO tblEmployee (id, name, city, salary) VALUES (?, ?,?,?);";

	@Override
	public void add() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		PreparedStatement pStatement=Connectiondb.getConnection2().prepareStatement(insert);

		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER ID: ");
		int id=sc.nextInt();
		System.out.println("ENTER NAME");
		String name=sc.next();
		System.out.println("ENTER CITY");
		String city= sc.next();
		System.out.println("ENTER TANKHWAH");
		int tankhwah=sc.nextInt();
		
		pStatement.setInt(1, id);
		pStatement.setString(2,name);
		pStatement.setString(3,city);
		pStatement.setInt(4, tankhwah);
		pStatement.executeUpdate();
		System.out.println("DATA INSERTED");
	}

}
