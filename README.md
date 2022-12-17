# EffectiveJavaExperiments

## :fire: Chapter 2 - Creating and destroying objects 
Item 1 - Consider static factory methods instead of constructors.<br>
Item 2 - Consider a builder when faced with many constructor parameters.<br> 
Item 3 - Enforce the singleton property with a private constructor or an enum type <br>
Item 4 - Enforce non instantiability with a private constructor <br>
Item 5 - Prefer dependency injection to hardwiring resources <br>
Item 6 - Avoid creating unnecessary objects (when you can reuse existing ones) <br>
Item 7 - Eliminate obsolete object references <br>
Item 8 - Avoid finalizers and cleaners <br>
Item 9 - Prefer try-with-resources to try-finally <br>

## :fire: Chapter 3 - Methods common to all objects
Item 10 - Obey the general contract when overriding "equals". <br>
Item 11 - Always override hashCode when you override equals. <br>
Item 12 - Always override toString <br>
Item 13 - Override clone judiciously  (with good judgement or sense.) <br>
Item 14 - Consider implementing Comparable <br>

## Chapter 4 - Classes and interfaces
Item 15 - Minimize the accessibility of classes and members <br>
Item 16 - In public classes use accessor methods not public fields <br>
Item 17 - Minimize mutability <br>
Item 18 - Favor composition over inheritance <br>
Item 19 - Design and document for inheritance or else prohibit it <br>
Item 20 - Prefer interfaces to abstract classes <br>
Item 21 - Design interfaces for posterity <br>
Item 22 - Use interfaces only to define types <br>
Item 23 - Prefer class hierarchies to tagged classes <br>
Item 24 - Favor static member classes over nonstatic <br>
Item 25 - Limit source files to a single top level class <br>

## Chapter 5 - Generics
Item 26 - Don't use raw types <br>
Item 27 - Eliminate unchecked warnings <br>
Item 28 - Prefer lists to arrays <br>
Item 29 - Favor generic types <br>
Item 30 - Favor generic methods <br>
Item 31 - Use bounded wildcards to increase API flexibility <br>
Item 32 - Combine generics and varargs judiciously <br>
Item 33 - Consider typesafe heterogeneous containers <br>

## Chapter 6 - Enums and Annotations
Item 34 - Use enums instead of int constants <br>
Item 35 - Use instance fields instead of ordinals <br>
Item 36 - Use EnumSet instead of bit fields <br>
Item 37 - Use EnumMap instead of ordinal indexing <br>
Item 38 - Emulate extensible enums with interfaces <br>
Item 39 - Prefer annotations to naming patterns <br>
Item 40 - Consistently use the Override annotations <br>
Item 41 - Use marker interfaces to define types <br>

## Chapter 7 - Lambdas and Streams
Item 42 - Prefer lambdas to anonymous classes <br>
Item 43 - Prefer method references to lambdas <br>
Item 44 - Favor the use of standard functional interfaces <br>
Item 45 - Use streams judiciously <br>
Item 46 - Prefer side-effect-free functions in streams <br>
Item 47 - Prefer Collection to Stream as a return type <br>
Item 48 - Use caution when making streams parallel <br>

## Chapter 8 - Methods
Item 49 - Check parameters for validity <br>
Item 50 - Make defensive copies when needed <br>
Item 51 - Design method signatures carefully <br>
Item 52 - Use overloading judiciously <br>
Item 53 - Use varargs judiciously <br>
Item 54 - Return empty collections or arrays not nulls <br>
Item 55 - Return Optionals judiciously <br>
Item 56 - Write doc comments for all exposed API elements <br>

## Chapter 9 - General programming
Item 57 - Minimize the scope of local variables <br>
Item 58 - Prefer for-each loops to traditional for loops <br>
Item 59 - Know and use the libraries <br>
Item 60 - Avoid float and double if exact answers are required <br>
Item 61 - Prefer primitive types to boxed primitives <br>
Item 62 - Avoid Strings where other types are more appropriate <br>
Item 63 - Beware the performance of String concatenation <br>
Item 64 - Refer to objects by their interfaces <br>
Item 65 - Prefer interfaces to reflection <br>
Item 66 - Use native methods judiciously <br>
Item 67 - Optimize judiciously <br>
Item 68 - Adhere to general accepted naming conventions <br>

