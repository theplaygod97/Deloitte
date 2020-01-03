import java.io.IOException;
import java.sql.*;

public class LoadDrivers {

public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		 
		//Statement Object 
		Statement stmt=DBConnection.makeConnection().createStatement();  
		System.out.println("Driver Loaded and DB Connected");
		
		//Execute Query  
		ResultSet rs=stmt.executeQuery("select * from hr.customer");  
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
		//Close Connection  
		stmt.close();
		DBConnection.makeConnection().close();  
	}

}
