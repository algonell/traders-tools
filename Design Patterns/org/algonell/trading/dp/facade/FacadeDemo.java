package org.algonell.trading.dp.facade;

/**
 * Facade Demo: IbConnector class to wrap complex trading requests with simple access.
 * 
 * @author Andrew Kreimer
 *
 */
public class FacadeDemo {
	
	public static void main(String[] args) {
		IbConnector ibConnector = new IbConnector();
		
		ibConnector.trade(AssetClassType.COMMODITIES);
		ibConnector.trade(AssetClassType.FX);
		ibConnector.trade(AssetClassType.EQUITIES);
	}
	
}