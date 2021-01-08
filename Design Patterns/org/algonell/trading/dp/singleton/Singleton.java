package org.algonell.trading.dp.singleton;

/**
 * Singleton demo: use unique manager for multiple accounts.
 * 
 * @author Andrew Kreimer
 *
 */
public class Singleton {
	
	public static void main(String[] args) {
		IbManager.INSTANCE.init();
		
		IbManager.INSTANCE.requestOpenOrders();
		
		IbManager.INSTANCE.requestExecutions();
		
		IbManager.INSTANCE.disconnect();
	}

}
