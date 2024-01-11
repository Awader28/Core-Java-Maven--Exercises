package com.internship.day16.database.queries;

import java.io.IOException;
import java.sql.SQLException;

public class Caller {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		InsertQ i = new InsertQ();
		i.add();
		
		FetchQ f = new FetchQ();
		f.display();
		System.out.println("____________________________________________________________");
		DeleteQ d= new DeleteQ();
		d.delete();
		f.display();
		System.out.println("_____________________________________________________________");
		UpdateQ u= new UpdateQ();
		u.update();
		f.display();
		
	}

}
