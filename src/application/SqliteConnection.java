package application;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author umer
 *
 */
public class SqliteConnection {
	public static Connection Connector() {
		 try {
			 Class.forName("org.sqlite.JDBC");
			 Connection conn =DriverManager.getConnection("jdbc:sqlite:PizzaDb.sqlite");
			 return conn;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	 }
}
