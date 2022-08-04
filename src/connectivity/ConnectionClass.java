package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

	public Connection getConnextion() {
		
		Connection databaselink = null;
		String dbName = "hotel_neptune";
		String userName = "root";
		String password = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
				databaselink = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName, userName, password);
				} catch(SQLException e){
					e.printStackTrace();
				}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return databaselink;	
	}
}
