package org.algonell.trading.dp.structural.facade;

/**
 * Core class managing single account. Trading with the Interactive Brokers TWS API usually becomes
 * complicated to external trading algorithms. A facade class provides wrapped simple access points
 * to large flows.
 * 
 * @author Andrew Kreimer
 *
 */
public class IbConnector {

  private static final org.apache.logging.log4j.Logger LOGGER =
      org.apache.logging.log4j.LogManager.getFormatterLogger(IbConnector.class);

  private AssetClassTrader trader;
  private OrderIdGenerator generator = new OrderIdGenerator();

  public void trade(AssetClassType assetClass) {
    LOGGER.info("next order id: %d", generator.next());

    switch (assetClass) {
      case EQUITIES:
        trader = new EquitiesTrader();
        break;

      case FX:
        trader = new FxTrader();
        break;

      case COMMODITIES:
        trader = new CommoditiesTrader();
        break;

      default:
        break;
    }

    LOGGER.info(() -> trader.trade());
  }

}