## Chapter 10 - Exceptions
Item 69 - Use exceptions only for exceptional conditions <br>
Item 70 - Use checked exceptions for recoverable conditions and runtime exceptions for programming errors <br>
Item 71 - Avoid unnecessary use of checked exceptions <br>
Item 72 - Favor the use of standard exceptions <br>
Item 73 - Throw exceptions appropriate to the abstraction <br>
Item 74 - Document all exceptions thrown by each method <br>
Item 75 - Include failure-capture information in detail messages <br>
Item 76 - Strive for failure atomicity <br>
Item 77 - Don't ignore exceptions <br>

## Chapter 11 - Concurrency
Item 78 - Synchronize access to shared mutable data <br>
Item 79 - Avoid excessive synchronization <br>
Item 80 - Prefer executors , tasks and streams to threads <br>
Item 81 - Prefer concurrency utilities to wait and notify <br>
Item 82 - Document thread safety <br>
Item 83 - Use lazy initialization judiciously <br>
Item 84 - Don't depend on the thread scheduler <br>

## Chapter 12 - Serialization
Item 85 - Prefer alternatives to Java Serialization <br>
Item 86 - Implement Serializable with great caution <br>
Item 87 - Consider using a custom serialized form <br>
Item 88 - Write readObject methods defensively <br>
Item 89 - For instance control, prefer enum types to readResolve <br>
Item 90 - Consider serialization proxies instead of serialized instances <br>


# More details on items
## Chapter 2 - Creating and destroying objects
Item 1 - Consider static factory methods instead of constructors.<br>
* static factory methods, unlike constructors, they have names
* static factory methods, unlike constructors, are not required to create a new
  object each time they’re invoked
* static factory methods, unlike constructors, they can return an object of any subtype
  of their return type
* static factories is that the class of the returned object need not exist when the class
  containing the method is written

Item 2 - Consider a builder when faced with many constructor parameters.<br> 
* In summary, the Builder pattern is a good choice when designing classes whose constructors or static
  factories would have more than a handful of parameters, especially if many of the parameters are optional or
  of identical type.

Item 3 - Enforce the singleton property with a private constructor or an enum type <br>
*  Presents 3 ways to create a singleton

Item 4 - Enforce non instantiability with a private constructor <br>
* Because the explicit constructor is private, it is inaccessible outside the class.
  The AssertionError isn’t strictly required, but it provides insurance in case the
  constructor is accidentally invoked from within the class. It guarantees the class
  will never be instantiated under any circumstances.

Item 5 - Prefer dependency injection to hardwiring resources <br>
* This practice, known as dependency injection, will greatly enhance the flexibility, reusability, and testability of a class.

Item 6 - Avoid creating unnecessary objects (when you can reuse existing ones) <br>
*  String s = new String("bikini"); // DON'T DO THIS!
* You can often avoid creating unnecessary objects by using static factory methods (Item 1) in preference to
  constructors on immutable classes that provide both.
* Another way to create unnecessary objects is autoboxing, which allows the programmer to mix primitive and boxed
  primitive types, boxing and unboxing automatically as needed.
* The lesson is clear: prefer primitives to boxed primitives, and watch out for unintentional autoboxing.

Item 7 - Eliminate obsolete object references <br>
* If an object reference is unintentionally retained, not only is that object excluded from garbage collection, but so
  too are any objects referenced by that object, and so on.
* The fix for this sort of problem is simple: null out references once they become obsolete. (Nulling out object references should be the exception rather than the norm.)
* The best way to eliminate an obsolete reference is to let the variable that contained the reference fall out of scope.
  This occurs naturally if you define each variable in the narrowest possible scope (Item 57).
* So when should you null out a reference? What aspect of a class makes it susceptible to memory leaks?
  Generally speaking, whenever a class manages its own memory, the programmer should be alert for memory leaks.
  
Item 8 - Avoid finalizers and cleaners <br>
* Just have your class implement AutoCloseable, and require its clients
  to invoke the close method on each instance when it is no longer needed,
  typically using try-with-resources to ensure termination even in the face of
  exceptions
*  In summary, don’t use cleaners, or in releases prior to Java 9, finalizers,
   except as a safety net or to terminate noncritical native resources. Even then,
   beware the indeterminacy and performance consequences

