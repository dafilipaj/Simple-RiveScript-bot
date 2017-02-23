package ch.nth.rivescript.RSTest.models;

import java.util.ArrayList;
import java.util.List;

import ch.nth.rivescript.RSTest.MenuCategory;

public class Menu {
	
	List<Item> menuList = new ArrayList<Item>();
	
	public void initMenuItems(){
		menuList.add(new Item("Margherita" , 26, MenuCategory.PIZZAS));
		menuList.add(new Item("Vesuvio" , 30, MenuCategory.PIZZAS));
		menuList.add(new Item("Funghi" , 30, MenuCategory.PIZZAS));
		menuList.add(new Item("Al tonno" , 32, MenuCategory.PIZZAS));
		menuList.add(new Item("Capriciosa" , 30, MenuCategory.PIZZAS));
		menuList.add(new Item("Napolitana" , 32, MenuCategory.PIZZAS));
		menuList.add(new Item("Slavonska" , 33, MenuCategory.PIZZAS));
		menuList.add(new Item("Hellas" , 40, MenuCategory.PIZZAS));
		menuList.add(new Item("Dimsy" , 34, MenuCategory.PIZZAS));
		menuList.add(new Item("Diavola" , 34, MenuCategory.PIZZAS));
		menuList.add(new Item("Zagorska" , 34, MenuCategory.PIZZAS));
		menuList.add(new Item("Vegetariana" , 34, MenuCategory.PIZZAS));
		
		menuList.add(new Item("Eggs" , 3, MenuCategory.EXTRAS));
		menuList.add(new Item("Ajvar" , 3, MenuCategory.EXTRAS));
		menuList.add(new Item("Beans" , 3, MenuCategory.EXTRAS));
		menuList.add(new Item("Onions" , 3, MenuCategory.EXTRAS));
		menuList.add(new Item("Tomatoes" , 4, MenuCategory.EXTRAS));
		menuList.add(new Item("Chees" , 5, MenuCategory.EXTRAS));
		menuList.add(new Item("Gorgonzola" , 7, MenuCategory.EXTRAS));
		menuList.add(new Item("Rocquefort" , 7, MenuCategory.EXTRAS));
		menuList.add(new Item("Tofu" , 7, MenuCategory.EXTRAS));
		menuList.add(new Item("Chicken" , 15, MenuCategory.EXTRAS));
	}
	
	public void printMenu(){
		for(MenuCategory category : MenuCategory.values()){
			System.out.println("____________" + category.getCategory() + "____________");
			
			for(Item item : menuList){
				if(item.getCategory().equals(category)){
					System.out.println(" > " + item.getName() + " " + item.getPrice() + " kn");
				}
			}
		}
		
		System.out.println("\nWould you like to place your order now?");
	}

	public List<Item> getMenuList() {
		return menuList;
	}
	
	
}
