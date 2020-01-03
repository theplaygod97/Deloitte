import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class SynInsensUpdate {
public static void main (String[] args) throws Exception       {
	Connection conn = null;
	try
	    {
		conn = DBConnection.makeConnection();
	 
	Statement stmt =  conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  ResultSet.CONCUR_UPDATABLE);
	 
	ResultSet rs = stmt.executeQuery("SELECT hr.student.* FROM HR.STUDENT");
	System.out.println("Before...");
	System.out.println("ID     Name     Degree     Semester");
	while (rs.next() ) {
	System.out.println( rs.getInt(1) +"      "+rs.getString(2)+"      "+rs.getString(3)+"     "+rs.getInt(4));
	}
	//inserting a new row
	    rs.moveToInsertRow();
	    rs.updateInt("id", 3);
	    rs.updateString("name", "Geeta");
	    rs.updateString("degree", "B.E.");
	    rs.updateInt("semester", 3);
	    rs.insertRow();
	//updating 2nd row – changing name to Seetha
	    rs.absolute(2);
	    rs.updateString(2,"Seetha");
	    rs.updateRow();
	 
	 rs.beforeFirst();      
	System.out.println("After...");
	System.out.println("ID     Name      Degree     Semester");
	while (rs.next() ) {
	System.out.println( rs.getInt(1) +"      "+rs.getString(2)+"       "+rs.getString(3)+"     "+rs.getInt(4)); }}
	catch (SQLException e) {  System.err.println ("Failed to connect to database" +e);
	}
	finally {if (conn != null)    {
	try {conn.close ();
	} 
	catch (SQLException e) {
		
	}     
	}         
	}     
	} 
}