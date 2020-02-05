# Design_pattern_java
CoffeeMaker - Implements Singleton design pattern
Singleton pattern is a software design pattern that restricts the instantiation of a class to one "single" instance. This is useful when we have to restrict object creation to one which will coordinate actions across the system. 
An implementation of the singleton pattern must ensure that:
-One instance of the singleton class ever exists; and
-Provide global access to that instance.
This can be done by:
-Declaring all constructors of the class to be private 
-Providing a static method that returns a reference to the instance.


Topping - Implements Decorator design patter.
Decorator pattern allows behavior to be added to an individual object dynamically without affecting the existing behavior of other objects from the same class. It wraps the original code and adds responsibilites to the object.


Coffee - Implements Factory design pattern
Factory pattern is used to create object without exposing the creation logic to client and the client uses a common interface to create new type of object.
It makes use of factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. 
This is done by:
-Creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.
