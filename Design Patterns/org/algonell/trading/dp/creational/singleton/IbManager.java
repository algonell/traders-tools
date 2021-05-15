package org.algonell.trading.dp.creational.singleton;

import java.util.List;

/**
 * When working with Interactive Brokers API, you will have to manage many accounts.
 * Managing accounts means keeping all of them connected and active.
 * A singleton design pattern is vital here: single controller 
 * to manage all account connections (TWS / gateway).
 * Across all of our trading algos, we must have one connector. 
 * 
 * There are too many ways to implement a singleton 
 * (most of them are bad due to multi-threading issues).
 * The proper way to implement singleton is via enum. JVM guarantees single instance.
 * 
 * @author Andrew Kreiemr
 *
 */
public enum IbManager {
	INSTANCE; //single entry -> true singleton
	
	private final org.apache.logging.log4j.Logger logger = 
			org.apache.logging.log4j.LogManager.getLogger(IbManager.class);
	
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

		//await historical market data farm
		
		//etc.
		
		logger.info("init done");
	}

	void requestOpenOrders() {
		//must be done for each account
		
		logger.info("got open orders");
	}

	void requestExecutions() {
		//must be done for each account
		
		logger.info("got executions");
	}
	
	public void disconnect() {
		//disconnect
		
		//store 
		
		//etc.
		
		logger.info("disconnected");
	}
	
}