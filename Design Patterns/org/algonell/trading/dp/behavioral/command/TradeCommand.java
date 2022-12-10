package org.algonell.trading.dp.behavioral.command;

/**
 * Trade command: any trading related command (buy SPY, sell 6E, etc.).
 *
 * @author Andrew Kreimer
 */
public class TradeCommand extends IbCommand {

  protected TradeCommand(IbAccountManager manager) {
    super(manager);
  }

  @Override
  public String perform() {
    return manager.trade().get();
  }
}
