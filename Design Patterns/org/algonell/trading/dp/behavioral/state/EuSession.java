package org.algonell.trading.dp.behavioral.state;

/**
 * Europe: starts when Asia is closed.
 *
 * <p>Let's assume this session ends before United States opening (8:30 CT).
 *
 * @author Andrew Kreimer
 */
public class EuSession implements Session {

  @Override
  public String trade(SessionTrader trader) {
    return "traded EU";
  }

  @Override
  public String flatten(SessionTrader trader) {
    trader.setActiveSession(trader.getUsSession());

    return "EU is flat -> US is on";
  }
}
