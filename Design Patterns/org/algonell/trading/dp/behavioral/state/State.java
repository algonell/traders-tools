package org.algonell.trading.dp.behavioral.state;

/**
 * State demo: trade multiple sessions of the same market.
 *
 * @author Andrew Kreimer
 */
public class State {

  private static final org.apache.logging.log4j.Logger LOGGER =
      org.apache.logging.log4j.LogManager.getLogger(State.class);

  public static void main(String[] args) {
    Session startingSession = new AsiaSession();
    var trader = new SessionTrader(startingSession);

    // repeat as long as markets are open (5 days a week, 3 sessions a day)
    for (var i = 0; i < 5 * 3; i++) {
      LOGGER.info(trader::trade);
      LOGGER.info(trader::flatten);
    }
  }
}
