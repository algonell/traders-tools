package org.algonell.trading.dp.behavioral.state;

/**
 * Asia: starts around CME open till Europe open.
 *
 * @author Andrew Kreimer
 */
public class AsiaSession implements Session {

  @Override
  public String trade(SessionTrader trader) {
    return "traded Asia";
  }

  @Override
  public String flatten(SessionTrader trader) {
    trader.setActiveSession(trader.getEuSession());

    return "Asia is flat -> EU is on";
  }
}
