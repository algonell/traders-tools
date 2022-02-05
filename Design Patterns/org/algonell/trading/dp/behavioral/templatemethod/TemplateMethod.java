package org.algonell.trading.dp.behavioral.templatemethod;

/**
 * Template Method demo: use template trading flow for various asset classes.
 *
 * @author Andrew Kreimer
 */
public class TemplateMethod {

  public static void main(String[] args) {
    // trade futures
    Trader trader = new FuturesTrader();
    trader.trade();

    // trade FX
    trader = new FxTrader();
    trader.trade();
  }
}
