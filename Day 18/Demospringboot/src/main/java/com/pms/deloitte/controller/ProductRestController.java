package com.pms.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@Controller
public class ProductRestController {
	@Autowired
	ProductService productService;
	
	@RequestMapping("productForm")
	public ModelAndView productForm() {
		ModelAndView view = new ModelAndView();
		List<Product> allProducts = productService.listProducts();
		view.addObject("allProducts",allProducts);
		view.addObject("product",new Product());	
		return view;
	}
	
	@RequestMapping(value= {"/updateProduct/saveProduct", "saveProduct"})
	
	public ModelAndView saveProduct(Product product) {
		ModelAndView view  = new ModelAndView("redirect:/productForm");
		System.out.println(product);
		if(product.getProductId()>0) {
		productService.addProduct(product);
		}
		view.addObject("product",new Product());
		return view;
	}
	@RequestMapping("deleteProduct/{prodId}")
	public ModelAndView deleteProduct(@PathVariable("prodId")Integer productId) {
		System.out.println("#*#*Product deleted*#*#"+productId);
		productService.deleteProduct(productId);
		ModelAndView view  = new ModelAndView("redirect:/productForm");
		
		
		view.addObject("product", new Product());
		return view;
	}
	
	  @RequestMapping("updateProduct/{prodId}") public ModelAndView
	  updateProduct(@PathVariable("prodId")Integer productId) {
	  System.out.println("#*#*Product upadted*#*#"+productId); Product product =
	  productService.getProduct(productId); List<Product> allProducts =
	  productService.listProducts();
	  
	  ModelAndView view = new ModelAndView("productForm");
	  view.addObject("allProducts",allProducts); view.addObject("product",
	  product); return view;
	  
	  }
	 
	
}
