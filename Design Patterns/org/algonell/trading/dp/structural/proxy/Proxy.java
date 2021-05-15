package org.algonell.trading.dp.structural.proxy;

/**
 * Proxy demo: use cached data access when applicable, request and store new if none available.     
 * 
 * @author Andrew Kreimer
 *
 */
public class Proxy {

	private static final org.apache.logging.log4j.Logger LOGGER = 
			org.apache.logging.log4j.LogManager.getLogger(Proxy.class);
	
	public static void main(String[] args) {
		var ds = new CachedDataStore();

		//contains data
		LOGGER.info(ds.getData("ES"));
		
		//does not contain data
		LOGGER.info(ds.getData("NQ"));
		
		//next time
		LOGGER.info(ds.getData("NQ"));
	}

}