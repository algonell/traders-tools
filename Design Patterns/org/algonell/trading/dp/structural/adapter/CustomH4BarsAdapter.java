package org.algonell.trading.dp.structural.adapter;

/**
 * Adapter from m30 bars to custom H4 bars.
 *
 * @author Andrew Kreimer
 */
public class CustomH4BarsAdapter extends H4Bars {

  public CustomH4BarsAdapter(M30Bars m30Bars) {
    // copy data
  }

  @Override
  public String calculateRange() {
    return String.format("calculated range of custom H4 bars via %s m30 bars", prices.size());
  }
}
