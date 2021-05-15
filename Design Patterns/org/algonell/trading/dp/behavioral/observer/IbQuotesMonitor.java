package org.algonell.trading.dp.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * IB quotes monitor: check for price changes every minute.
 * 
 * @author Andrew Kreimer
 *
 */
public final class IbQuotesMonitor implements QuotesMonitor {

  private Set<PriceAlert> observers = new HashSet<>();

  @Override
  public void subscribe(PriceAlert alert) {
    observers.add(alert);
  }

  @Override
  public void unsubscribe(PriceAlert alert) {
    if (observers.contains(alert))
      observers.remove(alert);
  }

  @Override
  public void trigger(double change) {
    observers.forEach(o -> o.trigger(change));
  }

  /**
   * Perform on tick tasks. Happens When prices are being refreshed.
   */
  @Override
  public void onTick(double change) {
    trigger(change);
  }

}
