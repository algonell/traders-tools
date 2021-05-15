package org.algonell.trading.dp.behavioral.mediator;

/**
 * Get exposure via stocks (as delta).
 * 
 * @author Andrew Kreimer
 *
 */
public class StocksExposure extends Exposure {

  protected StocksExposure(ExposureMediator mediator) {
    super(mediator);
  }

  @Override
  public double add() {
    if (mediator.calculateDelta() < 1) {
      logger.info("added stocks exposure");
      delta += 0.5;
    } else {
      logger.info("no need to add more");
    }

    return delta;
  }

}
