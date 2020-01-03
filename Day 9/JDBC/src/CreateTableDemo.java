import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

	public static void main(String[] args) throws IOException, SQLException {
		Connection connection  = DBConnection.makeConnection();
		Statement statement = connection.createStatement();
		String query = "create table hr.salary(customerid integer,salary integer)";
		statement.execute(query);
		System.out.println("Done");

	}

}
