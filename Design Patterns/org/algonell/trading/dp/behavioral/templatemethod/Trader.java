package org.algonell.trading.dp.behavioral.templatemethod;

/**
 * Base asset class trader.
 *
 * @author Andrew Kreimer
 */
public abstract class Trader {

  protected static final org.apache.logging.log4j.Logger logger =
      org.apache.logging.log4j.LogManager.getLogger(Trader.class);

  public final void trade() {
    logger.info(this::getData);
    logger.info(this::buildOrder);
    logger.info(this::submit);
  }

  public abstract String getData();

  public abstract String buildOrder();

  public abstract String submit();
}
