package org.algonell.trading.dp.behavioral.templatemethod;

/**
 * Futures trader: trading futures requires many precautions and subtle considerations.
 * 
 * @author Andrew Kreimer
 *
 */
public class FuturesTrader extends Trader {

	@Override
	public String getData() {
		return "got front expiration (continuous) contract";
	}

	@Override
	public String buildOrder() {
		return "built futures order";
	}

	@Override
	public String submit() {
		return "submitted futures order";
	}

}
