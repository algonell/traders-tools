package org.algonell.trading.dp.structural.decorator;

/**
 * Handler decorator: add new functionality to existing handler.
 *
 * @author Andrew Kreimer
 */
public abstract class HandlerDecorator implements Handler {

  protected Handler handler;

  protected HandlerDecorator(Handler handler) {
    this.handler = handler;
  }

  @Override
  public String handle() {
    return handler.handle();
  }
}
