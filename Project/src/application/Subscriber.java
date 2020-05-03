package application;
import java.sql.Connection;
import java.sql.Statement;


/**
 * @author umer
 *
 */
public class Subscriber {
	String name;
	Connection connection;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public Subscriber(){
		connection = SqliteConnection.Connector();
		   if (connection == null) {

		   System.out.println("connection not successful");
		    System.exit(1);}
	}
	public String get_check(int id) {
		String query2 = "SELECT checking from ordering WHERE ID = "+id+";";
		String value = "";
		try {
			Statement st = connection.createStatement();
			st.execute(query2);
			value = st.getResultSet().getString(1);
			return value;
		} catch (Exception e) {
			// TODO: handle exception
			return value;
		}
	}
}
