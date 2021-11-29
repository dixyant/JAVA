# Reflection In Java

Reflection in java is an Application Programming Interface (API) that is used for examining or modifying the behaviour of interfaces, methods, classes at runtime.

The java. lang. Class classes provide many different methods that can be used for metadata, examine and change the behaviour of interfaces, methods, classes at run time. The java. lang and java. lang.reflect package provide required classes for the reflection.

### Advantages and Disadvantages of Reflection 

#### Advantages:

* Extensibility Features: An application may make use of external, user-defined classes by creating instances of extensibility objects using their fully-qualified names.
* Debugging and testing tools: Debuggers use the property of reflection to examine private members on classes.
 

#### Disadvantages:

* Performance Overhead: Reflective operations have slower performance than their non-reflective counterparts, and should be avoided in sections of code which are called frequently in performance-sensitive applications.
* Exposure of Internals: Reflective code breaks abstractions and therefore may change behavior with upgrades of the platform.
