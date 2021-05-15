package org.algonell.trading.dp.behavioral.command;

/**
 * Command demo: perform account related tasks efficiently. 
 * Including: data, trading, risk assessment and etc.
 * 
 * @author Andrew Kreimer
 *
 */
public class Command {

	private static final org.apache.logging.log4j.Logger LOGGER = 
			org.apache.logging.log4j.LogManager.getLogger(Command.class);
	
	public static void main(String[] args) {
		//concrete doer of deeds
		var accountManager = new IbAccountManager();
		
		//task manager (threading, efficiency & priorities)
		var taskManager = new IbTaskManager();
		
		//ongoing tasks
		LOGGER.info(() -> taskManager.perform(new DataCommand(accountManager)));
		LOGGER.info(() -> taskManager.perform(new TradeCommand(accountManager)));
		LOGGER.info(() -> taskManager.perform(new PositionAnalysisCommand(accountManager)));
	}

}