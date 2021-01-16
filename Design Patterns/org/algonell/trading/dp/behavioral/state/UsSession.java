package org.algonell.trading.dp.behavioral.state;

/**
 * United States: starts at 14:30 GMT, till 21:00 GMT.
 * Next session is Asia the next day.
 * 
 * @author Andrew Kreimer
 *
 */
public class UsSession implements Session {

	@Override
	public String trade(SessionTrader trader) {
		return "traded US";
	}

	@Override
	public String flatten(SessionTrader trader) {
		trader.setActiveSession(trader.getAsiaSession());
		
		return "US is flat -> Asia is on (new day)";
	}

}
