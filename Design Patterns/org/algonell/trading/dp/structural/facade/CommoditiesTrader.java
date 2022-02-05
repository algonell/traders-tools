package org.algonell.trading.dp.structural.facade;

/**
 * Commodities Trader: builds contract and trades commodity futures (local symbol and correct front
 * month are mandatory).
 *
 * @author Andrew Kreimer
 */
public class CommoditiesTrader implements AssetClassTrader {

  @Override
  public String trade() {
    return "long CL";
  }
}
