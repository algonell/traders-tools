package org.algonell.trading.dp.structural.proxy;

import java.util.HashSet;
import java.util.Set;

/**
 * Flat file (CSV) data store.
 * 
 * @author Andrew Kreiemr
 *
 */
public class CsvDataStore implements DataStore {

  private Set<String> data;

  public CsvDataStore() {
    // has data for
    data = new HashSet<>();
    data.add("ES");
    data.add("MES");
  }

  @Override
  public String getData(String symbol) {
    return symbol + ": got data from CSV file";
  }

  /**
   * Checks if contains CSV for this symbol.
   * 
   * @param symbol
   */
  public boolean contains(String symbol) {
    return data.contains(symbol);
  }

  /**
   * Requests and stores new data.
   * 
   * @param symbol
   */
  public void request(String symbol) {
    data.add(symbol);
  }

}
