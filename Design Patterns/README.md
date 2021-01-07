# Design Patterns (Java)
Real-life examples of working with the [Interactive Brokers TWS API](https://interactivebrokers.github.io/tws-api/index.html)

Pattern | Demo | Idea
--- | --- | ---
Singleton | [SingletonDemo](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/singleton/SingletonDemo.java) | Manage multiple accounts (connections, disconnections, execution requests, orders requests and etc.) via single object and once.
Factory Method | [FactoryMethodDemo](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/factorymethod/FactoryMethodDemo.java) | Change historical data provider across all code base with a single modification.
Facade | [FacadeDemo](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/facade/FacadeDemo.java) | Wrap complex logic with simple access point.

# TODO
- [x] Singleton
- [x] Factory Method
- [x] Facade
- [ ] Adapter
- [ ] Composite
- [ ] Proxy
- [ ] Decorator
