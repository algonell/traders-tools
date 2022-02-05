package org.algonell.trading.dp.structural.facade;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Helper class for generating order id sequences.
 *
 * @author Andrew Kreimer
 */
public final class OrderIdGenerator {

  private AtomicInteger integer = new AtomicInteger(0);

  public int next() {
    // generate next order id
    return integer.incrementAndGet();
  }
}
