package Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	 


		public Connection getConnection() {
		    Connection databaselink = null;
		    String dbName="hotel_neptune";
		    String userName="root";
		    String password="";
		    try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        try {
		            databaselink = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);
		        } catch (SQLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }


		    } catch (ClassNotFoundException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		    return databaselink;

		}
}
