package org.algonell.trading.dp.structural.composite;

/**
 * Composite demo: single option is the building block of a complex options position.
 * 
 * @author Andrew Kreimer
 *
 */
public class Composite {

	private static final org.apache.logging.log4j.Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(Composite.class);
	
	public static void main(String[] args) {
		//make some options
		CallOption call = new CallOption();
		PutOption put = new PutOption();
		
		//assemble position (some kind of a ratio 2:1)
		OptionsSpread spread = new OptionsSpread();
		spread.addOption(call);
		spread.addOption(call);
		spread.addOption(put);
		
		LOGGER.info(spread::calculateDelta);
	}

}