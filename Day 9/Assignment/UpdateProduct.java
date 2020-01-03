import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateProduct {

		public static void main(String[] args) throws SQLException, IOException {
			Product product = new Product();
			product.update();
			
			Connection connection = DBConnection.makeConnection();
			PreparedStatement statement =
			connection.prepareStatement("UPDATE hr.product SET productname = ? , "
														+ "price = ?, "
														+ "qoh = ? "
														+ "WHERE productid = ?");
			statement.setInt(4, product.getProductId());
			statement.setString(1, product.getProductName());
			statement.setInt(2, product.getPrice());
			statement.setInt(3, product.getQOH());
			
			statement.executeUpdate();
			
			System.out.println(product.getProductName()+" ,record updated successfully.");
		}
		}
