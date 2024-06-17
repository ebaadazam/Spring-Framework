<b>Aspect-Oriented Programming (AOP)</b> is a programming paradigm that aims to increase modularity by allowing the separation of cross-cutting concerns from the business logic. AOP complements Object-Oriented Programming (OOP) by providing a way to add behavior to existing code without modifying the code itself. In Spring, AOP is used to implement cross-cutting concerns like logging, transaction management, security, etc.<br>
It doesn't matter whatever application you are building there is one thing common for all the applications that is maintaining the log file, maintaining the security and handling the transactions. Whenever you call a particular method, you maintain logs.<br>
In AOP, we create a separate class annotated with @Aspect and @Component and not write the code in the business logic i.e, the controller class. In Aspect-Oriented Programming (AOP), cross-cutting concerns are modularized into separate units called aspects, allowing them to be applied across different points of an application without cluttering the business logic.

<b>Key Concepts in Spring AOP:</b> <br>
<b>1. Aspect:</b> A module that encapsulates a concern that cuts across multiple classes. In Spring AOP, an aspect can be implemented using regular classes annotated with @Aspect.<br>

<b>2. Join Point:</b> A point during the execution of a program, such as the execution of a method or the handling of an exception. In Spring AOP, a join point is always a method execution.<br>

<b>3. Advice:</b> Action taken by an aspect at a particular join point. Different types of advice include:<br>

Before Advice -  Runs before the method execution. <br>
After Advice -  Runs after the method execution, irrespective of the exception or error. <br>
After Returning Advice -  Runs after the method execution, only if the method completes successfully and not have any exception. <br>
After Throwing Advice -  Runs after the method execution, only if the method throws an exception. <br>
Around Advice -  Runs around the method execution, allowing the advice to execute both before and after the method execution. <br>
Pointcut -  A predicate that matches join points. A pointcut expression determines where advice should be applied. It is basically the expression that we use along with advice<br>

<b>4. Introduction:</b> Adding new methods or fields to existing classes.<br>

<b>5. Target Object:</b> The object being advised by one or more aspects; this object is always a proxied object.<br>

<b>6. Weaving:</b> The process of linking aspects with other application types or objects to create an advised object. This can be done at compile time, load time, or runtime. Spring AOP performs weaving at runtime.<br>


<b>Common Use Cases:</b><br>
<b>Logging - </b> Log method calls, parameters, and execution time. <br>
<b>Transaction Management - </b> Manage transactions declaratively.<br>
<b>Security - </b> Implement security checks and access controls.<br>
<b>Caching - </b> Add caching mechanisms to methods.<br>
<b>Error Handling - </b> Centralize error and exception handling.<br>
