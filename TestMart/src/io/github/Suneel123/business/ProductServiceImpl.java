package io.github.Suneel123.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> moviesList = new ArrayList<String>();
	
	public void productServiceImpl() {
		bookList.add("Game of Thrones");
		bookList.add("Alchemist");
		bookList.add("Harry Porter");
		
		musicList.add("Dark Horse");
		musicList.add("Work from Home");
		musicList.add("Part of Me");
		
		moviesList.add("Drunkirk");
		moviesList.add("Wonder Woman");
		moviesList.add("X-men");
	}
	
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category) {
		switch(category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return moviesList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product) {
		switch(category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			moviesList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}
	
}
