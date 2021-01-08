package org.algonell.trading.dp.factorymethod;

/**
 * Factory Method demo: use real-time data provider across all code base, change easily if needed.
 * 
 * @author Andrew Kreimer
 *
 */
public class FactoryMethod {

	private static final org.apache.logging.log4j.Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(FactoryMethod.class);
	
	public static void main(String[] args) {
		//using IB
		DataProvider ibProvider = DataProviderFactory.createProvider(DataProviderType.IB);
		LOGGER.info(ibProvider.getData());
		
		//using Quandl
		DataProvider quandlProvider = DataProviderFactory.createProvider(DataProviderType.QUANDL);
		LOGGER.info(quandlProvider.getData());
	}

}