package com.deloitte.pms.dao;

import com.Product;



import java.util.List;


public interface ProductDAO {

	public boolean addProduct(Product product);

	public boolean updateProduct(Product product);

	public boolean deleteProduct(int productId);

	public List<Product> listProduct();

	public Product findProduct(int productId);

	public boolean isProductExists(int productId);
	
	public List<Product> filterProduct(int price);
	
	

}