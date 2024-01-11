package com.internship.day16.database.dynamic;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.internship.day16.database.dynamic.repo.Update;

public class UpdateQu implements Update{
	public static String upd="UPDATE tblEmployee SET name=?, city=?,salary=? WHERE id=?;";
	@Override
	public void update() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		PreparedStatement p=Connectiondb.getConnection2().prepareStatement(upd);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER ID TO UPDATE: ");
		int id=sc.nextInt();
		System.out.println("ENTER NAME TO UPDATE: ");
		String name=sc.next();
		System.out.println("ENTER CITY TO UPDATE: ");
		String city=sc.next();
		System.out.println("ENTER SALARY TO UPDATE");
		int salary=sc.nextInt();
		
		p.setString(1, name);
		p.setString(2,city);
		p.setInt(3, salary);
		p.setInt(4, id);
		
		p.executeUpdate();
		System.out.println("DATA UPDATED");
		
		
		
		
		
	}

}
