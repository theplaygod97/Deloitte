import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableDemo {

	public static void main(String[] args) throws IOException, SQLException {
		Connection connection = DBConnection.makeConnection();
		Statement statement = connection.createStatement();
		String insertQuery = "insert into hr.student values(258,'Bibhu','BBS',50000)";
		int rowsAffected = statement.executeUpdate(insertQuery);
		System.out.println("Insert success with "+rowsAffected);
	}

}
