import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertProduct {

	public static void main(String[] args) throws Exception {
		Product product = new Product();
		product.accept();
		Connection connection = DBConnection.makeConnection();
		PreparedStatement statement =
				connection.prepareStatement("insert into hr.product values(?,?,?,?)");
				statement.setInt(1, product.getProductId());
				statement.setString(2, product.getProductName());
				statement.setInt(3, product.getPrice());
				statement.setInt(4, product.getQOH());
			
		int rowsAffected = statement.executeUpdate();
		System.out.println("Insert success with "+rowsAffected+" rows affected.");
		statement.close();
		connection.close();
	}

}
