package org.algonell.trading.dp.singleton;

import java.util.List;

/**
 * Working with Interactive Brokers API you will have to manage many accounts.
 * Managing accounts means keeping all of them connected and active.
 * A singleton design pattern is vital here: single controller to manage all account connections (TWS / gateway).
 * Across all of our trading algos, we must have one connector. 
 * 
 * There are too many ways to implement a singleton (most of them are bad due to multi-threading issues).
 * The proper way to implement singleton is via enum. JVM guarantees single instance.
 * 
 * @author Andrew Kreiemr
 *
 */
public enum IbManager {
	INSTANCE; //single entry -> true singleton
	
	private String metadata;
	private List<Object> ibConnectors;
	
	private IbManager() {
		//private constructor to disable external instances
	}

	public String getMetadata() {
		return metadata;
	}
	
	public List<Object> getIbConnectors() {
		return ibConnectors;
	}

	public void init() {
		//connect accounts
		
		//request positions
		
		//request orders
		
		//etc.		
	}
	
	public void disconnect() {
		//disconnect
		
		//store 
		
		//etc.
	}
	
}
