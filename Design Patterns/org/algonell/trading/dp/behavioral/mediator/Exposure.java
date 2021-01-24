package org.algonell.trading.dp.behavioral.mediator;

/**
 * Any portfolio consists of exposures (stocks, futures, FX and etc.)
 * Adding and removing exposures depends on existing exposures.
 * We can get the same exposure in different markets.
 *  
 * @author Andrew Kreimer
 *
 */
public abstract class Exposure {

	protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(Exposure.class);
	
	protected double delta;
	protected ExposureMediator mediator;
	
	protected Exposure(ExposureMediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract double add();
	
	public double get() {
		return delta;
	}
	
}