import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateProductTable {

	public static void main(String[] args) throws IOException, SQLException {
		Connection connection  = DBConnection.makeConnection();
		Statement statement = connection.createStatement();
		String query = "create table hr.product(productid int,"
											+ "productname varchar(20),"
											+ "price int,"
											+ "qoh int)";
		statement.execute(query);
		System.out.println("Done");
		
	}

}
