package com.internship.day16.database.queries;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import com.internship.day16.database.repository.Update;

public class UpdateQ implements Update {
	
	public static String upd="UPDATE tblEmployee SET name='Dineshwar', city='Agra' WHERE id=17;";

	 public void update() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Statement st = DbConnection.getConnection1().createStatement();

		st.execute(upd);
		System.out.println("UPD SFUL");
	}

}
