package org.algonell.trading.dp.behavioral.observer;

/**
 * Base price alert triggered with a price change (in %).
 *
 * @author Andrew Kreimer
 */
public interface PriceAlert {

  void trigger(double change);
}
