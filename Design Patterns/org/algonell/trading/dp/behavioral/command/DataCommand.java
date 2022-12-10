package org.algonell.trading.dp.behavioral.command;

/**
 * Data command: any data related task (cache, request, store, etc.).
 *
 * @author Andrew Kreimer
 */
public class DataCommand extends IbCommand {

  protected DataCommand(IbAccountManager manager) {
    super(manager);
  }

  @Override
  public String perform() {
    return manager.getData().get();
  }
}
