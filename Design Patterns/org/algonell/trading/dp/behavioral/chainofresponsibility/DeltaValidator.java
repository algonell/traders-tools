package org.algonell.trading.dp.behavioral.chainofresponsibility;

/**
 * Delta validation: allow trades that reduce delta exposure.
 * 
 * @author Andrew Kreimer
 *
 */
public class DeltaValidator extends RiskValidator {

  protected DeltaValidator(RiskValidator next) {
    super(next);
  }

  @Override
  public String check(double risk) {
    if (risk < 250)
      return "Delta rule: too low";

    if (next != null)
      return "Delta rule: OK, " + next.check(risk);

    return "Delta rule: OK, done.";
  }

}
