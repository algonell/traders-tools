# Trader's Tools
Insights, tools and tips as a result of losing too much money :crocodile:.

* Trading for a Living [[Medium]](https://algonell.medium.com/trading-for-a-living-9251d72c5696) - or what it takes to go from zero to **humble** hero in the markets.
* Things You Learn After 1 Year of Day Trading for a Living [[Medium]](https://algonell.medium.com/things-you-learn-after-1-year-of-day-trading-for-a-living-a97bbc8d19fa) - or what **not** to do in the markets.

## Design Patterns (Java)
* Real-life examples of working with the [Interactive Brokers TWS API](https://interactivebrokers.github.io/tws-api/index.html)
* Join the repository [here](https://interactivebrokers.github.io/).
* Inspired by the University of Alberta [course](https://www.coursera.org/learn/design-patterns).

Pattern | Category | Idea
 --- | --- | ---
[Singleton](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/creational/singleton/Singleton.java) | Creational | Manage multiple accounts (connections, disconnections, execution requests, orders requests, etc.) via single object and once.
[Factory Method](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/creational/factorymethod/FactoryMethod.java) | Creational | Change historical data provider across all code base with a single modification.
[Facade](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/structural/facade/Facade.java) | Structural | Wrap complex logic with simple access point.
[Adapter](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/structural/adapter/Adapter.java) | Structural | Use standard m30 bars to create custom H4 bars in a different time zone.
[Composite](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/structural/composite/Composite.java) | Structural | Single option is the building block of a complex options position.
[Proxy](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/structural/proxy/Proxy.java) | Structural | Use cached data access when applicable, request and store new if none available.
[Decorator](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/structural/decorator/Decorator.java) | Structural | Extend functionality of standard request handlers.
[Template Method](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/behavioral/templatemethod/TemplateMethod.java) | Behavioral | Use template trading flow for various asset classes.
[Chain of Responsibility](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/behavioral/chainofresponsibility/ChainOfResponsibility.java) | Behavioral | Trade risk assessment via chain of validation rules.
[State](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/behavioral/state/State.java) | Behavioral | Trade multiple sessions of the same market.
[Command](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/behavioral/command/Command.java) | Behavioral | Perform account related tasks (data, trading, risk assessment, etc.) efficiently.
[Mediator](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/behavioral/mediator/Mediator.java) | Behavioral | Manage portfolio exposure with different instruments.
[Observer](https://github.com/algonell/TradersTools/blob/main/Design%20Patterns/org/algonell/trading/dp/behavioral/observer/Observer.java) | Behavioral | Price alerts for various asset classes.
[MVC](https://github.com/algonell/traders-tools/blob/main/Design%20Patterns/org/algonell/trading/dp/architectural/mvc/Mvc.java) | Architectural | Account management (trading controller, risk model and balance view).

## Books
* Thinking, Fast and Slow [[Daniel Kahneman]](https://www.amazon.com/Thinking-Fast-Slow-Daniel-Kahneman/dp/0374533555)

* Fooled by Randomness: The Hidden Role of Chance in Life and in the Markets [[Nassim Nicholas Taleb]](https://www.amazon.com/Fooled-Randomness-Hidden-Markets-Incerto/dp/1400067936)

* Trading in the Zone: Master the Market with Confidence, Discipline and a Winning Attitude [[Mark Douglas]](https://www.amazon.com/Trading-Zone-Confidence-Discipline-Attitude/dp/0735201447)

* Mind Over Markets: Power Trading with Market Generated Information [[James F. Dalton, Eric T. Jones, Robert B. Dalton]](https://www.amazon.com/Mind-Over-Markets-Generated-Information/dp/1118531736)

* Trading Sardines: Lessons in the Markets from a Lifelong Trader [[Linda Raschke]](https://lindaraschke.net/trading-sardines/)

## Micro Task Management Language (MTML)

* Generalized task management notation.

* Symbols:

    Symbol | Meaning
    --- | ---
    ! | Important
    \+ | Task
    \- | Metadata/elaboration on previous line
    ~ | Thought/idea
    ~~ | Thought/idea in flow
    \~~~ | Thought/idea in multi-day flow
    % | Edge/trading idea
    ? | Question
    @ | Topic, can be nested (useful in the calendar)
    $ | Performance related task/idea
    ^ | Test
    & | Refactoring
    \# | Bug
    <> | Think about it / sleep on it, a coda in blocks
    . | Relevant to this particular day (usually in the calendar)

* Blocks:
  * Symbols can be combined with other symbols.
  * Small topic is either one line or condensed multiple lines.
  * Big topic is surrounded by @ symbols and contains small topics.
  * Code blocks/comments appear verbatim without any symbols.
  * When in flow, elaboration hyphens can be omitted.

* Examples:
    ```
    !+ this is an important task
    - with some metadata here

    $& this is a performance related refactoring

    @ this is a big topic
    ~ with some ideas

    @ sub topic
    ~ with some ideas (related to the super topic)

    + tasks

    # bugs

    ? questions

    .^ and some tests to be performed today 
    @ this is a big topic (same text as in the first symbol)
    ```

## Quotes
* Don’t underestimate the time it takes to develop an edge [Linda Raschke]

* Those who work that hard deserve their success; no apology is necessary [Victor Sperandeo]

## TIL
* Eclipse:
    - Ctrl + Shift + Alt + l: quick search
    - Shift + F2: online javadoc

* JupyterLab:
    - Ctrl + Shift + c: quick search
    - Ctrl + f, Ctrl + g: find and iterate
    - Ctrl + Shift + q: shutdown notebook

* Terminal:
    - Ctrl + d: exit
    - Ctrl + l: clear
    - man vs. info
    - type instead of which
    - umount -R to handle busy things

* Vim:
    - selection followed by :term bash to run as a command
    - ~ for case switch upper/lower
    - exact search in the form /\<str\>
    - search selected (yanked): / Ctrl + r followed by "

* man:
    - & search to show only matching lines
    - C functions are included

* git:
    - @ <=> HEAD
    - git rebase interactive:
        - reword and fixup
