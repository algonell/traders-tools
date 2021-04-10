package org.algonell.trading.dp.structural.decorator;

/**
 * When working with the Interactive Brokers TWS API, most of the requests require us to implement some handlers.
 * 
 * @author Andrew Kreimer
 *
 */
public interface Handler {

	String handle();
	
}