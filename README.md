# Trader's Tools
Insights, tools and tips as a result of losing too much money :crocodile:.

* Things You Learn After 1 Year of Day Trading for a Living [[Medium]](https://algonell.medium.com/things-you-learn-after-1-year-of-day-trading-for-a-living-a97bbc8d19fa) - or what **not** to do in the markets.
* Numer.ai - tools for creating symbol lists (attic).

## Design Patterns (Java)
* Real-life examples of working with the [Interactive Brokers TWS API](https://interactivebrokers.github.io/tws-api/index.html)
* Join the repository [here](https://interactivebrokers.github.io/).
* Inspired by the University of Alberta [course](https://www.coursera.org/learn/design-patterns).

Pattern | Category | Idea
 --- | --- | ---
[Singleton](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/singleton/Singleton.java) | Creational | Manage multiple accounts (connections, disconnections, execution requests, orders requests and etc.) via single object and once.
[Factory Method](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/factorymethod/FactoryMethod.java) | Creational | Change historical data provider across all code base with a single modification.
[Facade](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/facade/Facade.java) | Structural | Wrap complex logic with simple access point.
[Adapter](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/adapter/Adapter.java) | Structural | Use standard m30 bars to create custom H4 bars in a different time zone.
[Composite](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/composite/Composite.java) | Structural | Single option is the building block of a complex options position.
[Proxy](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/proxy/Proxy.java) | Structural | Use cached data access when applicable, request and store new if none available.
[Decorator](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/decorator/Decorator.java) | Structural | Extend functionality of standard request handlers.
[Template Method](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/behavioral/templatemethod/TemplateMethod.java) | Behavioral | Use template trading flow for various asset classes.
[Chain of Responsibility](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/behavioral/chainofresponsibility/ChainOfResponsibility.java) | Behavioral | Trade risk assessment via chain of validation rules.
[State](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/behavioral/state/State.java) | Behavioral | Trade multiple sessions of the same market.
[Command](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/behavioral/command/Command.java) | Behavioral | Perform account related tasks (data, trading, risk assessment and etc.) efficiently.
[Mediator](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/behavioral/mediator/Mediator.java) | Behavioral | Manage portfolio exposure with different instruments.
[Observer](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/behavioral/observer/Observer.java) | Behavioral | Price alerts for various asset classes.

### TODO
- [ ] MVC

## Books
* Thinking, Fast and Slow [[Daniel Kahneman]](https://www.amazon.com/gp/product/0374533555/ref=as_li_tl?ie=UTF8&tag=algonell-20&camp=1789&creative=9325&linkCode=as2&creativeASIN=0374533555&linkId=41df8a28a4e4d3b79b918aaa994449b4)

* Fooled by Randomness: The Hidden Role of Chance in Life and in the Markets [[Nassim Nicholas Taleb]](https://www.amazon.com/gp/product/0812975219/ref=as_li_tl?ie=UTF8&tag=algonell-20&camp=1789&creative=9325&linkCode=as2&creativeASIN=0812975219&linkId=1d3e2d9ef23e1611ee2c4c4926692cec)

* Trading in the Zone: Master the Market with Confidence, Discipline and a Winning Attitude [[Mark Douglas]](https://www.amazon.com/gp/product/0735201447/ref=as_li_tl?ie=UTF8&tag=algonell-20&camp=1789&creative=9325&linkCode=as2&creativeASIN=0735201447&linkId=6dc94049810903c85f834eba4ba30f90)

* Mind Over Markets: Power Trading with Market Generated Information [[James F. Dalton, Eric T. Jones, Robert B. Dalton]](https://www.amazon.com/gp/product/1118531736/ref=as_li_tl?ie=UTF8&tag=algonell-20&camp=1789&creative=9325&linkCode=as2&creativeASIN=1118531736&linkId=f29b84b4a9fc27cff6a246124d696f88)

* Trading Sardines: Lessons in the Markets from a Lifelong Trader [[Linda Raschke]](https://lindaraschke.net/trading-sardines/)
