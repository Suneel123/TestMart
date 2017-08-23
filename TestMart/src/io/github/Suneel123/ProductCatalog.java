package io.github.Suneel123;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import io.github.Suneel123.business.ProductServiceImpl;

@WebService
public class ProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@WebMethod /*This is optional because when you give annotation @WebService it assumes all the
	public methods are of web methods*/
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}
	
	@WebMethod
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
	
}