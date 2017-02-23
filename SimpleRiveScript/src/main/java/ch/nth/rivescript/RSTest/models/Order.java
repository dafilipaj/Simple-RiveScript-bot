package ch.nth.rivescript.RSTest.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order {
	List<Item> orderedItems = new ArrayList<Item>();
	String orderPrice;
	
	public Order(){}

	
	public List<Item> getOrderedItems() {
		return orderedItems;
	}

	public void setOrderedItems(List<Item> orderedItems) {
		this.orderedItems = orderedItems;
	}

	public void addItem(Item item){
		orderedItems.add(item);
	}
	
	public void removeItem(Item item){
		orderedItems.remove(item);
	}

	private int calculateTotalPrice(){
		int price = 0;
		
		for(Item item : orderedItems){
			price += item.getPrice() * item.getQuantity();
		}
		
		return price;
	}

	@Override
	public String toString() {
		String totalOrder = "\n";
		
		Iterator<Item> listIterator = orderedItems.iterator();
		
		while(listIterator.hasNext()){
			Item nextItem = listIterator.next();
			totalOrder += " -- " + nextItem.getName() + " x"+ nextItem.getQuantity(); 
			if(listIterator.hasNext()) totalOrder += ",\n" ;
		}
		
		totalOrder += "\nTotal price:" + calculateTotalPrice() + " kn.\n";
		return totalOrder;
	}
	
	
}
