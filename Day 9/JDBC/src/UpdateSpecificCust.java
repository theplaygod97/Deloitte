import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateSpecificCust {

	public static void main(String[] args) throws SQLException, IOException {
		Customer customer = new Customer();
		customer.accept();
		
		Connection connection = DBConnection.makeConnection();
		PreparedStatement statement =
		connection.prepareStatement("UPDATE hr.customer SET customername = ? , "
													+ "customeraddress = ?, "
													+ "billamount = ? "
													+ "WHERE customerid = ?");
		statement.setInt(4, customer.getCustomerId());
		statement.setString(1, customer.getCustomerName());
		statement.setString(2, customer.getCustomerAdd());
		statement.setInt(3, customer.getBillAmount());
		
		statement.executeUpdate();
		
		System.out.println(customer.getCustomerName()+" ,your record saved successfully.");
	}
	}
