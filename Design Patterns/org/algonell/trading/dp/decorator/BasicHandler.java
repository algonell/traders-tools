package org.algonell.trading.dp.decorator;

/**
 * Basic handler: just handle the event.
 * 
 * @author Andrew Kreimer
 *
 */
public class BasicHandler implements Handler {

	@Override
	public String handle() {
		return "handled event";
	}

}
