package com.internship.day16.database.dynamic;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.internship.day16.database.dynamic.repo.Delete;

public class DeleteQu implements Delete {
	public static String del = "DELETE FROM tblEmployee WHERE id=?;";

	@Override
	public void delete() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner(System.in);
		PreparedStatement p=Connectiondb.getConnection2().prepareStatement(del);
		System.out.println("ENTER ID TO DELETE: ");
		int id= Sc.nextInt();
		p.setInt(1, id);
		p.executeUpdate();

	}

}
