package org.algonell.trading.dp.creational.factorymethod;

/**
 * You probably should use Interactive Brokers historical data requests (covers most of the average
 * needs).
 *
 * <p>Suppose you decide to switch your data provider because of: period limitations, prices or
 * quality.
 *
 * <p>Now you have to modify your entire code base, or (using Factory Method) just change the data
 * provider type.
 *
 * <p>Real-time historical data requests will be performed by the specified (dynamically created)
 * concrete provider.
 *
 * @author Andrew Kreimer
 */
public interface DataProvider {

  String getData();
}
