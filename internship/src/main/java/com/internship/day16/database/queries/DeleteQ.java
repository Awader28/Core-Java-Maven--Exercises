package com.internship.day16.database.queries;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import com.internship.day16.database.repository.Delete;

public class DeleteQ implements Delete {
	public static String del="DELETE FROM tblEmployee WHERE id=16;";
	@Override
	public void delete() throws ClassNotFoundException, SQLException, IOException {
		Statement st= DbConnection.getConnection1().createStatement();
		
		st.execute(del);
		System.out.println("DEL SFUL");
	}

}
