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

## Chapter 4 - Classes and interfaces
Item 15 - Minimize the accessibility of classes and members <br>
* The rule of thumb is simple: make each class or member as inaccessible as
  possible. In other words, use the lowest possible access level consistent with the
  proper functioning of the software that you are writing.
* To facilitate testing your code, you may be tempted to make a class, interface, or member more accessible than
  otherwise necessary. This is fine up to a point. It is acceptable to make a private member of a public class
  package-private in order to test it, but it is not acceptable to raise the accessibility any higher. In other
  words, it is not acceptable to make a class, interface, or member a part of a package’s exported API to
  facilitate testing.
* The same advice applies to static fields, with one exception. You can expose constants via public static final
  fields, assuming the constants form an integral part of the abstraction provided by the class. By convention,
  such fields have names consisting of capital letters, with words separated by underscores (Item 68). It is
  critical that these fields contain either primitive values or references to immutable objects (Item 17). a field
  containing a reference to a mutable object has all the disadvantages of a nonfinal field. While the reference
  cannot be modified, the referenced object can be modified—with disastrous results.
* To summarize, you should reduce accessibility of program elements as much
  as possible (within reason). After carefully designing a minimal public API, you
  should prevent any stray classes, interfaces, or members from becoming part of
  the API. With the exception of public static final fields, which serve as constants,
  public classes should have no public fields. Ensure that objects referenced by
  public static final fields are immutable.
  
Item 16 - In public classes use accessor methods not public fields <br>
* In summary, public classes should never expose mutable fields. It is less
harmful, though still questionable, for public classes to expose immutable fields.
It is, however, sometimes desirable for package-private or private nested classes to
expose fields, whether mutable or immutable.

Item 17 - Minimize mutability <br>
* Immutable classes are easier to design, implement, and use than mutable classes. They are
  less prone to error and are more secure. 
* To make a class immutable, follow these five rules:
  1. Don’t provide methods that modify the object’s state (known as mutators).
  2. Ensure that the class can’t be extended.
  3. Make all fields final. 
  4. Make all fields private.
  5. Ensure exclusive access to any mutable components. 
* Immutable objects are inherently thread-safe; they require no synchronization. They cannot be corrupted by multiple
  threads accessing them concurrently. This is far and away the easiest approach to achieve thread safety. Since no
  thread can ever observe any effect of another thread on an immutable object, immutable objects can be shared freely.
* To summarize, resist the urge to write a setter for every getter. Classes should be immutable unless there’s a very
  good reason to make them mutable.
  Immutable classes provide many advantages, and their only disadvantage is the potential for performance problems
  under certain circumstances.
  There are some classes for which immutability is impractical. If a class cannot be made immutable, limit its mutability
  as much as possible. Reducing the number of states in which an object can exist makes it easier to reason about
  the object and reduces the likelihood of errors. Therefore, make every field final unless there is a compelling
  reason to make it nonfinal. Combining the advice of this item with that of Item 15, your natural inclination should
  be to declare every field private final unless there’s a good reason to do otherwise
  Constructors should create fully initialized objects with all of their invariants established. Don’t provide a public
  initialization method separate from the constructor or static factory unless there is a compelling reason to do so.
  Similarly, don’t provide a “reinitialize” method that enables an object to be reused as if it
  had been constructed with a different initial state.

Item 18 - Favor composition over inheritance <br>
* Inheritance is a powerful way to achieve code reuse, but it is not always the best tool for the job. Used
  inappropriately, it leads to fragile software. It is safe to use inheritance within a package, where the subclass
  and the superclass implementations are under the control of the same programmers. It is also safe to use inheritance
  when extending classes specifically designed and documented for extension (Item 19).
* Inheriting from ordinary concrete classes across package boundaries, however, is dangerous.
  As a reminder, this book uses the word “inheritance” to mean implementation inheritance (when one class extends
  another). The problems discussed in this item do not apply to interface inheritance (when a class implements an
  interface or when one interface extends another).
* Luckily, there is a way to avoid all of the problems described above. Instead of extending an existing class, give
  your new class a private field that references an instance of the existing class. This design is called composition
  because the existing class becomes a component of the new one. Each instance method in the new class invokes the
  corresponding method on the contained instance of the existing class and returns the results. This is known as
  forwarding, and the methods in the new class are known as forwarding methods. The resulting class will be rock
  solid, with no dependencies on the implementation details of the existing class.
* To summarize, inheritance is powerful, but it is problematic because it violates encapsulation.
  It is appropriate only when a genuine subtype relationship exists between the subclass and the superclass. Even then,
  inheritance may lead to fragility if the subclass is in a different package from the superclass and the
  superclass is not designed for inheritance. To avoid this fragility, use composition and forwarding instead of
  inheritance, especially if an appropriate interface to implement a wrapper class exists. Not only are wrapper classes
  more robust than subclasses, they are also more powerful.

Item 19 - Design and document for inheritance or else prohibit it <br>
* First, the class must document precisely the effects of overriding any method.
  In other words, the class must document its self-use of overridable methods.
  For each public or protected method, the documentation must indicate which overridable methods the method invokes,
  in what sequence, and how the results of each invocation affect subsequent processing.
  (By overridable, we mean nonfinal and either public or protected.) More generally, a class must document any
  circumstances under which it might invoke an overridable method.
  For example, invocations might come from background threads or static initializers.
* There are a few more restrictions that a class must obey to allow inheritance.
  Constructors must not invoke overridable methods, directly or indirectly. If you violate this rule, program failure
  will result. The superclass constructor runs before the subclass constructor, so the overriding method in the
  subclass will get invoked before the subclass constructor has run. If the overriding method depends
  on any initialization performed by the subclass constructor, the method will not behave as expected.
