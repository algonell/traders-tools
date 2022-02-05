package org.algonell.trading.dp.creational.factorymethod;

/**
 * Factory to build a data provider via data provider type.
 *
 * <p>Note how you can change your provider across all code base from one place.
 *
 * @author Andrew Kreimer
 */
public final class DataProviderFactory {

  private DataProviderFactory() {}

  public static DataProvider createProvider(DataProviderType type) {
    DataProvider provider = null;

    switch (type) {
      case IB:
        provider = new IbDataProvider();
        break;

      case QUANDL:
        provider = new QuandlDataProvider();
        break;

      case TRADIER:
        provider = new TradierDataProvider();
        break;

      default:
        break;
    }

    return provider;
  }
}
