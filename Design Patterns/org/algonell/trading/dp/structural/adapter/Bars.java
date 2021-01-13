package org.algonell.trading.dp.structural.adapter;

import java.util.List;

/**
 * Standard historical bars (Open, High, Low, Close and Volume).
 * 
 * @author Andrew Kreimer
 *
 */
public abstract class Bars {

	protected List<Object> prices;
	
	public abstract String calculateRange();
	
}
