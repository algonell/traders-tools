package org.algonell.trading.dp.structural.adapter;

/**
 * Adapter from m30 bars to custom H4 bars.
 * 
 * @author Andrew Kreimer
 *
 */
public class CustomH4BarsAdapter extends H4Bars {

	public CustomH4BarsAdapter(M30Bars m30Bars) {
		//copy data
	}
	
	@Override
	public String calculateRange() {
		return "calculated range of custom H4 bars via m30 bars";
	}
	
}