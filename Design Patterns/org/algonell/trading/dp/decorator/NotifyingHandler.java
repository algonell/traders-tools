package org.algonell.trading.dp.decorator;

/**
 * Handler that makes notifications (Slack for instance).
 *  
 * @author Andrew Kreimer
 *
 */
public class NotifyingHandler extends HandlerDecorator {

	protected NotifyingHandler(Handler handler) {
		super(handler);
	}

	@Override
	public String handle() {
		return super.handle() + ", notifying...";
	}

}