package org.algonell.trading.dp.structural.facade;

/**
 * Facade demo: IbConnector class to wrap complex trading requests with simple access.
 *
 * @author Andrew Kreimer
 */
public class Facade {

  public static void main(String[] args) {
    var ibConnector = new IbConnector();

    ibConnector.trade(AssetClassType.COMMODITIES);
    ibConnector.trade(AssetClassType.FX);
    ibConnector.trade(AssetClassType.EQUITIES);
  }
}
