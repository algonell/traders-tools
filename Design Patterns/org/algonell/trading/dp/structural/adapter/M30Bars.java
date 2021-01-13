package org.algonell.trading.dp.structural.adapter;

/**
 * Standard 30 minute historical bars.
 * 
 * @author Andrew Kreimer
 *
 */
public class M30Bars extends Bars {

	@Override
	public String calculateRange() {
		return "calculated range of m30 bars";
	}
	
}