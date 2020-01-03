import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class DisplayAllProduct {

	
public static void main(String[] args) throws IOException, SQLException {
			Connection connection  = DBConnection.makeConnection();
			Statement statement = connection.createStatement();

			System.out.println("Done");
			ResultSet rs=statement.executeQuery("select * from hr.product ORDER BY ProductID ASC");  
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println(rsmd.getColumnName(1)
					+" "+rsmd.getColumnName(2)
					+" "+rsmd.getColumnName(3)
					+" "+rsmd.getColumnName(4));
			while(rs.next()) { 
			
			System.out.println(rs.getInt(1)
					+" "+rs.getString(2)
					+" "+rs.getString(3)
					+" "+rs.getInt(4));  
			}	
		}

	}
