package org.algonell.trading.dp.behavioral.templatemethod;

/**
 * FX trader: trade spot FX.
 * 
 * @author Andrew Kreimer
 *
 */
public class FxTrader extends Trader {

	@Override
	public String getData() {
		return "got spot FX rate";
	}

	@Override
	public String buildOrder() {
		return "built FX order";
	}

	@Override
	public String submit() {
		return "submitted FX order";
	}

}