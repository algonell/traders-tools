package org.algonell.trading.dp.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple task manager. Add priorities, entries and exclusions as needed.
 *
 * @author Andrew Kreimer
 */
public class IbTaskManager {

  private final List<IbCommand> tasks = new ArrayList<>();

  public String perform(IbCommand task) {
    tasks.add(task);

    return task.perform();
  }
}
