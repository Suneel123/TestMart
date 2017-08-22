package io.github.Suneel123.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
}
