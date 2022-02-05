package org.algonell.trading.dp.behavioral.observer;

/**
 * Observer demo: price alerts for various asset classes.
 *
 * @author Andrew Kreimer
 */
public class Observer {

  public static void main(String[] args) {
    // price change monitor
    var monitor = new IbQuotesMonitor();

    // add subscribers
    var stocksAlert = new StocksAlert();
    monitor.subscribe(stocksAlert);
    monitor.subscribe(new FuturesAlert());

    // simulate markets
    monitor.onTick(0);
    monitor.onTick(3);
    monitor.onTick(7);

    // unsubscribe stocks when cash is closed
    monitor.unsubscribe(stocksAlert);

    // simulate markets
    monitor.onTick(13);
  }
}
