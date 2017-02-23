package ch.nth.rivescript.RSTest.models;

import ch.nth.rivescript.RSTest.MenuCategory;

public class Item {
	int quantity;
	String name;
	int price; 
	MenuCategory category;
	
	public Item(){}

	public Item(String name, int price, MenuCategory category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public MenuCategory getCategory() {
		return category;
	}

	public void setCategory(MenuCategory category) {
		this.category = category;
	}
	
	
}
