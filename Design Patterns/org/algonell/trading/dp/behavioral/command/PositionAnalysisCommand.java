package org.algonell.trading.dp.behavioral.command;

/**
 * Position analysis command: request positions, assess margin/risk, calculate delta and etc.
 * 
 * @author Andrew Kreimer
 *
 */
public class PositionAnalysisCommand extends IbCommand {

  protected PositionAnalysisCommand(IbAccountManager manager) {
    super(manager);
  }

  @Override
  public String perform() {
    return manager.getDelta().get();
  }

}