* Note that it is safe to invoke private methods, final methods, and static methods, none of which are overridable,
  from a constructor
* The best solution to this problem is to prohibit subclassing in classes that are not designed and documented to be
  safely subclassed. There are two ways to prohibit subclassing. The easier of the two is to declare the class final. The
  alternative is to make all the constructors private or package-private and to add public static factories in place
  of the constructors. This alternative, which provides the flexibility to use subclasses internally, is discussed in
  Item 17. Either approach is acceptable.
* Unless you know there is a real need for subclasses, you are probably better off prohibiting inheritance by declaring
  your class final or ensuring that there are no accessible constructors. If you really need inheritance,
  you must document all of its self-use patterns, and once you’ve documented them, you must commit to
  them for the life of the class.
Item 20 - Prefer interfaces to abstract classes <br>
* To summarize, an interface is generally the best way to define a type that permits multiple implementations. If you
  export a nontrivial interface, you should strongly consider providing a skeletal implementation to go with it. To
  the extent possible, you should provide the skeletal implementation via default methods on the interface so that
  all implementors of the interface can make use of it. That said, restrictions on interfaces typically mandate that
  a skeletal implementation take the form of an abstract class.
Item 21 - Design interfaces for posterity <br>
* The declaration for a default method includes a default implementation that is used by all classes that implement
  the interface but do not implement the default method. While the addition of default methods to Java makes it possible
  to add methods to an existing interface, there is no guarantee that these methods will work in all preexisting
  implementations. Default methods are “injected” into existing implementations without the knowledge or consent of
  their implementors. Before Java 8, these implementations were written with the tacit understanding that their interfaces
  would never acquire any new methods.
* Using default methods to add new methods to existing interfaces should be
  avoided unless the need is critical, in which case you should think long and hard
  about whether an existing interface implementation might be broken by your
  default method implementation.
* Therefore, it is critically important to test each new interface before you release it. Multiple programmers should
  implement each interface in different ways. At a minimum, you should aim for three diverse implementations. Equally
  important is to write multiple client programs that use instances of each new interface to perform various tasks.
  This will go a long way toward ensuring that each interface satisfies all of its intended uses. These steps will
  allow you to discover flaws in interfaces before they are released, when you can still correct them easily. While
  it may be possible to correct some interface flaws after an interface is released, you cannot count on it.
Item 22 - Use interfaces only to define types <br>
* One kind of interface that fails this test is the so-called constant interface. Such an interface contains no methods;
  it consists solely of static final fields, each exporting a constant.
* In summary, interfaces should be used only to define types. They should not be used merely to export constants
Item 23 - Prefer class hierarchies to tagged classes <br>
* In summary, tagged classes (whose instances come in two or more flavors and contain a tag field
  indicating the flavor of the instance) are seldom appropriate. If you’re tempted to write a class with an explicit tag field,
  think about whether the tag could be eliminated and the class replaced by a hierarchy. When you encounter an existing
  class with a tag field, consider refactoring it into a hierarchy
Item 24 - Favor static member classes over nonstatic <br>
* A nested class is a class defined within another class. A nested class should exist only to serve its enclosing
  class. If a nested class would be useful in some other context, then it should be a top-level class. There are four
  kinds of nested classes: static member classes, nonstatic member classes, anonymous classes, and local
  classes. All but the first kind are known as inner classes. This item tells you when to use which kind of nested
  class and why.
* Despite the syntactic similarity, these two kinds of nested classes are very different. Each instance of a nonstatic
  member class is implicitly associated with an enclosing instance of its containing class. Within instance methods of
  a nonstatic member class, you can invoke methods on the enclosing instance or obtain a reference to the enclosing
  instance using the qualified "this" construct. If an instance of a nested class can exist in isolation from an
  instance of its enclosing class, then the nested class must be a static member class: it is impossible to create
  an instance of a nonstatic member class without an enclosing instance
* If you declare a member class that does not require access to an enclosing instance, always put the "static" modifier
  in its declaration, making it a static rather than a nonstatic member class.
  If you omit this modifier, each instance will have a hidden extraneous reference to its enclosing instance. As
  previously mentioned, storing this reference takes time and space. More seriously, it can result in
  the enclosing instance being retained when it would otherwise be eligible for garbage collection (Item 7). The
  resulting memory leak can be catastrophic. It is often difficult to detect because the reference is invisible.
* An anonymous class has no name. It is not a member of its enclosing class. Rather than being declared along with
  other members, it is simultaneously declared and instantiated at the point of use. Anonymous classes
  are permitted at any point in the code where an expression is legal. Anonymous classes have enclosing instances if
  and only if they occur in a nonstatic context.
  But even if they occur in a static context, they cannot have any static members other than constant variables, which
  are final primitive or string fields initialized to constant expressions
* Before lambdas were added to Java (Chapter 6), anonymous classes were the preferred means of creating small function
  objects and process objects on the fly, but lambdas are now preferred (Item 42). Another common use of anonymous
  classes is in the implementation of static factory methods
* To recap, there are four different kinds of nested classes, and each has its
  place. If a nested class needs to be visible outside of a single method or is too long
  to fit comfortably inside a method, use a member class. If each instance of a member class needs a reference to its
  enclosing instance, make it nonstatic; otherwise,
  make it static. Assuming the class belongs inside a method, if you need to create
  instances from only one location and there is a preexisting type that characterizes
  the class, make it an anonymous class; otherwise, make it a local class
Item 25 - Limit source files to a single top level class <br>
* The lesson is clear: Never put multiple top-level classes or interfaces in a single source file. Following this rule
  guarantees that you can’t have multiple definitions for a single class at compile time. This in turn guarantees that
  the class files generated by compilation, and the behavior of the resulting program, are independent of the order in
  which the source files are passed to the compiler.

  

TODO Continue the details list


