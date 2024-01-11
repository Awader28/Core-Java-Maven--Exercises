package com.internship.day16.database.dynamic.repo;

import java.io.IOException;
import java.sql.SQLException;

public interface Fetch {
	public void fetch() throws ClassNotFoundException, SQLException, IOException;
	
}
