package com.pms.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pms.deloitte.model.Product;

@Controller
public class ProductController {
	
	@RequestMapping("saveProduct")
	public ModelAndView saveProduct(Product product) {
		ModelAndView view  = new ModelAndView();
		view.addObject("command",new Product());
		view.setViewName("productForm");
		System.out.println(product);
		return view;
	}
	@RequestMapping("deleteProduct")
	public ModelAndView deleteProduct() {
		ModelAndView view  = new ModelAndView("deleteProduct");
		return view;
	}
	@RequestMapping("updateProduct")
	public ModelAndView updateProduct() {
		ModelAndView view  = new ModelAndView("updateProduct");
		return view;
	}
	@RequestMapping("/productForm")
	public ModelAndView productForm() {
		ModelAndView view = new ModelAndView();
		view.addObject("command",new Product());
		view.setViewName("productForm");
		return view;
	}
}
