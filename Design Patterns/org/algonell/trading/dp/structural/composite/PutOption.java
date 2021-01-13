package org.algonell.trading.dp.structural.composite;

/**
 * Put Option: buy if bearish, sell if bullish.
 * 
 * @author Andrew Kreimer
 *
 */
public class PutOption implements Option {

	@Override
	public double calculateDelta() {
		// depends on the strike, IV and etc.
		return -0.5;
	}

}
