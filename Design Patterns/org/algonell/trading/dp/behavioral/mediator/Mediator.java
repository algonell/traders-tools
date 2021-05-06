package org.algonell.trading.dp.behavioral.mediator;

/**
 * Mediator demo: manage portfolio exposure with different instruments.
 * 
 * @author Andrew Kreimer
 *
 */
public class Mediator {

	private static final org.apache.logging.log4j.Logger LOGGER = org.apache.logging.log4j.LogManager.getFormatterLogger(Mediator.class);
	
	private static final String FORMAT = "portfolio exposure: %f";
	
	public static void main(String[] args) {
		//exposures manager
		var manager = new IbExposureManager();
		
		//add exposures
		Exposure exposure = new StocksExposure(manager);
		manager.addExposure(exposure);
		exposure.add();
		LOGGER.info(FORMAT, manager.calculateDelta());
		
		exposure = new FuturesExposure(manager);
		manager.addExposure(exposure);
		exposure.add();
		LOGGER.info(FORMAT, manager.calculateDelta());
		
		//extra exposure
		exposure = new FuturesExposure(manager);
		manager.addExposure(exposure);
		exposure.add();
		LOGGER.info(FORMAT, manager.calculateDelta());
	}

}