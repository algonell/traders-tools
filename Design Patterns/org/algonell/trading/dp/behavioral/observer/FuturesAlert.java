package org.algonell.trading.dp.behavioral.observer;

/**
 * Futures price change alert: notify on changes above 2%.
 *
 * @author Andrew Kreimer
 */
public class FuturesAlert implements PriceAlert {

  private static final org.apache.logging.log4j.Logger LOGGER =
      org.apache.logging.log4j.LogManager.getFormatterLogger(FuturesAlert.class);

  @Override
  public void trigger(double change) {
    if (change > 2) {
      LOGGER.info("Futures markup...");
    } else {
      LOGGER.info("Futures NOP");
    }
  }
}