Item 9 - Prefer try-with-resources to try-finally <br>
* Always use try-with-resources in preference to try finally when working with resources that must
  be closed. The resulting code is shorter and clearer, and the exceptions that it generates are more useful.
  The try-with-resources statement makes it easy to write correct code using resources that
  must be closed, which was practically impossible using try-finally

## Chapter 3 - Methods common to all objects
Item 10 - Obey the general contract when overriding "equals". <br>
*  When to not override "equals" ? A :  Each instance of a class is inherently 
unique, or there is no need for the class to provide a “logical equality” test, 
or a superclass has already overridden equals and the superclass behavior is appropriate for
this class, or class is private or package-private and you are certain that its equals method will never be invoked.
* When is it appropriate to override equals? When a class has a notion of logical equality that differs from
  mere object identity and a superclass has not already overridden equals. This is generally the case for "value
  classes".
* When you override the equals method, you must adhere to its general contract:
  * Reflexive: For any non-null reference value x, x.equals(x) must return true.
  * Symmetric: For any non-null reference values x and y, x.equals(y) must return true if and only if
    y.equals(x) returns true.
  * Transitive: For any non-null reference values x, y, z, if x.equals(y) returns true and y.equals(z) returns
    true, then x.equals(z) must return true.
  * Consistent: For any non-null reference values x and y, multiple invocations of x.equals(y) must consistently
    return true or consistently return false, provided no information used in equals comparisons is modified.
  * For any non-null reference value x, x.equals(null) must return false.
* if you violated the equals contract, you simply don’t know how other objects will behave when confronted with
  your object.
* a recipe for a high-quality equals method (see book notes)
* Google’s open source AutoValue framework
* having IDEs generate equals (and hashCode) methods is generally preferable to
  implementing them manually because IDEs do not make careless mistakes, and humans do.

Item 11 - Always override hashCode when you override equals. <br>
* You must override hashCode in every class that overrides equals. If you fail to do so, your class will violate the
  general contract for hashCode, which will prevent it from functioning properly
* Here is the contract, adapted from the Object specification :
  *  When the hashCode method is invoked on an object repeatedly during an execution of an application, it must
     consistently return the same value, provided no information used in equals comparisons is modified
  * If two objects are equal according to the equals(Object) method, then calling hashCode on the two objects must
    produce the same integer result
  * If two objects are unequal according to the equals(Object) method, it is not required that calling hashCode
    on each of the objects must produce distinct results. However, the programmer should be aware that producing
    distinct results for unequal objects may improve the performance of hash tables.
* Objects.hash(lineNum, prefix, areaCode);
* AutoValue framework provides a fine alternative to writing equals and hashCode methods
  manually, and IDEs also provide some of this functionality.
Item 12 - Always override toString <br>
* While it isn’t as critical as obeying the equals and hashCode contracts (Items 10 and 11), providing a good toString
  implementation makes your class much more pleasant to use and makes systems using the class easier to debug.
* Google’s open source AutoValue facility, discussed in Item 10, will generate a toString method for you, as will
  most IDEs.

Item 13 - Override clone judiciously  (with good judgement or sense.) <br>
* Though the specification doesn’t say it, in practice, a class implementing Cloneable is expected to provide a
  properly functioning public clone method. In order to achieve this, the class and all of its superclasses must obey
  a complex, unenforceable, thinly documented protocol. The resulting mechanism is fragile, dangerous, and
  extralinguistic: it creates objects without calling a constructor.
* A better approach to object copying is to provide a copy constructor or copy factory
* Given all the problems associated with Cloneable, new interfaces should not extend it, and new extendable classes
  should not implement it.

Item 14 - Consider implementing Comparable <br>
* By implementing Comparable, you allow your class to interoperate with all of the many generic algorithms and
  collection implementations that depend on this interface. You gain a tremendous amount of power for a small amount
  of effort. 
* The general contract of the compareTo method is similar to that of equals (see book notes)
* If a class has multiple significant fields, the order in which you compare them is critical.
  Start with the most significant field and work your way down.
* whenever you implement a "value class" that has a sensible ordering, you should have the class implement
  the Comparable interface so that its instances can be easily sorted, searched, and used in comparison-based
  collections. When comparing field values in the implementations of the compareTo methods, avoid the use of the
  < and > operators. Instead, use the static compare methods in the boxed primitive classes or the comparator
  construction methods in the Comparator interface

TODO Continue the details list