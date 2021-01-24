package org.algonell.trading.dp.behavioral.mediator;

/**
 * Get exposure via futures (as delta).
 * 
 * @author Andrew Kreimer
 *
 */
public class FuturesExposure extends Exposure {

	protected FuturesExposure(ExposureMediator mediator) {
		super(mediator);
	}

	@Override
	public double add() {
		if (mediator.calculateDelta() < 1) {
			logger.info("added futures exposure");
			delta += 0.5;
		} else {
			logger.info("no need to add more");
		}
		
		return delta;
	}

}