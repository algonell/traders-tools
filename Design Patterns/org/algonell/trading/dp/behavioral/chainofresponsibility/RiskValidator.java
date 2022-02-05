package org.algonell.trading.dp.behavioral.chainofresponsibility;

/**
 * Any trade has to pass multiple risk assessment rules before submitted.
 *
 * @author Andrew Kreimer
 */
public abstract class RiskValidator {

  protected RiskValidator next;

  /**
   * Links next rule in chain.
   *
   * @param next
   */
  protected RiskValidator(RiskValidator next) {
    this.next = next;
  }

  /**
   * Checks rule.
   *
   * @param risk
   */
  public abstract String check(double risk);
}
