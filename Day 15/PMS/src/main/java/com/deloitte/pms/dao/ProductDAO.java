package com.deloitte.pms.dao;


import java.util.List;

import com.deloitte.pms.model.Product;

public interface ProductDAO {

	public boolean addProduct(Product product);

	public boolean updateProduct(Product product);

	public boolean deleteProduct(int productId);

	public List<Product> listProduct();

	public Product findProduct(int productId);

	public boolean isProductExists(int productId);
	
	public List<Product> filterProduct(int price);
	
	

}