package org.algonell.trading.dp.architectural.mvc;

/**
 * Account view (balance, delta, positions and etc.).
 * 
 * @author Andrew Kreimer
 *
 */
public class BalanceView {

  private static final org.apache.logging.log4j.Logger LOGGER =
      org.apache.logging.log4j.LogManager.getFormatterLogger(BalanceView.class);

  private RiskModel model;

  public BalanceView(RiskModel model) {
    this.model = model;
  }

  public void view(String msg) {
    LOGGER.info("%s %f", msg, model.getDelta());
  }

}
