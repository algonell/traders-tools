package org.algonell.trading.dp.behavioral.state;

/**
 * Some markets are active globally around the clock. 
 * When one session ends, the next session begins.
 *  
 * @author Andrew Kreimer
 *
 */
public interface Session {

	String trade(SessionTrader trader);
	
	String flatten(SessionTrader trader);
	
}