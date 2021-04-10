package org.algonell.trading.dp.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * IB exposure manager: control increase and decrease of portfolio exposures.
 * 
 * @author Andrew Kreimer
 *
 */
public class IbExposureManager implements ExposureMediator {

	private List<Exposure> exposures = new ArrayList<>();
	
	@Override
	public double calculateDelta() {
		return exposures.stream().mapToDouble(Exposure::get).sum();
	}

	public void addExposure(Exposure exposure) {
		exposures.add(exposure);
	}

}