package org.algonell.trading.dp.architectural.mvc;

/**
 * MVC demo: account management (trading controller, risk model and balance view).
 * 
 * @author Andrew Kreimer
 *
 */
public class Mvc {

	public static void main(String[] args) {
		//concrete controller
		TradingController controller = new TradingController();
		
		//simulate events
		controller.getModel().setDelta(-0.5);
		controller.getView().view("Account management started");
		controller.getModel().trigger("ES is down 5%");
		controller.getModel().setDelta(0.5);
		controller.getView().view("Account check");
	}

}