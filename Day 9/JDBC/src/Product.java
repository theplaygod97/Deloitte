import java.util.Scanner;

public class Product {
	private int ProductId;
	private String ProductName;
	private int Price;
	private int QOH;
	
	
	public Product(int productId, String productName, int price, int qOH) {
		super();
		ProductId = productId;
		ProductName = productName;
		Price = price;
		QOH = qOH;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product id : "); ProductId = scanner.nextInt();
		System.out.println("Enter product name : "); ProductName = scanner.next();
		System.out.println("Enter price : "); Price = scanner.nextInt();
		System.out.println("Enter qoh : "); QOH = scanner.nextInt();
	}
	
	public void update() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product id of the product u want to update : "); ProductId = scanner.nextInt();
		System.out.println("Enter new product name : "); ProductName = scanner.next();
		System.out.println("Enter new price : "); Price = scanner.nextInt();
		System.out.println("Enter new qoh : "); QOH = scanner.nextInt();
	}
	
	public int getProductId() {
		return ProductId;
	}


	public void setProductId(int productId) {
		ProductId = productId;
	}


	public String getProductName() {
		return ProductName;
	}


	public void setProductName(String productName) {
		ProductName = productName;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}


	public int getQOH() {
		return QOH;
	}


	public void setQOH(int qOH) {
		QOH = qOH;
	}


	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", Price=" + Price + ", QOH=" + QOH
				+ "]";
	} 
	
	
	
}
