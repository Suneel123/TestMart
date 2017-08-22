package io.github.Suneel123;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
	
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		System.out.println("hello world");
		return categories;
	}
}
