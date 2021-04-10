package org.algonell.trading.dp.structural.adapter;

/**
 * Custom 4 hour bars (might be in a different time zone).
 *  
 * @author Andrew Kreimer
 *
 */
public class H4Bars extends Bars {

	@Override
	public String calculateRange() {
		return "calculated range of H4 bars";
	}

}