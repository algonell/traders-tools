package org.algonell.trading.dp.behavioral.command;

import java.util.function.Supplier;

/**
 * IB account manager: performs various tasks for single IB account.
 *
 * @author Andrew Kreimer
 */
public final class IbAccountManager {

  public Supplier<String> getData() {
    return () -> "got data...";
  }

  public Supplier<String> trade() {
    return () -> "traded...";
  }

  public Supplier<String> getDelta() {
    return () -> "delta 1...";
  }
}
