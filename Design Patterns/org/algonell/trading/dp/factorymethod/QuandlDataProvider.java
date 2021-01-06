package org.algonell.trading.dp.factorymethod;

/**
 * Quandl data provider.
 * Uses quandl4j library.
 * 
 * @author Andrew Kreimer
 *
 */
public class QuandlDataProvider implements DataProvider {

	@Override
	public String getData() {
		//quandl4j wrapper
		
		return "Data from Quandl";
	}

}
