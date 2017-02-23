package ch.nth.rivescript.RSTest;

import java.awt.MenuContainer;
import java.io.File;

import com.rivescript.Config;
import com.rivescript.RiveScript;
import com.rivescript.cmd.Shell;
import com.rivescript.lang.Perl;

import ch.nth.rivescript.RSTest.macros.AddItem;
import ch.nth.rivescript.RSTest.macros.EndConversation;
import ch.nth.rivescript.RSTest.macros.GetOrder;
import ch.nth.rivescript.RSTest.models.Menu;
import ch.nth.rivescript.RSTest.models.Order;

/**
 * Hello world!
 *
 */
public class App extends CustomShell{
	
	@Override
	protected void init(RiveScript bot) {
		bot.setSubroutine("addItem", new AddItem());
		bot.setSubroutine("getOrder", new GetOrder());
		bot.setSubroutine("endConversation", new EndConversation());
	}
	
    public static void main( String[] args ){
    	order = new Order();
    	menu = new Menu();
    	menu.initMenuItems();
    	
        if (args.length == 0) {
			String path = App.class.getClassLoader().getResource("pizza").getFile();
			args = new String[] { path };
		}
		new App().run(args);
    }
   
}
