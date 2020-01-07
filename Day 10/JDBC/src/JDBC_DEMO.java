import java.io.IOException;
import java.sql.*;

public class JDBC_DEMO {

public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		 
		//Statement Object 
		Statement stmt=DBConnection.makeConnection().createStatement();  
		System.out.println("Driver Loaded and DB Connected");
		
		//Execute Query  
		ResultSet rs=stmt.executeQuery("select * from hr.customer");  
		ResultSetMetaData rsmd = rs.getMetaData();
		int cl=rsmd.getColumnCount();
		System.out.println(rsmd.getColumnName(1)
				+" "+rsmd.getColumnName(2)
				+" "+rsmd.getColumnName(3)
				+" "+rsmd.getColumnName(4));
		while(rs.next()) { 
		for(int i =1;i<=cl;i++) {
		System.out.print(rs.getString(i)+" ");
				
		}	
		System.out.println();
		}
		//Close Connection  
		stmt.close();
		DBConnection.makeConnection().close();  
	}

}
