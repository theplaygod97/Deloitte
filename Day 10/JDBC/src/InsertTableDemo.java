import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;


public class InsertTableDemo {

	public static void main(String[] args) throws IOException, SQLException {
		Connection connection = DBConnection.makeConnection();	
		 
		try{
			   //Assume a valid connection object conn
			   connection.setAutoCommit(false);
			   Statement statement = connection.createStatement();
			   
			   //set a Savepoint
			   Savepoint Savepoint = connection.setSavepoint();
			   String SQL1 = "insert into hr.student values(58,'Bhuvi','BBS',500)";
			   statement.executeUpdate(SQL1);  
			   int rowsAffected = statement.executeUpdate(SQL1);
			   System.out.println("Insert success with "+rowsAffected);
			   //Submit a malformed SQL statement that breaks
			   String SQL2 ="insert into hr.student values(258s,'Bibhu','BBS',50000)";
			   statement.executeUpdate(SQL2);
			   int rowsAffected2 = statement.executeUpdate(SQL2);
			   System.out.println("Insert success with "+rowsAffected2);
			   // If there is no error, commit the changes.
			   connection.commit();

			}catch(SQLException se){
			   
			// If there is any error.
			   connection.rollback();
			}
	}

}
