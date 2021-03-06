package io.github.Suneel123;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import io.github.Suneel123.model.Product;

@WebService(name="TestMartCatalog", targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {
	
	@WebMethod(action="fetch categories",operationName="fetchCategories")
	/*This is optional because when you give annotation @WebService it assumes all the
	public methods are of web methods*/
	List<String> getProductCategories();
	
	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	boolean addProduct(String category, String product);

	@WebMethod
	@WebResult(name="Product")
	List<Product> getProductsv2(String category);

}