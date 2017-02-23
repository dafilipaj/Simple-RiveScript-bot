package ch.nth.rivescript.RSTest;

public enum MenuCategory {
	PIZZAS("Pizzas"),
	EXTRAS("Extras");

	private String category;

	MenuCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}
}
