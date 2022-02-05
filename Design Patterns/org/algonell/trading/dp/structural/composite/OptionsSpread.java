package org.algonell.trading.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Options Spread: a combination of long / short puts / calls, known as legs.
 *
 * @author Andrew Kreimer
 */
public class OptionsSpread implements Option {

  private List<Option> legs = new ArrayList<>();

  public void addOption(Option option) {
    legs.add(option);
  }

  @Override
  public double calculateDelta() {
    return legs.stream().mapToDouble(Option::calculateDelta).sum();
  }
}
