# shuati[![Build Status](https://travis-ci.org/derxir/shuati.svg?branch=master)](https://travis-ci.org/derxir/shuati)

Design Pattern
- 
focus on understanding OO principles for each pattern, when and how to use it

OO 原则
-
- 封装变化
- 多用组合，少用继承
- 针对接口编程， 不针对实现编程
- 为交互对象之间的松耦合设计而努力
- 对扩展开放，对修改关闭

观察者模式
- 
 - observable 和 observer 存在一对多关系
 - 解决的问题：解耦为了维护依赖对象之间的一致性的强耦合
 - 实现：
    - interface subject: 保存观察者对象的引用，提供增加/删除观察者的行为
    - class concrete subject: 内部状态改变时给注册过的观察者发通知
    - interface observer: 所有观察者的接口，得到主题时通知自己
    - class concrete observer: 实现更新接口，用来同步自身状态和主题状态的一致性
 - 试用场景：
    - 当一个对象的改变需要改变其它对象时，而且它不知道具体有多少个对象有待改变
    - 一个抽象模型有两个方面并且一方面依赖于另一方面
    
装饰者模式
-
 - 解决问题： 动态地给一个对象增加新功能
 - 实现：
    - component: 超类接口
    - concreteComponent: 被装饰对象
    - decorator: 持有component的引用，装饰对象接受所有客户端的请求，并把这些请求转发给真实的对象。这样，就能在真实对象调用前后增加新的功能。
    - concreteDecorator: 给对象增加功能
 - 装饰者模式由装饰者和被装饰者组成，并且都继承于同一个超类component。被装饰者含有装饰者的引用。
 - 装饰者的行为包含新加的行为和delegate到被装饰者本身的行为两部分。
 - 装饰者通常是用其他类似于工厂或生成器模式创建的。
 - 装饰者和被装饰者必须是一样的类型，也就是共同的超类。这里的继承是为了类型匹配而不是利用继承获得行为。
 - 新的行为来自于装饰者和component的组合而不是超类继承。
 - 装饰者的行为是在运行时添加的，增加新的行为时不需要修改现有的代码
 - 缺点：
    - 不好debug
    - 大量的小对象，占内存
 
代理模式
-
 - 解决问题： 限制对一个类的访问
 - 实现：
    - SubjectBase: interface
    - Subject: class with the real logic
    - proxy: proxying and encapsulating the Subject object
 - 试用场景
    - 延迟加载
    - 动态代理
    - 远程代理
    - 虚拟代理
    - 安全代理
    - 指针引用
    
 