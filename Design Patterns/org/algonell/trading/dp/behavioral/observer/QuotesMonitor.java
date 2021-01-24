package org.algonell.trading.dp.behavioral.observer;

/**
 * Quotes monitor: probes price changes for various asset classes.
 * 
 * @author Andrew Kreimer
 *
 */
public interface QuotesMonitor {

	void subscribe(PriceAlert alert);
	
	void unsubscribe(PriceAlert alert);
	
	void trigger(double change); //in %
	
	void onTick(double change); //in %
	
}
