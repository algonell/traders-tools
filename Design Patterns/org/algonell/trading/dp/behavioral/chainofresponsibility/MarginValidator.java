package org.algonell.trading.dp.behavioral.chainofresponsibility;

/**
 * Margin validation: allow bounded margin trades, or trades that reduce margin.
 *
 * @author Andrew Kreimer
 */
public class MarginValidator extends RiskValidator {

  protected MarginValidator(RiskValidator next) {
    super(next);
  }

  @Override
  public String check(double risk) {
    if (risk > 500) {
      return "Margin rule: too high";
    }

    if (next != null) {
      return "Margin rule: OK, " + next.check(risk);
    }

    return "Margin rule: OK, done.";
  }
}
