# Gang of Four Design Patterns

设计模式：是指在软件开发过程中，经过验证的，用于解决在特定环境下、重复出现的、特定问题的解决方案。

创建型：抽象了对象实例化过程，用来帮助创建对象的实例。
        简单工厂模式
        Singleton(单例模式)
        Factory Method(工厂方法模式)
        Abstract Factory(抽象工厂模式)
        Builder(生成器模式)
        Prototype(原型模式)

结构型：描述如何组合类和对象以获得更大的结构。
        Facade(外观模式)
        Adapter(适配器模式)
        Proxy(代理模式)
        Composite(组合模式)
        Flyweight(享元模式)
        Decorator(装饰模式)
        Bridge(桥接模式)

行为型：描述算法和对象间职责的分配。
        Mediator(中介者模式)
        Observer(观察者模式)
        Command(命令模式)
        Iterator(迭代器模式)
        Template Method(模板方法模式)
        Strategy(策略模式)
        State(状态模式)
        Memento(备忘录模式)
        Interpreter(解释器模式)
        Chain of Responsibility(职责链模式)
        Visitor(访问者模式)



。Facade(外观模式)
    为子系统中的一组接口提供一个一致的界面，Facade模式定义了一个高层接口，这个接口使得这一子系统更加
容易使用。
    目的不是给子系统添加新的功能接口，而是为了让外部减少与子系统内多个模块的交互，松散耦合，从而让外
部能够更简单地使用子系统。
  。外观模式与中介者模式
  。外观模式和单例模式
  。外观模式和抽象工厂模式


。Adapter(适配器模式)
    将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些
类可以一起工作。