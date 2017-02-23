package ch.nth.rivescript.RSTest.macros;

import com.rivescript.RiveScript;
import com.rivescript.macro.Subroutine;

import ch.nth.rivescript.RSTest.App;

public class GetOrder implements Subroutine{

	@Override
	public String call(RiveScript rs, String[] args) {
		return App.order.toString();
	}

}
