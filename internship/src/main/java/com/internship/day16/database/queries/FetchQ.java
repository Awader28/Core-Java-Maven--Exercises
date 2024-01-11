package com.internship.day16.database.queries;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.internship.day16.database.repository.Fetch;

public class FetchQ implements Fetch{
	
	public static String fetch= "select id, name, city, salary from tblEmployee;";
	@Override
	public void display() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Statement st= DbConnection.getConnection1().createStatement();
		ResultSet rs= st.executeQuery(fetch);
		System.out.println("ID"+"\t"+"NAME"+"\t"+"CITY"+"\t \t"+"SALARY");
		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
		}
		
		st.close();
	}

}
