package org.algonell.trading.dp.structural.facade;

/**
 * FX Trader: builds contract and trades spot FX.
 * 
 * @author Andrew Kreimer
 *
 */
public class FxTrader implements AssetClassTrader {

  @Override
  public String trade() {
    return "long EURUSD";
  }

}
