package io.github.Suneel123.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Product")
@XmlType(propOrder={"price", "sku", "name"})
/* All elements in this class comes under the root element but if we 
 * have some other class as the member variable then that member variable
 * does not comes under the XMLRootElement
 */
public class Product {
	
	private String name;
	private String sku;
	private double price;
	
	public Product() {
	
	}
	
	public Product(String name, String sku, double price) {
		super();
		this.name = name;
		this.sku = sku;
		this.price = price;
	}
	
	@XmlElement(name="ProductName")
	public String getName() {
		return name;
	}
	public void setNaem(String name) {
		this.name = name;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
