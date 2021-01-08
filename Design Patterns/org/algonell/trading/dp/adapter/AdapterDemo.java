package org.algonell.trading.dp.adapter;

/**
 * Adapter Demo: use standard m30 bars to create custom H4 bars in a different time zone.
 * 
 * @author Andrew Kreimer
 *
 */
public class AdapterDemo {

	private static final org.apache.logging.log4j.Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(AdapterDemo.class);
	
	public static void main(String[] args) {
		//original bars
		M30Bars m30Bars = new M30Bars();
		LOGGER.info(m30Bars::calculateRange);
		H4Bars m240Bars = new H4Bars();
		LOGGER.info(m240Bars::calculateRange);
		
		//adapt to custom bars
		CustomH4BarsAdapter adapter = new CustomH4BarsAdapter(m30Bars);
		LOGGER.info(adapter::calculateRange);
	}

}