package org.algonell.trading.dp.creational.factorymethod;

/**
 * Interactive Brokers data provider. Uses TWS API to get historical data (bar, unit & period).
 * 
 * @author Andrew Kreimer
 *
 */
public class IbDataProvider implements DataProvider {

  @Override
  public String getData() {
    // IB data requests

    // publish-subscribe

    return "Data from IB";
  }

}
