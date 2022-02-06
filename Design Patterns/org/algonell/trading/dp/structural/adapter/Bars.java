package org.algonell.trading.dp.structural.adapter;

import java.util.Collections;
import java.util.List;

/**
 * Standard historical bars (Open, High, Low, Close and Volume).
 *
 * @author Andrew Kreimer
 */
public abstract class Bars {

  protected List<Object> prices = Collections.emptyList();

  public abstract String calculateRange();
}
