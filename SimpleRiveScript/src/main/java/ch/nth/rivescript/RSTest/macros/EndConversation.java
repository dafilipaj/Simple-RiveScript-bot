package ch.nth.rivescript.RSTest.macros;

import com.rivescript.RiveScript;
import com.rivescript.macro.Subroutine;

public class EndConversation implements Subroutine{

	@Override
	public String call(RiveScript rs, String[] args) {
		System.out.print("Goodbye.");
		System.exit(0);
		return "";
	}
	

}
