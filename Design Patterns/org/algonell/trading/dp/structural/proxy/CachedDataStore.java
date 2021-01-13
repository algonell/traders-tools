package org.algonell.trading.dp.structural.proxy;

/**
 * Cached data store: uses cached data access when applicable.
 *  
 * @author Andrew Kreimer
 *
 */
public class CachedDataStore implements DataStore {

	CsvDataStore csvStore = new CsvDataStore();
	
	@Override
	public String getData(String symbol) {
		//data exists
		if (csvStore.contains(symbol)) return csvStore.getData(symbol);
		
		//request and store
		csvStore.request(symbol);
		return symbol + ": no cached data, requesting...";
	}
	
}
