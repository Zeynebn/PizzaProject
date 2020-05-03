package application;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author umer
 *
 */
public class admin {
	Connection connection;
	
	public admin(){
		connection = SqliteConnection.Connector();
		   if (connection == null) {

		   System.out.println("connection not successful");
		    System.exit(1);}
	}
	public boolean check(boolean a ,int id) throws SQLException {
		String query2 = "UPDATE ordering SET checking = '"+a+"' WHERE ID = "+id+";";
		try {
			Statement st = connection.createStatement();
			st.execute(query2);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
