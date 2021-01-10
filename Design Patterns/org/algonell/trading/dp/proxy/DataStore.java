package org.algonell.trading.dp.proxy;

/**
 * Base data store.
 * 
 * @author Andrew Kreimer
 *
 */
public interface DataStore {

	String getData(String symbol);
	
}
