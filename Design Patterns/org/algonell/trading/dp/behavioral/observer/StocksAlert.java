package org.algonell.trading.dp.behavioral.observer;

/**
 * Stocks price change alert: notify on changes above 5%.
 * 
 * @author Andrew Kreimer
 *
 */
public class StocksAlert implements PriceAlert {

	private static final org.apache.logging.log4j.Logger LOGGER = 
			org.apache.logging.log4j.LogManager.getFormatterLogger(StocksAlert.class);
	
	@Override
	public void trigger(double change) {
		if (change > 5) {
			LOGGER.info("Stocks markup...");
		} else {
			LOGGER.info("Stocks NOP");
		}
	}

}