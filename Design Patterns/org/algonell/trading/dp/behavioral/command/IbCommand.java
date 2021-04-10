package org.algonell.trading.dp.behavioral.command;

/**
 * IB command: base task to be done.
 * 
 * @author Andrew Kreimer
 *
 */
public abstract class IbCommand {

	protected IbAccountManager manager;
	
	protected IbCommand(IbAccountManager manager) {
		this.manager = manager;
	}
	
	public abstract String perform();
	
}