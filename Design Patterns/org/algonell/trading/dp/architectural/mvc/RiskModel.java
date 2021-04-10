package org.algonell.trading.dp.architectural.mvc;

import java.util.HashSet;
import java.util.Set;

/**
 * Risk assessment and portfolio evaluation.
 * Uses observer Design Pattern to update the view.
 * 
 * @author Andrew Kreimer
 *
 */
public class RiskModel {

	private Set<BalanceView> observers = new HashSet<>();
	private double delta;
	
	public void subscribe(BalanceView view) {
		observers.add(view);
	}

	public void unsubscribe(BalanceView view) {
		if (observers.contains(view)) observers.remove(view);
	}

	public void trigger(String msg) {
		observers.forEach(o -> o.view(msg));
	}

	public double getDelta() { return delta; }
	public void setDelta(double delta) { this.delta = delta; }

}