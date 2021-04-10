package org.algonell.trading.dp.structural.facade;

/**
 * Equities Trader: builds contract and submits order (symbol id might be necessary).
 * 
 * @author Andrew Kreimer
 *
 */
public class EquitiesTrader implements AssetClassTrader {

	@Override
	public String trade() {
		return "long SPY";
	}

}