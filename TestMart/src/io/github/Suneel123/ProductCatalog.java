package io.github.Suneel123;

import java.util.List;

import javax.jws.WebService;

import io.github.Suneel123.business.ProductServiceImpl;
import io.github.Suneel123.model.Product;

@WebService(endpointInterface="io.github.Suneel123.ProductCatalogInterface", portName="TestMartCatalogPort", 
			serviceName="TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see io.github.Suneel123.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	/*@WebMethod is optional because when you give annotation @WebService it assumes all the
	public methods are of web methods*/
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see io.github.Suneel123.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see io.github.Suneel123.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
	
	/* (non-Javadoc)
	 * @see io.github.Suneel123.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);
	}
	
	
}