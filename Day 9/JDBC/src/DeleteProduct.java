import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteProduct {

	public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter product ID which you want to delete :");
			int PID = sc.nextInt();
			Connection connection = DBConnection.makeConnection();
			PreparedStatement statement =
				connection.prepareStatement("DELETE FROM HR.PRODUCT WHERE PRODUCTID = ?");
				statement.setInt(1, PID);
					
			int rowsAffected = statement.executeUpdate();
			System.out.println("Delete success with "+rowsAffected+" rows affected.");
			statement.close();
			connection.close();
		}

	}
