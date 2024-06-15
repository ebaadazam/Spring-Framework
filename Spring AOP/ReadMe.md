<b>Aspect-Oriented Programming (AOP)</b> is a programming paradigm that aims to increase modularity by allowing the separation of cross-cutting concerns. AOP complements Object-Oriented Programming (OOP) by providing a way to add behavior to existing code without modifying the code itself. In Spring, AOP is used to implement cross-cutting concerns like logging, transaction management, security, etc.

<b>Key Concepts in Spring AOP:</b> <br>
<b>Aspect:</b> A module that encapsulates a concern that cuts across multiple classes. In Spring AOP, an aspect can be implemented using regular classes annotated with @Aspect.<br>

<b>Join Point:</b> A point during the execution of a program, such as the execution of a method or the handling of an exception. In Spring AOP, a join point is always a method execution.<br>

<b>Advice:</b> Action taken by an aspect at a particular join point. Different types of advice include:<br>

Before Advice:  Runs before the method execution. <br>
After Advice:  Runs after the method execution, regardless of its outcome. <br>
After Returning Advice:  Runs after the method execution, only if the method completes successfully. <br>
After Throwing Advice:  Runs after the method execution, only if the method exits by throwing an exception. <br>
Around Advice:  Runs around the method execution, allowing the advice to execute both before and after the method execution. <br>
Pointcut:  A predicate that matches join points. A pointcut expression determines where advice should be applied. <br>

<b>Introduction:</b> Adding new methods or fields to existing classes.<br>

<b>Target Object:</b> The object being advised by one or more aspects; this object is always a proxied object.<br>

<b>Weaving:</b> The process of linking aspects with other application types or objects to create an advised object. This can be done at compile time, load time, or runtime. Spring AOP performs weaving at runtime.<br>
