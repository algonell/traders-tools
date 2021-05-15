package org.algonell.trading.dp.structural.decorator;

/**
 * Decorator demo: extend functionality of standard request handlers. 
 * 
 * @author Andrew Kreimer
 *
 */
public class Decorator {

	private static final org.apache.logging.log4j.Logger LOGGER = 
			org.apache.logging.log4j.LogManager.getLogger(Decorator.class);
	
	public static void main(String[] args) {
		//basic handler
		Handler basicHandler = new BasicHandler();
		LOGGER.info(basicHandler::handle);
		
		//decorated handler
		Handler notifyingHandler = new NotifyingHandler(basicHandler);
		LOGGER.info(notifyingHandler::handle);
	}

}