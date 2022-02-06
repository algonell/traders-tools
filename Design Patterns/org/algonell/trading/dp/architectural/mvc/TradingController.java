package org.algonell.trading.dp.architectural.mvc;

/**
 * Account controller: orchestrate trading, risk assessment and balance updates.
 *
 * @author Andrew Kreimer
 */
public class TradingController {

  private RiskModel model = new RiskModel();
  private BalanceView view = new BalanceView(model);

  public TradingController() {
    // model is observerable by view
    model.subscribe(view);
  }

  public RiskModel getModel() {
    return new RiskModel(model);
  }

  public BalanceView getView() {
    return view;
  }
}
