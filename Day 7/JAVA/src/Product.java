
public class Product {
private int productId;
private String productName;
private int qoh;
private int price;


	public Product(int productId, String productName, int qoh, int price) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.qoh = qoh;
	this.price = price;
}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getQoh() {
		return qoh;
	}


	public void setQoh(int qoh) {
		this.qoh = qoh;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [productId = " + productId + ", productName = " + productName + ", qoh = " + qoh + ", price = " + price
				+ "]";
	}


	public static void main(String[] args) {
		Product product1 = new Product(5,"Chips",10,10);
		System.out.println(product1);
		Product product2 = new Product(10,"Laptop",1,100000);
		System.out.println(product2);
		Product product3 = new Product(20,"Car",1,5000000);
		System.out.println(product3);

	}

}
