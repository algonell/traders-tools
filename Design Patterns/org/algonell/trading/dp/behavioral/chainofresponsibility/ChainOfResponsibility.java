package org.algonell.trading.dp.behavioral.chainofresponsibility;

/**
 * Chain of Responsibility demo: trade risk assessment via chain of validation rules.  
 * 
 * @author Andrew Kreimer
 *
 */
public class ChainOfResponsibility {

	private static final org.apache.logging.log4j.Logger LOGGER = 
			org.apache.logging.log4j.LogManager.getLogger(ChainOfResponsibility.class);
	
	public static void main(String[] args) {
		RiskValidator rrValidator = new RiskToRewardValidator(null);
		RiskValidator deltaValidator = new DeltaValidator(rrValidator);
		RiskValidator marginValidator = new MarginValidator(deltaValidator);
		
		LOGGER.info(() -> marginValidator.check(10_000));
		LOGGER.info(() -> marginValidator.check(500));
		LOGGER.info(() -> marginValidator.check(50));
	}

}