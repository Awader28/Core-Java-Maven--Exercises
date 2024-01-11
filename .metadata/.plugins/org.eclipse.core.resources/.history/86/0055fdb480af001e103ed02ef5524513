package com.internship.day07.exception.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) {
        final String driver = "com.mysql.jdbc.Driver";
        final String url = "jdbc:mysql://localhost:3306/avion?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";
        final String user = "root";
        final String pass = "atharva28";
        //String insert = "INSERT INTO `internship`.`tblemployee` (`name`, `city`, `salary`) VALUES ('Atharva', 'Palghar', '12354');";
        final String insert2 = "INSERT INTO `internship`.`tblemployee` (`name`, `city`, `salary`) VALUES ('Soshor', 'Popoe', '12355984');";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("CONNECTION SUCCESSFUL");
   
            // Create a statement and execute the insert query
            Statement statement = con.createStatement();
            int rowsAffected = statement.executeUpdate(insert2);
            statement.executeUpdate(insert2); 
            if (rowsAffected > 0) {
                System.out.println("Insertion successful");
            } else {
                System.out.println("Insertion failed");
            }

            statement.close();
            con.close();
            //Close the connection and statement
            

        } catch (ClassNotFoundException e1) {
            System.out.println("DATABASE DRIVER NOT FOUND");
        } catch (SQLException e) {
            System.out.println("SQL RELATED EXCEPTION: " + e.getMessage());
        }
        finally {
        	
		}
    }
}
