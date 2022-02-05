package org.algonell.trading.dp.behavioral.chainofresponsibility;

/**
 * Simple risk rule: allow trades with high risk to reward ratios.
 *
 * @author Andrew Kreimer
 */
public class RiskToRewardValidator extends RiskValidator {

  protected RiskToRewardValidator(RiskValidator next) {
    super(next);
  }

  @Override
  public String check(double risk) {
    if (risk > 1000) return "RR check: risk is too high";

    if (next != null) return "RR check: OK, " + next.check(risk);

    return "RR check: OK, done.";
  }
}
