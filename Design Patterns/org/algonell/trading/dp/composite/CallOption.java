package org.algonell.trading.dp.composite;

/**
 * Call Option: buy if bullish, sell if bearish.
 * 
 * @author Andrew Kreimer
 *
 */
public class CallOption implements Option {

	@Override
	public double calculateDelta() {
		// depends on the strike, IV and etc.
		return 0.5;
	}

}
