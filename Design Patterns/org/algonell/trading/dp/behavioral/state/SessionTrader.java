package org.algonell.trading.dp.behavioral.state;

/**
 * Session trader: trades multiple sessions around the clock.
 * Adjusts active session continuously.
 * 
 * @author Andrew Kreimer
 *
 */
public class SessionTrader {

	private Session asiaSession = new AsiaSession();
	private Session euSession = new EuSession();
	private Session usSession = new UsSession();
	private Session activeSession;
	
	public SessionTrader(Session startingSession) {
		this.activeSession = startingSession;
	}
	
	public Session getAsiaSession() { return asiaSession; }
	public Session getEuSession() { return euSession; }
	public Session getUsSession() { return usSession; }
	public void setActiveSession(Session activeSession) { this.activeSession = activeSession; }
	
	public String trade() {
		return activeSession.trade(this);
	}
	
	public String flatten() {
		return activeSession.flatten(this);
	}
	
}