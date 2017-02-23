package ch.nth.rivescript.RSTest.macros;

import com.rivescript.RiveScript;
import com.rivescript.macro.Subroutine;
import com.rivescript.util.StringUtils;

import ch.nth.rivescript.RSTest.App;
import ch.nth.rivescript.RSTest.models.Item;
import ch.nth.rivescript.RSTest.models.Menu;
import ch.nth.rivescript.RSTest.models.Order;

public class AddItem implements Subroutine{
	
	private Order order = App.order;
	private Menu menu = App.menu;

	@Override
	public String call(RiveScript rs, String[] args) {
		String message = StringUtils.join(args, " ");
		
		if(!isItemAlreadyAdded(args[1])){
			addNewItem(args);
		}else{
			updateItem(args);
		}
		
		return "";
	}
	
	private boolean isItemAlreadyAdded(String name){
		for(Item item : order.getOrderedItems()){
			if(name.equalsIgnoreCase(item.getName())) return true;
		}
		return false;
	}

	private void addNewItem(String[] args){
		Item newitem = new Item();
		newitem.setQuantity(Integer.parseInt(args[0]));
		newitem.setName(args[1]);
		newitem.setPrice(findItemPriceByName(args[1]));
		order.addItem(newitem);
	}
	
	private int findItemPriceByName(String name){
		for(Item item : menu.getMenuList()){
			if(item.getName().equalsIgnoreCase(name)) return item.getPrice();
		}
		
		return 0;
	}
	
	private void updateItem(String[] args){
		for(Item item : order.getOrderedItems()){
			if(args[1].equalsIgnoreCase(item.getName())){
				item.setQuantity(Integer.parseInt(args[0]));
			}
		}
	}
	
}
