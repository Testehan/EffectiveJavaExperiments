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

## Chapter 5 - Generics
Item 26 - Don't use raw types <br>
* A class or interface whose declaration has one or more type parameters is a generic class or interface.
  For example, the List interface has a single type parameter, E, representing its element type. The
  full name of the interface is List< E > (read “list of E”), but people often call it List
  for short. Generic classes and interfaces are collectively known as generic types.
* Each generic type defines a raw type, which is the name of the generic type used without any accompanying
  type parameters. For example, the raw type corresponding to List<E> is List. Raw types behave as if all of the
  generic type information were erased from the type declaration. They exist primarily for compatibility with pre-generics code.
* As noted earlier, it is legal to use raw types (generic types without their type parameters), but you should never
  do it. If you use raw types, you lose all the  safety and expressiveness benefits of generics.
* While you shouldn’t use raw types such as List, it is fine to use types that are parameterized to allow insertion of
  arbitrary objects, such as List< Object >.
* you lose type safety if you use a raw type such as List, but not if you use a parameterized type
  such as List< Object >
* In summary, using raw types can lead to exceptions at runtime, so don’t use them. They are provided only for compatibility
  and interoperability with legacy code that predates the introduction of generics. As a quick review, Set< Object > is
  a parameterized type representing a set that can contain objects of any type, Set<?> is a wildcard type representing
  a set that can contain only objects of some unknown type, and Set is a raw type, which opts out of the generic type system.
  The first two are safe, and the last is not.

Table with generic examples

| Term                    | Example                                 |
|-------------------------|-----------------------------------------|
| Parameterized type      | List< String >                          |
| Actual type parameter   | String                                  |
| Generic type            | List< E >                               |
| Formal type parameter   | E                                       |
| Unbounded wildcard type | List< ? >                               |
| Raw type                | List                                    |
| Bounded type parameter  | < E extends Number>                     |
| Recursive type bound    | <T extends Comparable< T > >            |
| Bounded wildcard type   | List<? extends Number>                  |
| Generic method static   | < E > List< E > asList(E[] a)           |
| Type token              | String.class                            |

Item 27 - Eliminate unchecked warnings <br>
* Some warnings will be much more difficult to eliminate. This chapter is filled with examples of such warnings. When
  you get warnings that require some thought, persevere! Eliminate every unchecked warning that you can. If you
  eliminate all warnings, you are assured that your code is typesafe, which is a very good thing. It means that you
  won’t get a ClassCastException at runtime, and it increases your confidence that your program will behave as you intended.
  If you can’t eliminate a warning, but you can prove that the code that provoked the warning is typesafe, then
  (and only then) suppress the warning with an @SuppressWarnings("unchecked") annotation
* Always use the SuppressWarnings annotation on the smallest scope possible. Typically this will be a variable
  declaration or a very short method or constructor. Never use SuppressWarnings on an entire class. Doing so could
  mask critical warnings.
* In summary, unchecked warnings are important. Don’t ignore them. Every unchecked warning represents the potential
  for a ClassCastException at runtime. Do your best to eliminate these warnings. If you can’t eliminate an
  unchecked warning and you can prove that the code that provoked it is typesafe, suppress the warning with a
  @SuppressWarnings("unchecked") annotation in the narrowest possible scope. Record the rationale for your decision
  to suppress the warning in a comment.

Item 28 - Prefer lists to arrays <br>
* Arrays differ from generic types in two important ways. First, arrays are covariant. This scary-sounding word means
  simply that if Sub is a subtype of Super, then the array type Sub[] is a subtype of the array type Super[]. Generics, by
  contrast, are invariant: for any two distinct types Type1 and Type2, List<Type1> is neither a subtype nor a supertype
  of List<Type2>. You might think this means that generics are deficient, but arguably it is arrays that are deficient
* Types such as E, List<E>, and List<String> are technically known as nonreifiable types. Intuitively speaking, a
  non-reifiable type is one whose runtime representation contains less information than its compile-time
  representation. Because of erasure, the only parameterized types that are reifiable are unbounded wildcard types
  such as List<?> and Map<?,?> (Item 26). It is legal, though rarely useful, to create arrays of unbounded wildcard
  types.(erasure meaning "Type erasure can be explained as the process of enforcing type constraints only at
  compile time and discarding the element type information at runtime.")
* In summary, arrays and generics have very different type rules. Arrays are covariant and reified; generics are
  invariant and erased. As a consequence, arrays provide runtime type safety but not compile-time type safety, and
  vice versa for generics. As a rule, arrays and generics don’t mix well. If you find yourself
  mixing them and getting compile-time errors or warnings, your first impulse should be to replace the arrays with lists

Item 29 - Favor generic types <br>
* It is generally not too difficult to parameterize your declarations and make use of the generic types and methods
  provided by the JDK. Writing your own generic types is a bit more difficult, but it’s worth the effort to learn how
* In summary, generic types are safer and easier to use than types that require
  casts in client code. When you design new types, make sure that they can be used
  without such casts. This will often mean making the types generic. If you have any
  existing types that should be generic but aren’t, generify them. This will make life
  easier for new users of these types without breaking existing clients (Item 26).

Item 30 - Favor generic methods <br>
* In summary, generic methods, like generic types, are safer and easier to use than methods requiring their clients
  to put explicit casts on input parameters and return values. Like types, you should make sure that your methods can
  be used without casts, which often means making them generic. And like types, you should generify existing methods
  whose use requires casts. This makes life easier for new users without breaking existing clients (Item 26).

Item 31 - Use bounded wildcards to increase API flexibility <br>
* parameterized types are invariant. In other words, for any two distinct types Type1 and Type2, List< Type1 > is
  neither a subtype nor a supertype of List< Type2 >. Although it is counterintuitive that List< String > is
  not a subtype of List< Object >, it really does make sense. You can put any object
  into a List< Object >, but you can put only strings into a List< String >. Since a
  List< String > can’t do everything a List< Object > can, it isn’t a subtype (by the Liskov substitution principal, Item 10).
* The lesson is clear. For maximum flexibility, use wildcard types on input parameters that represent producers or
  consumers. If an input parameter is both a producer and a consumer, then wildcard types will do you no good: you
  need an exact type match, which is what you get without any wildcards. Here is a mnemonic to help you remember which
  wildcard type to use:
  !!!!       PECS stands for producer-extends, consumer-super.
* Note that the return type is still Set< E >. Do not use bounded wildcard types as return types. Rather than providing
  additional flexibility for your users, it would force them to use wildcard types in client code.
  Properly used, wildcard types are nearly invisible to the users of a class. They cause methods to accept the
  parameters they should accept and reject those they should reject.
  If the user of a class has to think about wildcard types, there is probably something wrong with its API.
* As a rule, if a type parameter appears only once in a method declaration, replace it with a wildcard. If it’s an
  unbounded type parameter, replace it with an unbounded wildcard; if it’s a bounded type parameter, replace it with
  a bounded wildcard.
* In summary, using wildcard types in your APIs, while tricky, makes the APIs
  far more flexible. If you write a library that will be widely used, the proper use of
  wildcard types should be considered mandatory. Remember the basic rule:
  producer-extends, consumer-super (PECS). Also remember that all comparables
  and comparators are consumers.

Item 32 - Combine generics and varargs judiciously <br>
* In summary, varargs and generics do not interact well because the varargs facility is a leaky abstraction built atop
  arrays, and arrays have different type rules from generics. Though generic varargs parameters are not typesafe, they
  are legal.
  If you choose to write a method with a generic (or parameterized) varargs parameter, first ensure that the method is
  typesafe, and then annotate it with @SafeVarargs so it is not unpleasant to use.

Item 33 - Consider typesafe heterogeneous containers <br> 
* In summary, the normal use of generics, exemplified by the collections APIs,
   restricts you to a fixed number of type parameters per container. You can get
   around this restriction by placing the type parameter on the key rather than the
   container. You can use Class objects as keys for such typesafe heterogeneous
   containers. A Class object used in this fashion is called a type token.


## Chapter 6 - Enums and Annotations
Item 34 - Use enums instead of int constants <br>
* The basic idea behind Java’s enum types is simple: they are classes that export one instance for each enumeration
  constant via a public static final field.
* This technique, known as the int enum pattern, has many shortcomings. It provides nothing in the way of type safety
  and little in the way of expressive power. The compiler won’t complain if you pass an apple to a method that expects
  an orange, compare apples to oranges with the == operator
* Enums provide compile-time type safety. If you declare a parameter to be of type Apple, you are guaranteed that
  any non-null object reference passed to the parameter is one of the three valid Apple values.
* It is easy to write a rich enum type such as Planet (see code examples). To associate data with
  enum constants, declare instance fields and write a constructor that takes the
  data and stores it in the fields. Enums are by their nature immutable, so all fields
  should be final (Item 17). Fields can be public, but it is better to make them private
  and provide public accessors (Item 16).
* So when should you use enums? Use enums any time you need a set of constants whose members are known at compile time.
  It is not necessary that the set of constants in an enum type stay fixed for all time. The enum feature was specifically
  designed to allow for binary compatible evolution of enum types.
*  In summary, the advantages of enum types over int constants are compelling.
   Enums are more readable, safer, and more powerful. Many enums require no
   explicit constructors or members, but others benefit from associating data with
   each constant and providing methods whose behavior is affected by this data.
   Fewer enums benefit from associating multiple behaviors with a single method. In
   this relatively rare case, prefer constant-specific methods to enums that switch on
   their own values. Consider the strategy enum pattern if some, but not all, enum
   constants share common behaviors

Item 35 - Use instance fields instead of ordinals <br>
* The Enum specification has this to say about ordinal: “Most programmers will have no use for this method. It is
  designed for use by general-purpose enumbased data structures such as EnumSet and EnumMap.” Unless you are writing code
  with this character, you are best off avoiding the ordinal method entirely.

Item 36 - Use EnumSet instead of bit fields <br>
* In summary, just because an enumerated type will be used in sets, there is no reason to represent it with bit fields.
  The EnumSet class combines the conciseness and performance of bit fields with all the many advantages of enum types
  described in Item 34. The one real disadvantage of EnumSet is that it is not, as of Java 9, possible to create an
  immutable EnumSet, but this will likely be remedied in an upcoming release. In the meantime, you can wrap an EnumSet with
  Collections.unmodifiableSet, but conciseness and performance will suffer.

Item 37 - Use EnumMap instead of ordinal indexing <br>
* More specifically, there is a very fast Map implementation designed for use with enum keys, known as java.util.EnumMap.
* In summary, it is rarely appropriate to use ordinals to index into arrays: use EnumMap instead. If the relationship
  you are representing is multidimensional, use EnumMap<..., EnumMap<...>>. This is a special case of the general principle
  that application programmers should rarely, if ever, use Enum.ordinal (Item 35)  

Item 38 - Emulate extensible enums with interfaces <br>
* In summary, while you cannot write an extensible enum type, you can
  emulate it by writing an interface to accompany a basic enum type that
  implements the interface. This allows clients to write their own enums (or other
  types) that implement the interface. Instances of these types can then be used
  wherever instances of the basic enum type can be used, assuming APIs are written
  in terms of the interface.

Item 39 - Prefer annotations to naming patterns <br>
* There is simply no reason to use naming patterns when you can use annotations instead.
  That said, with the exception of toolsmiths, most programmers will have no need to define annotation types.
  But all programmers should use the predefined annotation types that Java provides (Items 40, 27).
  Also, consider using the annotations provided by your IDE or static analysis tools. Such annotations can
  improve the quality of the diagnostic information provided by these tools. Note,
  however, that these annotations have yet to be standardized, so you may have
  some work to do if you switch tools or if a standard emerges.

Item 40 - Consistently use the Override annotations <br>
* Therefore, you should use the Override annotation on every method declaration that you believe to override a superclass
  declaration. There is one minor exception to this rule. If you are writing a class that is not labeled abstract and you
  believe that it overrides an abstract method in its superclass, you needn’t bother
  putting the Override annotation on that method. In a class that is not declared
  abstract, the compiler will emit an error message if you fail to override an abstract superclass method.
* In an abstract class or an interface, however, it is worth annotating all methods
  that you believe to override superclass or superinterface methods, whether concrete or abstract. For example, the Set
  interface adds no new methods to the Collection interface, so it should include Override annotations on all of its
  method declarations to ensure that it does not accidentally add any new methods to the Collection interface
* In summary, the compiler can protect you from a great many errors if you use
  the Override annotation on every method declaration that you believe to override
  a supertype declaration, with one exception. In concrete classes, you need not
  annotate methods that you believe to override abstract method declarations
  (though it is not harmful to do so).

Item 41 - Use marker interfaces to define types <br>
* You may hear it said that marker annotations (Item 39) make marker interfaces obsolete. This assertion is incorrect.
  Marker interfaces have two advantages over marker annotations. First and foremost, marker interfaces define a type
  that is implemented by instances of the marked class; marker annotations do not. The existence of a marker interface
  type allows you to catch errors at compile time that you couldn’t catch until runtime if you used a marker annotation
  Compile-time error detection is the intent of marker interfaces (unfortunately Serializable is not a good example
  because the writers of the API did not take advantage of this when they wrote the code for ObjectOutputStream.write,
  whose parameter should have been a Serializable, not an Object, and thus it would have detected if an object that
  is not a Serializable is passed to that method at compile time not at run time as it happens now:/ )
* So when should you use a marker annotation and when should you use a marker interface? Clearly you must use an
  annotation if the marker applies to any program element other than a class or interface, because only classes and
  interfaces can be made to implement or extend an interface. If the marker applies only to classes and interfaces,
  ask yourself the question “Might I want to write one or more methods that accept only objects that have this
  marking?” If so, you should use a marker interface in preference to an annotation. This will make it possible
  for you to use the interface as a parameter type for the methods in question, which will result in the benefit of
  compile-time type checking. If you can convince yourself that you’ll never want to write a method that accepts only
  objects with the marking, then you’re probably better off using a marker annotation. If, additionally, the marking
  is part of a framework that makes heavy use of annotations, then a marker annotation is the clear choice.
* In a sense, this item is the inverse of Item 22, which says, “If you don’t want to define a type, don’t use an
  interface.” To a first approximation, this item says, “If you do want to define a type, do use an interface.”

## Chapter 7 - Lambdas and Streams
Item 42 - Prefer lambdas to anonymous classes <br>
* In Java 8, the language formalized the notion that interfaces with a single abstract method are special and deserve
  special treatment. These interfaces are now known as functional interfaces, and the language allows you to create
  instances of these interfaces using lambda expressions, or lambdas for short.
* Omit the types of all lambda parameters unless their presence makes your program clearer.
  If the compiler generates an error telling you it can’t infer the type of a lambda parameter, then specify it
* Item 26 tells you not to use raw types, Item 29 tells you to favor generic types, and Item 30 tells you to
  favor generic methods. This advice is doubly important when you’re using lambdas, because the compiler obtains most
  of the type information that allows it to perform type inference from generics. If you don’t provide this information, the
  compiler will be unable to do type inference, and you’ll have to specify types manually in your lambdas, which will
  greatly increase their verbosity.
* Unlike methods and classes, lambdas lack names and documentation; if a computation isn’t self-explanatory, or
  exceeds a few lines, don’t put it in a lambda
* One line is ideal for a lambda, and three lines is a reasonable maximum.
  If you violate this rule, it can cause serious harm to the readability of your programs. If a lambda is long or
  difficult to read, either find a way to simplify it or refactor your program to eliminate it.
* Likewise, you might think that anonymous classes are obsolete in the era of lambdas. This is closer to the truth,
  but there are a few things you can do with anonymous classes that you can’t do with lambdas. Lambdas are limited to
  functional interfaces. If you want to create an instance of an abstract class, you can do it with an anonymous class,
  but not a lambda. Similarly, you can use anonymous classes to create instances of interfaces with multiple abstract
  methods. Finally, a lambda cannot obtain a reference to itself. In a lambda, the this keyword refers to
  the enclosing instance, which is typically what you want. In an anonymous class, the this keyword refers to the
  anonymous class instance. If you need access to the function object from within its body, then you must use an
  anonymous class
* In summary, as of Java 8, lambdas are by far the best way to represent small function objects. Don’t use anonymous
  classes for function objects unless you have to create instances of types that aren’t functional interfaces. Also,
  remember that lambdas make it so easy to represent small function objects that it opens the door to functional
  programming techniques that were not previously practical in Java.

Item 43 - Prefer method references to lambdas <br>
* In some lambdas, however, the parameter names you choose provide useful documentation, making the lambda more
  readable and maintainable than a method reference, even if the lambda is longer.
* That said, method references usually result in shorter, clearer code. They also give you an out if a lambda gets too
  long or complex: You can extract the code from the lambda into a new method and replace the lambda with a reference
  to that method. You can give the method a good name and document it to your heart’s content
* In summary, method references often provide a more succinct alternative to lambdas. Where method references are
  shorter and clearer, use them; where they aren’t, stick with lambdas.

Item 44 - Favor the use of standard functional interfaces <br>
* If one of the standard functional interfaces does the job, you should generally use it in preference to a purpose-built
  functional interface. This will make your API easier to learn, by reducing its conceptual surface area, and will provide
  significant interoperability benefits, as many of the standard functional interfaces provide useful default methods.
* There are forty-three interfaces in java.util.Function. You can’t be expected to remember them all, but if you
  remember six basic interfaces, you can derive the rest when you need them. The basic interfaces operate on object
  reference types.
  1. The Operator interfaces represent functions whose result and argument types are the same
  2. The Predicate interface represents a function that takes an argument and returns a boolean.
  3. The Function interface represents a function whose argument and return types differ
  4. The Supplier interface represents a function that takes no arguments and returns (or “supplies”) a value
  5. Finally, Consumer represents a function that takes an argument and returns nothing, essentially consuming its argument
* Always annotate your functional interfaces with the @FunctionalInterface annotation.
  This annotation type is similar in spirit to @Override. It is a statement of programmer intent that serves three
  purposes: it tells readers of the class and its documentation that the interface was designed to enable lambdas; it
  keeps you honest because the interface won’t compile unless it has exactly one abstract method; and it prevents
  maintainers from accidentally adding abstract methods to the interface as it evolves
* In summary, now that Java has lambdas, it is imperative that you design your APIs with lambdas in mind. Accept
  functional interface types on input and return them on output. It is generally best to use the standard interfaces
  provided in java.util.function.Function, but keep your eyes open for the relatively rare cases where you would be
  better off writing your own functional interface.

Item 45 - Use streams judiciously <br>
* This API provides two key abstractions: the stream, which represents a finite or infinite sequence of data elements,
  and the stream pipeline, which represents a multistage computation on these elements.
*  Stream pipelines are evaluated lazily: evaluation doesn’t start until the terminal operation is invoked, and data
   elements that aren’t required in order to complete the terminal operation are never computed
* The streams API is sufficiently versatile that practically any computation can be performed using streams, but just
  because you can doesn’t mean you should. When used appropriately, streams can make programs shorter and clearer; when
  used inappropriately, they can make programs difficult to read and maintain.
* Overusing streams makes programs hard to read and maintain.
* So refactor existing code to use streams and use them in new code only where it makes sense to do so.
*  In summary, some tasks are best accomplished with streams, and others with
   iteration. Many tasks are best accomplished by combining the two approaches.
   In many cases, it will be clear which approach to
   use; in some cases, it won’t. If you’re not sure whether a task is better served
   by streams or iteration, try both and see which works better.

Item 46 - Prefer side-effect-free functions in streams <br>
* The most important part of the streams paradigm is to structure your computation as a sequence of transformations where
  the result of each stage is as close as possible to a pure function of the result of the previous stage.
  A pure function is one whose result depends only on its input: it does not depend on any mutable state, nor does it
  update any state. In order to achieve this, any function objects that you pass into stream operations, both intermediate
  and terminal, should be free of side-effects.
* The problem stems from the fact that this code is doing all its work in a terminal
  forEach operation, using a lambda that mutates external state (the frequency table).
* A forEach operation that does  anything more than present the result of the computation performed by a stream is a
  “bad smell in code,” as is a lambda that mutates state.
* The forEach operation should be used only to report the result of a stream computation, not to perform the computation.
  Occasionally, it makes sense to use forEach for
* The Collectors API is intimidating: it has 39 methods, some of which have as many as five type parameters. The good
  news is that you can derive most of the benefit from this API without delving into its full complexity. For starters,
  you can ignore the Collector interface and think of a collector as an opaque object that encapsulates a reduction
  strategy. In this context, reduction means combining the elements of a stream into a single object.
  The object produced by a collector is typically a collection (which accounts for the name collector).
* It is customary and wise to statically import all members of Collectors because it makes stream pipelines more readable.
* This simple form of toMap is perfect if each element in the stream maps to a unique key. If multiple stream elements
  map to the same key, the pipeline will terminate with an IllegalStateException
* The more complicated forms of toMap, as well as the groupingBy method, give you various ways to provide strategies
  for dealing with such collisions. One way is to provide the toMap method with a merge function in addition to its key
  and value mappers. The merge function is a BinaryOperator<V>, where V is the value type of the map. Any additional
  values associated with a key are combined with the existing value using the merge function, so, for example, if the merge
  function is multiplication, you end up with a value that is the product of all the values associated with the key
  by the value mapper.
*  In summary, the essence of programming stream pipelines is side-effect-free function objects. This applies to all of
   the many function objects passed to streams and related objects. The terminal operation forEach should only be used
   to report the result of a computation performed by a stream, not to perform the computation. In order to use streams
   properly, you have to know about collectors. The most important collector factories are toList, toSet, toMap,
   groupingBy, and joining.

Item 47 - Prefer Collection to Stream as a return type <br>
* The Collection interface is a subtype of Iterable and has a stream method, so it provides for both iteration and stream
  access. Therefore, Collection or an appropriate subtype is generally the best return type for a public, sequence returning
  method. Arrays also provide for easy iteration and stream access with the Arrays.asList and Stream.of methods.
* If the sequence you’re returning is small enough to fit easily in memory, you’re probably best off returning one of the
  standard collection implementations, such as ArrayList or HashSet. But do not store a large sequence in memory just
  to return it as a collection.
* In summary, when writing a method that returns a sequence of elements, remember that some of your users may want to
  process them as a stream while others may want to iterate over them. Try to accommodate both groups. If it’s feasible
  to return a collection, do so. If you already have the elements in a collection or the number of elements in the
  sequence is small enough to justify creating a new one, return a standard collection such as ArrayList. Otherwise, consider
  implementing a custom collection as we did for the power set. If it isn’t feasible to return a collection, return a
  stream or iterable, whichever seems more natural. If, in a future Java release, the Stream interface declaration is
  modified to extend Iterable, then you should feel free to return streams because they will allow for both stream
  processing and iteration.

Item 48 - Use caution when making streams parallel <br>
* What’s going on here? Simply put, the streams library has no idea how to parallelize this pipeline and the heuristics
  fail. Even under the best of circumstances, parallelizing a pipeline is unlikely to increase its performance if the
  source is from Stream.iterate, or the intermediate operation limit is used.
* The moral of this story is simple: Do not parallelize stream pipelines indiscriminately. The performance consequences
  may be disastrous.
  As a rule, performance gains from parallelism are best on streams over ArrayList, HashMap, HashSet, and ConcurrentHashMap
  instances; arrays; int ranges; and long ranges.
  What these data structures have in common is that they can all be accurately and cheaply split into subranges of any
  desired sizes, which makes it easy to divide work among parallel threads.
* The nature of a stream pipeline’s terminal operation also affects the effectiveness of parallel execution. If a
  significant amount of work is done in the terminal operation compared to the overall work of the pipeline and that
  operation is inherently sequential, then parallelizing the pipeline will have limited effectiveness.
  The best terminal operations for parallelism are reductions, where all of the elements emerging from the pipeline
  are combined using one of Stream’s reduce methods, or prepackaged reductions such as min, max, count, and sum.
  The shortcircuiting operations anyMatch, allMatch, and noneMatch are also amenable to parallelism. The operations
  performed by Stream’s collect method, which are known as mutable reductions, are not good candidates for parallelism
  because the overhead of combining collections is costly.
* Not only can parallelizing a stream lead to poor performance, including liveness failures; it can lead to incorrect
  results and unpredictable behavior (safety failures). Safety failures may result from parallelizing a pipeline that uses
  mappers, filters, and other programmer-supplied function objects that fail to adhere to their specifications. The
  Stream specification places stringent requirements on these function objects. For example, the accumulator and combiner
  functions passed to Stream’s reduce operation must be associative, non-interfering, and stateless. If you violate
  these requirements (some of which are discussed in Item 46) but run your pipeline sequentially, it will likely yield
  correct results; if you parallelize it, it will likely fail, perhaps catastrophically
* Won’t get a good speedup from parallelization unless the pipeline is doing enough
   real work to offset the costs associated with parallelism. As a very rough estimate,
   the number of elements in the stream times the number of lines of code executed
   per element should be at least a hundred thousand
* In summary, do not even attempt to parallelize a stream pipeline unless you
  have good reason to believe that it will preserve the correctness of the computation
  and increase its speed. The cost of inappropriately parallelizing a stream can be a
  program failure or performance disaster. If you believe that parallelism may be
  justified, ensure that your code remains correct when run in parallel, and do careful
  performance measurements under realistic conditions. If your code remains correct
  and these experiments bear out your suspicion of increased performance, then and
  only then parallelize the stream in production code.

## Chapter 8 - Methods
Item 49 - Check parameters for validity <br>
* If an invalid parameter value is passed to a method and the method checks its parameters before execution, it will
  fail quickly and cleanly with an appropriate exception.
* If the method fails to check its parameters, several things could happen. The method could fail with a confusing
   exception in the midst of processing. Worse, the method could return normally but silently compute the wrong result.
   Worst of all, the method could return normally but leave some object in a compromised state, causing an error at
   some unrelated point in the code at some undetermined time in the future. In other words, failure to validate parameters,
   can result in a violation of failure atomicity (Item 76).
* For public and protected methods, use the Javadoc @throws tag to document the exception that will be thrown if a
  restriction on parameter values is violated (Item 74). Typically, the resulting exception will be IllegalArgumentException,
  IndexOutOfBoundsException, or NullPointerException (Item 72).
* The Objects.requireNonNull method, added in Java 7, is flexible and convenient, so there’s no reason to perform null
  checks manually anymore. You can specify your own exception detail message if you wish
* For an unexported method, you, as the package author, control the circumstances under which the method is called, so
  you can and should ensure that only valid parameter values are ever passed in. Therefore, nonpublic methods
  can check their parameters using assertions
* Constructors represent a special case of the principle that you should check the validity of parameters that are to
  be stored away for later use. It is critical to check the validity of constructor parameters to prevent the
  construction of an object that violates its class invariants.
* Do not infer from this item that arbitrary restrictions on parameters are a good thing. On the contrary, you should
  design methods to be as general as it is practical to make them. The fewer restrictions that you place on parameters, the
  better, assuming the method can do something reasonable wih all of the parameter values that it accepts. Often,
  however, some restrictions are intrinsic to the abstraction being implemented.
* To summarize, each time you write a method or constructor, you should think about what restrictions exist on its
  parameters. You should document these restrictions and enforce them with explicit checks at the beginning of the method
  body. It is important to get into the habit of doing this. The modest work that it entails will be paid back with
  interest the first time a validity check fails

Item 50 - Make defensive copies when needed <br>
* You must program defensively, with the assumption that clients of your class will do their best to destroy its
  invariants. This is increasingly true as people try harder to break the security of systems, but more
  commonly, your class will have to cope with unexpected behavior resulting from the honest mistakes of
  well-intentioned programmers. Either way, it is worth taking the time to write classes that are robust in the face
  of ill-behaved clients.
* As of Java 8, the obvious way to fix this problem is to use Instant (or LocalDateTime or ZonedDateTime) in place of
  a Date because Instant (and the other java.time classes) are immutable (Item 17).
  Date is obsolete and should no longer be used in new code.
* To protect the internals of a Period instance from this sort of attack, it is essential to make a defensive copy of
  each mutable parameter to the constructor and to use the copies as components of the Period instance in place of the
  originals
* Note that defensive copies are made before checking the validity of the parameters (Item 49), and the validity check
  is performed on the copies rather than on the originals. While this may seem unnatural, it is
  necessary. It protects the class against changes to the parameters from another thread during the window of
  vulnerability between the time the parameters are checked and the time they are copied. In the computer security
  community, this is known as a time-of-check/time-of-use or TOCTOU attack.
* There may be a performance penalty associated with defensive copying and it isn’t always justified.
* In summary, if a class has mutable components that it gets from or returns to its clients, the class must
  defensively copy these components. If the cost of the copy would be prohibitive and the class trusts its clients not
  to modify the components inappropriately, then the defensive copy may be replaced by documentation outlining the
  client’s responsibility not to modify the affected components.

Item 51 - Design method signatures carefully <br>
* Don’t go overboard in providing convenience methods. Every method should “pull its weight.” Too many methods make
  a class difficult to learn, use, document, test, and maintain. This is doubly true for interfaces, where too many
  methods complicate life for implementors as well as users. For each action supported by your class or interface,
  provide a fully functional method. Consider providing a “shorthand” only if it will be used often. When in doubt,
  leave it out.
* Avoid long parameter lists. Aim for four parameters or fewer.
* A third technique that combines aspects of the first two is to adapt the Builder pattern (Item 2) from object
  construction to method invocation. Once the desired parameters have been set, the client invokes the object’s
  “execute” method, which does any final validity checks on the parameters and performs the actual computation
* Prefer two-element enum types to boolean parameters, unless the meaning of the boolean is clear from the method name.
  Enums make your code easier to read and to write. Also, they make it easy to add more options later.

Item 52 - Use overloading judiciously <br>
* Because the classify method is overloaded, and the choice of which overloading to invoke is made at compile time.
  For all three iterations of the loop, the compile-time type of the parameter is the same: Collection<?>. The
  runtime type is different in each iteration, but this does not affect the choice of overloading. Because the
  compile-time type of the parameter is Collection<?>, the only applicable overloading is the third one,
  classify(Collection<?>), and this overloading is invoked in each iteration of the loop.
* The behavior of this program is counterintuitive because selection among overloaded methods is static, while
  selection among overridden methods is dynamic.
  The correct version of an overridden method is chosen at runtime, based on the runtime type of the object on which
  the method is invoked
* Because overriding is the norm and overloading is the exception, overriding sets people’s expectations for the
  behavior of method invocation. As demonstrated by the CollectionClassifier example, overloading can easily confound
  these expectations. It is bad practice to write code whose behavior is likely to confuse programmers. This is
  especially true for APIs. If the typical user of an API does not know which of several method overloadings will get
  invoked for a given set of parameters, use of the API is likely to result in errors.
* A safe, conservative policy is never to export two overloadings with the same number of parameters. If a method
  uses varargs, a conservative policy is not to overload it at all, except as described in Item 53. If you adhere to
  these restrictions, programmers will never be in doubt as to which overloading applies
  to any set of actual parameters. These restrictions are not terribly onerous because
  you can always give methods different names instead of overloading them.
* To summarize, just because you can overload methods doesn’t mean you should. It is generally best to refrain from
  overloading methods with multiple signatures that have the same number of parameters. In some cases, especially
  where constructors are involved, it may be impossible to follow this advice. In these cases, you should at least
  avoid situations where the same set of parameters can be passed to different overloadings by the addition of casts.
  If this cannot be avoided, for example, because you are retrofitting an existing class to implement a
  new interface, you should ensure that all overloadings behave identically when passed the same parameters. If
  you fail to do this, programmers will be hard pressed to make effective use of the overloaded method or constructor,
  and they won’t understand why it doesn’t work.

Item 53 - Use varargs judiciously <br>
* Varargs methods, formally known as variable arity methods, accept zero or more arguments of a specified type.
*  In summary, varargs are invaluable when you need to define methods with a variable number of arguments. Precede
   the varargs parameter with any required parameters, and be aware of the performance consequences of using varargs.

Item 54 - Return empty collections or arrays not nulls <br>
* Doing so  (returning a null instead of empty collection) requires extra code in the client to handle the possibly null
  return value
* If you were returning a set, you’d use Collections.emptySet; if you were returning a map, you’d use Collections.emptyMap.
*  In summary, never return null in place of an empty array or collection. It makes your API more difficult to use and
   more prone to error, and it has no performance advantages.

Item 55 - Return Optionals judiciously <br>
*  Never return a null value from an Optional-returning method: it defeats the entire purpose of the facility
*  Container types, including collections, maps, streams, arrays, and optionals should not be wrapped in optionals.
   Rather than returning an empty Optional<List<T>>, you should simply return an empty List<T> (Item 54).
* Returning an optional that contains a boxed primitive type is prohibitively expensive compared to returning a
  primitive type because the optional has two levels of boxing instead of zero
  Therefore, the library designers saw fit to provide analogues of Optional<T> for the primitive types
  int, long, and double. These optional types are OptionalInt, OptionalLong, and OptionalDouble. They
  contain most, but not all, of the methods on Optional<T>.
  Therefore, you should never return an optional of a boxed primitive type, with the possible exception
  of the “minor primitive types,” Boolean, Byte, Character, Short, and Float.
* you should never use optionals as map values. If you do, you have two ways of expressing a key’s
  logical absence from the map: either the key can be absent from the map, or it can be present and
  map to an empty optional. This represents needless complexity with great potential for confusion and errors. More
  generally, it is almost never appropriate to use an optional as a key, value, or element in a collection or array
* In summary, if you find yourself writing a method that can’t always return a value and you believe it is important
  that users of the method consider this possibility every time they call it, then you should probably return an optional.
  You should, however, be aware that there are real performance consequences associated with returning optionals; for
  performance-critical methods, it may be better to return a null or throw an exception. Finally, you should rarely
  use an optional in any other capacity than as a return value.

Item 56 - Write doc comments for all exposed API elements <br>
* To document your API properly, you must precede every exported class, interface, constructor, method, and field
  declaration with a doc comment. If a class is serializable, you should also document its serialized form (Item 87).
* The doc comment for a method should describe succinctly the contract between the method and its client. With the
  exception of methods in classes designed for inheritance (Item 19), the contract should say what the method does
  rather than how it does its job. The doc comment should enumerate all of the method’s preconditions, which are the
  things that have to be true in order for a client to invoke it, and its postconditions, which are the things that
  will be true after the invocation has completed successfully. Typically, preconditions are described implicitly by
  the @throws tags for unchecked exceptions; each unchecked exception corresponds to a precondition violation. Also,
  preconditions can be specified along with the affected parameters in their @param tags.
* To describe a method’s contract fully, the doc comment should have an @param tag for every parameter, an @return
  tag unless the method has a void return type, and an @throws tag for every exception thrown by the method,
  whether checked or unchecked (Item 74).
* This illustrates the general principle that doc comments should be readable both in the source code and in
  the generated documentation. If you can’t achieve both, the readability of the
  generated documentation trumps that of the source code.
* One caveat should be added concerning documentation comments. While it is necessary to provide documentation
  comments for all exported API elements, it is not always sufficient. For complex APIs consisting of multiple
  interrelated classes, it is often necessary to supplement the documentation comments with an
  external document describing the overall architecture of the API. If such a document exists, the relevant class or
  package documentation comments should include a link to it
*  To summarize, documentation comments are the best, most effective way to document your API. Their use should be
   considered mandatory for all exported  API elements. Adopt a consistent style that adheres to standard conventions.
   Remember that arbitrary HTML is permissible in documentation comments and that HTML metacharacters must be escaped.

## Chapter 9 - General programming
Item 57 - Minimize the scope of local variables <br>
* Nearly every local variable declaration should contain an initializer. If you don’t yet have enough information to
  initialize a variable sensibly, you should postpone the declaration until you do. One exception to this rule concerns
  try catch statements.
*  A final technique to minimize the scope of local variables is to keep methods small and focused. If you combine two
   activities in the same method, local variables relevant to one activity may be in the scope of the code performing the
   other activity. To prevent this from happening, simply separate the method into two: one for each activity.

Item 58 - Prefer for-each loops to traditional for loops <br>
* In summary, the for-each loop provides compelling advantages over the traditional for loop in clarity, flexibility,
  and bug prevention, with no performance penalty. Use for-each loops in preference to for loops wherever you can.

Item 59 - Know and use the libraries <br>
*  A second advantage of using the libraries is that you don’t have to waste your time writing ad hoc solutions to
   problems that are only marginally related to your work. If you are like most programmers, you’d rather spend your
   time working on your application than on the underlying plumbing.
* A third advantage of using standard libraries is that their performance tends to improve over time, with no effort
  on your part. Because many people use them and because they’re used in industry-standard benchmarks, the organizations that
  supply these libraries have a strong incentive to make them run faster. Many of the Java platform libraries have been
  rewritten over the years, sometimes repeatedly, resulting in dramatic performance improvements
* A fourth advantage of using libraries is that they tend to gain functionality over time. If a library is missing
  something, the developer community will make it known, and the missing functionality may get added in a subsequent release.
*  A final advantage of using the standard libraries is that you place your code in the mainstream. Such code is more
   easily readable, maintainable, and reusable by the multitude of developers.
* As of Java 7, you should no longer use Random. For most uses, the random number generator of choice is now
  ThreadLocalRandom. It produces higher quality random numbers, and it’s very fast. On my machine, it is 3.6 times faster
  than Random. For fork join pools and parallel streams, use SplittableRandom.
* Given all these advantages, it seems only logical to use library facilities in preference to ad hoc implementations,
  yet many programmers don’t. Why not?
  Perhaps they don’t know the library facilities exist. Numerous features are added to the libraries in every major
  release, and it pays to keep abreast of these additions. Each time there is a major release of the Java platform, a web
  page is published describing its new features. These pages are well worth reading [Java8-feat, Java9-feat].
* The libraries are too big to study all the documentation [Java9-api], but every programmer should be familiar with
  the basics of java.lang, java.util, and java.io, and their subpackages.
  Several libraries bear special mention. The collections framework and the streams library (Items 45–48) should be
  part of every programmer’s basic toolkit, as should parts of the concurrency utilities in java.util.concurrent. This
  package contains both high-level utilities to simplify the task of multithreaded programming and low-level primitives
  to allow experts to write their own higherlevel concurrent abstractions.
* To summarize, don’t reinvent the wheel. If you need to do something that seems like it should be reasonably common,
  there may already be a facility in the libraries that does what you want. If there is, use it; if you don’t know, check.
  Generally speaking, library code is likely to be better than code that you’d write yourself and is likely to improve
  over time. This is no reflection on your abilities as a programmer. Economies of scale dictate that library code
  receives far more attention than most developers could afford to devote to the same functionality.

Item 60 - Avoid float and double if exact answers are required <br>
* The float and double types are designed primarily for scientific and engineering calculations. They perform binary
  floating-point arithmetic, which was carefully designed to furnish accurate approximations quickly over a broad range of
  magnitudes.
* They do not, however, provide exact results and should not be used where exact results are required. The float and
  double types are particularly ill-suited for monetary calculations because it is impossible to represent 0.1 (or
  any other negative power of ten) as a float or double exactly
* The right way to solve this problem is to use BigDecimal, int, or long for monetary calculations
* In summary, don’t use float or double for any calculations that require an exact answer. Use BigDecimal if you want
  the system to keep track of the decimal point and you don’t mind the inconvenience and cost of not using a primitive type.
  Using BigDecimal has the added advantage that it gives you full control over rounding, letting you select from eight
  rounding modes whenever an operation that entails rounding is performed. This comes in handy if you’re performing
  business calculations with legally mandated rounding behavior. If performance is of the essence, you don’t mind
  keeping track of the decimal point yourself, and the quantities aren’t too big, use int or long. If the quantities
  don’t exceed nine decimal digits, you can use int; if they don’t exceed eighteen digits, you can use long. If the
  quantities might exceed eighteen digits, use BigDecimal.

Item 61 - Prefer primitive types to boxed primitives <br>
* Java has a two-part type system, consisting of primitives, such as int, double, and boolean, and reference types,
  such as String and List. Every primitive type has a corresponding reference type, called a boxed primitive. The
  boxed primitives corresponding to int, double, and boolean are Integer, Double, and Boolean
* So when should you use boxed primitives? They have several legitimate uses.
  The first is as elements, keys, and values in collections. You can’t put primitives in collections, so you’re forced
  to use boxed primitives. This is a special case of a more general one. You must use boxed primitives as type parameters in
  parameterized types and methods (Chapter 5), because the language does not permit you to use primitives. For example,
  you cannot declare a variable to be of type ThreadLocal<int>, so you must use ThreadLocal<Integer> instead.
  Finally, you must use boxed primitives when making reflective method invocations (Item 65).
*  In summary, use primitives in preference to boxed primitives whenever you have the choice. Primitive types are simpler
   and faster. If you must use boxed primitives, be careful! Autoboxing reduces the verbosity, but not the danger, of
   using boxed primitives. When your program compares two boxed primitives with the == operator, it does an identity
   comparison, which is almost certainly not what you want. When your program does mixed-type computations involving
   boxed and unboxed primitives, it does unboxing, and when your program does unboxing, it can throw a NullPointerException.
   Finally, when your program boxes primitive values, it can result in costly and unnecessary object creations

Item 62 - Avoid Strings where other types are more appropriate <br>
* Strings are poor substitutes for other value types. When a piece of data comes into a program from a file, from the
  network, or from keyboard input, it is often in string form. There is a natural tendency to leave it that way, but
  this tendency is justified only if the data really is textual in nature. If it’s numeric, it
  should be translated into the appropriate numeric type, such as int, float, or BigInteger. If it’s the answer to a
  yes-or-no question, it should be translated into an appropriate enum type or a boolean. More generally, if there’s an
  appropriate value type, whether primitive or object reference, you should use it; if there isn’t,
  you should write one. While this advice may seem obvious, it is often violated.
* To summarize, avoid the natural tendency to represent objects as strings when better data types exist or can be
  written. Used inappropriately, strings are more cumbersome, less flexible, slower, and more error-prone than other
  types. Types for which strings are commonly misused include primitive types, enums, and aggregate types.

Item 63 - Beware the performance of String concatenation <br>
* The moral is simple: Don’t use the string concatenation operator to combine more than a few strings unless performance
  is irrelevant. Use StringBuilder’s append method instead. Alternatively, use a character array, or
  process the strings one at a time instead of combining them

Item 64 - Refer to objects by their interfaces <br>
* If you get into the habit of using interfaces as types, your program will be much more flexible. If you decide that
  you want to switch implementations, all you have to do is change the class name in the constructor (or use a different
  static factory).
* There is one caveat: if the original implementation offered some special functionality not required by the general
  contract of the interface and the code depended on that functionality, then it is critical that the new implementation
  provide the same functionality. For example, if the code surrounding the first declaration depended on
  LinkedHashSet’s ordering policy, then it would be incorrect to substitute HashSet for LinkedHashSet in the
  declaration, because HashSet makes no guarantee concerning iteration order
* It is entirely appropriate to refer to an object by a class rather than an interface if no appropriate interface
  exists. For example, consider value classes, such as String and BigInteger. Value classes are rarely written with
  multiple implementations in mind. They are often final and rarely have corresponding interfaces. It is perfectly
  appropriate to use such a value class as a parameter, variable, field, or return type
* A second case in which there is no appropriate interface type is that of objects belonging to a framework whose
  fundamental types are classes rather than interfaces. If an object belongs to such a class-based framework, it is
  preferable to refer to it by the relevant base class, which is often abstract, rather than by its implementation class.
  Many java.io classes such as OutputStream fall into this category.
* A final case in which there is no appropriate interface type is that of classes that implement an interface but also
  provide extra methods not found in the interface—for example, PriorityQueue has a comparator method that is not
  present on the Queue interface. Such a class should be used to refer to its instances only if the program relies on
  the extra methods, and this should be very rare

Item 65 - Prefer interfaces to reflection <br>
* In summary, reflection is a powerful facility that is required for certain sophisticated system programming tasks,
  but it has many disadvantages. If you are writing a program that has to work with classes unknown at compile time, you
  should, if at all possible, use reflection only to instantiate objects, and access the objects using some interface
  or superclass that is known at compile time

Item 66 - Use native methods judiciously <br>
* It is rarely advisable to use native methods for improved performance. In early releases (prior to Java 3), it was
  often necessary, but JVMs have gotten much faster since then. For most tasks, it is now possible to obtain comparable
  performance in Java. For example, when java.math was added in release 1.1, BigInteger relied on a then-fast
  multiprecision arithmetic library written in C. In Java 3, BigInteger was reimplemented in Java, and carefully tuned
  to the point where it ran faster than the original native implementation.
* The use of native methods has serious disadvantages. Because native languages are not "safe" (Item 50), applications
  using native methods are no longer immune to memory corruption errors. Because native languages are more platform-dependent
  than Java, programs using native methods are less portable. They are also harder to debug. If you aren’t careful,
  native methods can decrease performance because the garbage collector can’t automate, or even track, native memory
  usage (Item 8), and there is a cost associated with going into and out of native code. Finally, native
  methods require “glue code” that is difficult to read and tedious to write.
* In summary, think twice before using native methods. It is rare that you need to use them for improved performance.
  If you must use native methods to access low-level resources or native libraries, use as little native code as possible
  and test it thoroughly. A single bug in the native code can corrupt your entire application.

Item 67 - Optimize judiciously <br>
* More computing sins are committed in the name of efficiency (without necessarily achieving it) than for any other
single reason—including blind stupidity.  — William A. Wulf
* We should forget about small efficiencies, say about 97% of the time: premature optimization is the root of all evil. —Donald E. Knuth
* We follow two rules in the matter of optimization:
            Rule 1. Don’t do it.
            Rule 2 (for experts only). Don’t do it yet—that is, not until you have a perfectly clear and unoptimized solution.
        —M. A. Jackson
* Don’t sacrifice sound architectural principles for performance. Strive to write good programs rather than fast ones.
  If a good program is not fast enough, its architecture will allow it to be optimized.
  This does not mean that you can ignore performance concerns until your program is complete. Implementation problems can
  be fixed by later optimization, but pervasive architectural flaws that limit performance can be impossible to fix
  without rewriting the system
* Strive to avoid design decisions that limit performance. The components of a design that are most difficult to
  change after the fact are those specifying interactions between components and with the outside world. Chief among these
  design components are APIs, wire-level protocols, and persistent data formats.
* Making a public type mutable may require a lot of needless defensive copying (Item 50). Similarly, using inheritance
  in a public class where composition would have been appropriate ties the class forever to its superclass, which can place
  artificial limits on the performance of the subclass (Item 18). As a final example, using an implementation type
  rather than an interface in an API ties you to a specific implementation, even though faster implementations may be
  written in the future (Item 64)
* Once you’ve carefully designed your program and produced a clear, concise, and well-structured implementation, then
  it may be time to consider optimization,  assuming you’re not already satisfied with the performance of the program.
* Common wisdom says that programs spend 90 percent of their time in 10 percent of their code.
* Profiling tools can help you decide where to focus your optimization efforts.
* The more code in the system, the more important it is to use a profiler.
  It’s like looking for a needle in a haystack: the bigger the haystack, the more useful
  it is to have a metal detector. Another tool that deserves special mention is jmh,
  which is not a profiler but a microbenchmarking framework that provides
  unparalleled visibility into the detailed performance of Java code [JMH].

Item 68 - Adhere to general accepted naming conventions <br>
* Loosely speaking, naming conventions fall into two categories: typographical and grammatical.
* Package and module names should be hierarchical with the components separated by periods. Components should consist
  of lowercase alphabetic characters and, rarely, digits. The name of any package that will be used outside
  your organization should begin with your organization’s Internet domain name with the components reversed, for example,
  edu.cmu, com.google, org.eff. The standard libraries and optional packages, whose names begin with java and
  javax, are exceptions to this rule. Users must not create packages or modules whose names begin with java or javax
* The remainder of a package name should consist of one or more components describing the package. Components should
  be short, generally eight or fewer characters. Meaningful abbreviations are encouraged, for example, util rather
  than utilities. Acronyms are acceptable, for example, awt. Components should generally consist of a single word or
  abbreviation.
* Input parameters are a special kind of local variable. They should be  named much more carefully than ordinary local
  variables, as their names are an integral part of their method’s documentation.
* Type parameter names usually consist of a single letter. Most commonly it is one of these five: T for an arbitrary
  type, E for the element type of a collection, K and V for the key and value types of a map, and X for an exception.
  The return type of a function is usually R. A sequence of arbitrary types can be T, U, V or T1, T2, T3.

## Chapter 10 - Exceptions
Item 69 - Use exceptions only for exceptional conditions <br>
* Because exceptions are designed for exceptional circumstances, there is little incentive for JVM implementors to
  make them as fast as explicit tests.
* The moral of this story is simple: Exceptions are, as their name implies, to be used only for exceptional conditions;
  they should never be used for ordinary control flow.

Item 70 - Use checked exceptions for recoverable conditions and runtime exceptions for programming errors <br>
* The cardinal rule in deciding whether to use a checked or an unchecked exception is this: use checked exceptions for
  conditions from which the caller can reasonably be expected to recover. By throwing a checked exception, you
  force the caller to handle the exception in a catch clause or to propagate it outward. Each checked exception that a
  method is declared to throw is therefore a potent indication to the API user that the associated condition is a possible
  outcome of invoking the method.
* There are two kinds of unchecked throwables: runtime exceptions and errors.
  They are identical in their behavior: both are throwables that needn’t, and generally shouldn’t, be caught. If a program
  throws an unchecked exception or an error, it is generally the case that recovery is impossible and continued execution
  would do more harm than good. If a program does not catch such a throwable, it will cause the current thread to halt
  with an appropriate error message.
* Use runtime exceptions to indicate programming errors. The great majority of runtime exceptions indicate precondition
  violations. A precondition violation is simply a failure by the client of an API to adhere to the contract established
  by the API specification. For example, the contract for array access specifies that the array index must be between zero
  and the array length minus one, inclusive. ArrayIndexOutOfBoundsException indicates that this precondition was violated.
* While the Java Language Specification does not require it, there is a strong convention that errors are reserved for
  use by the JVM to indicate resource deficiencies, invariant failures, or other conditions that make it impossible to
  continue execution. Given the almost universal acceptance of this convention, it’s best not to implement any new Error
  subclasses. Therefore, all of the unchecked throwables you implement should subclass RuntimeException (directly or
  indirectly). Not only shouldn’t you define Error subclasses, but with the exception of AssertionError, you shouldn’t
  throw them either.
* Because checked exceptions generally indicate recoverable conditions, it’s especially important for them to provide
  methods that furnish information to help the caller recover from the exceptional condition. For example, suppose a checked
  exception is thrown when an attempt to make a purchase with a gift card fails due to insufficient funds. The exception
  should provide an accessor method to query the amount of the shortfall. This will enable the caller to relay the amount
  to the shopper.
*  To summarize, throw checked exceptions for recoverable conditions and unchecked exceptions for programming errors.
   When in doubt, throw unchecked exceptions. Don’t define any throwables that are neither checked exceptions nor
   runtime exceptions. Provide methods on your checked exceptions to aid in recovery.

Item 71 - Avoid unnecessary use of checked exceptions <br>
* In summary, when used sparingly, checked exceptions can increase the reliability of programs; when overused, they
  make APIs painful to use. If callers won’t be able to recover from failures, throw unchecked exceptions. If recovery
  may be possible and you want to force callers to handle exceptional conditions, first consider returning an optional.
  Only if this would provide insufficient information in the case of failure should you throw a checked exception.

Item 72 - Favor the use of standard exceptions <br>
* The most commonly reused exception type is IllegalArgumentException (Item 49). This is generally the exception to
  throw when the caller passes in an argument whose value is inappropriate. For example, this would be the exception
  to throw if the caller passed a negative number in a parameter representing the number of times some action was to
  be repeated
* If a caller passes null in some parameter for which null values are prohibited, convention dictates that
  NullPointerException be thrown rather than IllegalArgumentException. Similarly, if a caller passes an out-of-range value in
  a parameter representing an index into a sequence, IndexOutOfBoundsException should be thrown rather than
  IllegalArgumentException.
* Do not reuse Exception, RuntimeException, Throwable, or Error directly.
  Treat these classes as if they were abstract. You can't reliably test for these exceptions because they are superclasses
  of other exceptions that a method may throw.

Item 73 - Throw exceptions appropriate to the abstraction <br>
* To avoid this problem, higher layers should catch lower-level exceptions and, in their place, throw exceptions that
  can be explained in terms of the higher-level abstraction.
*  If it is impossible to prevent exceptions from lower layers, the next best thing is to have the higher layer silently
   work around these exceptions, insulating the caller of the higher-level method from lower-level problems. Under these
   circumstances, it may be appropriate to log the exception using some appropriate logging facility such as
   java.util.logging. This allows programmers to investigate the problem, while insulating client code and the users from it.
*  In summary, if it isn’t feasible to prevent or to handle exceptions from lower layers, use exception translation,
   unless the lower-level method happens to guarantee that all of its exceptions are appropriate to the higher level. Chaining
   provides the best of both worlds: it allows you to throw an appropriate higher-level
   exception, while capturing the underlying cause for failure analysis (Item 75).

Item 74 - Document all exceptions thrown by each method <br>
* Always declare checked exceptions individually, and document precisely the conditions under which each one is thrown
  using the Javadoc @throws tag.
  Don’t take the shortcut of declaring that a method throws some superclass of multiple exception classes that it can
  throw. As an extreme example, don’t declare that a public method throws Exception or, worse, throws Throwable.
* While the language does not require programmers to declare the unchecked exceptions that a method is capable of
  throwing, it is wise to document them as carefully as the checked exceptions. Unchecked exceptions generally represent
  programming errors (Item 70), and familiarizing programmers with all of the errors they can make helps them avoid
  making these errors.
  A well-documented list of the unchecked exceptions that a method can throw effectively describes the
  preconditions for its successful execution.
* It should be noted that documenting all of the unchecked exceptions that each
  method can throw is an ideal, not always achievable in the real world.
* It is particularly important that methods in interfaces document the unchecked
  exceptions they may throw. This documentation forms a part of the interface’s
  general contract and enables common behavior among multiple implementations
  of the interface.

Item 75 - Include failure-capture information in detail messages <br>
*  One caveat concerns security-sensitive information. Because stack traces may be seen by many people in the process
   of diagnosing and fixing software issues, do not include passwords, encryption keys, and the like in detail messages.

Item 76 - Strive for failure atomicity <br>
* After an object throws an exception, it is generally desirable that the object still be in
  a well-defined, usable state, even if the failure occurred in the midst of performing
  an operation. This is especially true for checked exceptions, from which the caller is
  expected to recover. Generally speaking, a failed method invocation should leave
  the object in the state that it was in prior to the invocation. A method with this
  property is said to be failure-atomic.
* There are several ways to achieve this effect. The simplest is to design
  immutable objects (Item 17). If an object is immutable, failure atomicity is free. If
  an operation fails, it may prevent a new object from getting created, but it will
  never leave an existing object in an inconsistent state, because the state of each
  object is consistent when it is created and can’t be modified thereafter
* For methods that operate on mutable objects, the most common way to
  achieve failure atomicity is to check parameters for validity before performing the
  operation (Item 49). This causes most exceptions to get thrown before object
  modification commences.
*  A closely related approach to achieving failure atomicity is to order the computation so that any part that may fail
   takes place before any part that modifies the object.
* In summary, as a rule, any generated exception that is part of a method’s specification should leave the object in
  the same state it was in prior to the method invocation. Where this rule is violated, the API documentation should clearly
  indicate what state the object will be left in. Unfortunately, plenty of existing API documentation fails to live
  up to this ideal.

Item 77 - Don't ignore exceptions <br>
*  An empty catch block defeats the purpose of exceptions, which is to force you to handle exceptional conditions.
   Ignoring an exception is analogous to ignoring a fire alarm—and turning it off so no one else gets a chance to see if
   there’s a real fire.
   Whenever you see an empty catch block, alarm bells should go off in your head.
*  If you choose to ignore an exception, the catch block should contain a comment explaining why it is appropriate to
   do so, and the variable should be named ignored:

## Chapter 11 - Concurrency
Item 78 - Synchronize access to shared mutable data <br>
* The synchronized keyword ensures that only a single thread can execute a method or block at one time.
* This view is correct, but it’s only half the story. Without synchronization, one thread’s changes might not be
  visible to other threads. Not only does synchronization prevent threads from observing an object in an inconsistent
  state, but it ensures that each thread entering a synchronized method or block sees the effects
  of all previous modifications that were guarded by the same lock.
* Synchronization is required for reliable communication between threads as well as for mutual exclusion. This is due to
  a part of the language specification known as the memory model, which specifies when and how changes made by one
  thread become visible to others
* The libraries provide the Thread.stop method, but this method was deprecated long ago because it is inherently
  unsafe—its use can result in data corruption. Do not use Thread.stop.
* Note that both the write method (requestStop) and the read method (stopRequested) are synchronized. It is not
  sufficient to synchronize only the write method! Synchronization is not guaranteed to work unless both read and
  write operations are synchronized. Occasionally a program that synchronizes only writes (or reads) may appear to
  work on some machines, but in this case, appearances are deceiving
* The actions of the synchronized methods in StopThread would be atomic even without synchronization. In other
  words, the synchronization on these methods is used solely for its communication effects, not for mutual exclusion.
  While the cost of synchronizing on each iteration of the loop is small, there is a correct alternative that is
  less verbose and whose performance is likely to be better.
  The locking in the second version of StopThread can be omitted if stopRequested is declared volatile.
  While the volatile modifier performs no mutual exclusion, it guarantees that any thread that reads the field will
  see the most recently written value.
* The best way to avoid the problems discussed in this item is not to share mutable data.
  Either share immutable data (Item 17) or don’t share at all.
  In other words, confine mutable data to a single thread. If you adopt this policy, it is important to document it
  so that the policy is maintained as your program evolves.
  It is also important to have a deep understanding of the frameworks and libraries you’re using because they may
  introduce threads that you are unaware of.
* In summary, when multiple threads share mutable data, each thread that reads or writes the data must perform
  synchronization. In the absence of synchronization, there is no guarantee that one thread’s changes will be visible
  to another thread. The penalties for failing to synchronize shared mutable data are liveness and safety failures.
  These failures are among the most difficult to debug.
  They can be intermittent and timing-dependent, and program behavior can vary radically from one VM to another.
  If you need only inter-thread communication, and not mutual exclusion, the volatile modifier is an acceptable form
  of synchronization, but it can be tricky to use correctly

Item 79 - Avoid excessive synchronization <br>
* Item 78 warns of the dangers of insufficient synchronization. This item concerns the opposite problem. Depending on
  the situation, excessive synchronization can cause reduced performance, deadlock, or even nondeterministic behavior
* To avoid liveness and safety failures, never cede control to the client within a synchronized method or block.
  In other words, inside a synchronized region, do not invoke a method that is designed to be overridden, or one provided
  by a client in the form of a function object (Item 24).
  From the perspective of the class with the synchronized region, such methods are alien.
  The class has no knowledge of what the method does and has no control over it. Depending on
  what an alien method does, calling it from a synchronized region can cause exceptions, deadlocks, or data corruption
* An alien method might run for an arbitrarily long period. If
  the alien method were invoked from a synchronized region, other threads would be denied access to the protected
  resource unnecessarily.
* As a rule, you should do as little work as possible inside synchronized regions. Obtain the lock, examine the shared
  data, transform it as necessary, and drop the lock. If you must perform some time-consuming activity, find a way to
  move it out of the synchronized region without violating the guidelines in Item 78.
* The first part of this item was about correctness.
  Now let’s take a brief look at performance. While the cost of synchronization has plummeted since the early
  days of Java, it is more important than ever not to oversynchronize
* If a method modifies a static field and there is any possibility that the method will be called from multiple threads,
  you must synchronize access to the field internally (unless the class can tolerate nondeterministic behavior). It is not
  possible for a multithreaded client to perform external synchronization on such a method, because unrelated clients
  can invoke the method without synchronization.
  The field is essentially a global variable even if it is private because it can be read and modified by unrelated
  clients.
* In summary, to avoid deadlock and data corruption, never call an alien method from within a synchronized region.
  More generally, keep the amount of work that you do from within synchronized regions to a minimum.
  When you are designing a mutable class, think about whether it should do its own synchronization. In the
  multicore era, it is more important than ever not to over synchronize. Synchronize your class internally only if
  there is a good reason to do so, and document your decision clearly (Item 82).

Item 80 - Prefer executors , tasks and streams to threads <br>
* You can do many more things with an executor service. For example, you can wait for a particular task to complete
  (with the get method, as shown in Item 79, page 319), you can wait for any or all of a collection of tasks to complete
  (using the invokeAny or invokeAll methods), you can wait for the executor service to terminate (using the
  awaitTermination method), you can retrieve the results of tasks one by one as they complete (using an
  ExecutorCompletionService), you can schedule tasks to run at a particular time or to run periodically (using a
  ScheduledThreadPoolExecutor), and so on
* you should generally refrain from working directly with threads. When you work directly with threads, a Thread serves
  as both a unit of work and the mechanism for executing it. In the executor framework, the unit of work and the execution
  mechanism are separate. The key abstraction is the unit of work, which is the task.
  There are two kinds of tasks: Runnable and its close cousin, Callable (which is like Runnable, except that it returns
  a value and can throw arbitrary exceptions).
* The general mechanism for executing tasks is the executor service. If you think in terms of tasks and let an executor
  service execute them for you, you gain the flexibility to select an appropriate execution policy to meet your needs and to
  change the policy if your needs change. In essence, the Executor Framework does for execution what the Collections
  Framework did for aggregation.
* In Java 7, the Executor Framework was extended to support fork-join tasks, which are run by a special kind of
  executor service known as a fork-join pool. A fork-join task, represented by a ForkJoinTask instance, may be split up into
  smaller subtasks, and the threads comprising a ForkJoinPool not only process these tasks but “steal” tasks from one
  another to ensure that all threads remain busy, resulting in higher CPU utilization, higher throughput, and lower latency.
  Writing and tuning fork-join tasks is tricky. Parallel streams (Item 48) are written atop fork join pools and allow
  you to take advantage of their performance benefits with little effort, assuming they are appropriate for the task at hand

Item 81 - Prefer concurrency utilities to wait and notify <br>
* Given the difficulty of using wait and notify correctly, you should use the higher-level concurrency utilities instead.
* The higher-level utilities in java.util.concurrent fall into three categories: the Executor Framework, which was
  covered briefly in Item 80; concurrent collections; and synchronizers. Concurrent collections and synchronizers are
  covered briefly in this item
* Besides offering excellent concurrency, ConcurrentHashMap is very fast.
  Concurrent collections make synchronized collections largely obsolete.
  For example, use ConcurrentHashMap in preference to Collections.synchronizedMap. Simply replacing synchronized maps
  with concurrent maps can dramatically increase the performance of concurrent applications
* Synchronizers are objects that enable threads to wait for one another, allowing them to coordinate their activities.
  The most commonly used synchronizers are CountDownLatch and Semaphore. Less commonly used are CyclicBarrier and
  Exchanger. The most powerful synchronizer is Phaser
*  In summary, using wait and notify directly is like programming in “concurrency assembly language,” as compared to
   the higher-level language provided by java.util.concurrent. There is seldom, if ever, a reason to use wait and
   notify in new code. If you maintain code that uses wait and notify, make sure that it always invokes "wait" from
   within a "while loop" using the standard idiom.
   The notifyAll method should generally be used in preference to "notify". If "notify" is used, great care must be
   taken to ensure liveness.

Item 82 - Document thread safety <br>
*  You may hear it said that you can tell if a method is thread-safe by looking for the "synchronized" modifier in
   its documentation. This is wrong on several counts.
   The presence of the synchronized modifier in a method declaration is an implementation detail, not a part of its API.
   It does not reliably indicate that a method is thread-safe.
* Moreover, the claim that the presence of the synchronized modifier is sufficient to document thread safety embodies
  the misconception that thread safety is an all-or-nothing property. In fact, there are several levels of thread safety.
  To enable safe concurrent use, a class must clearly document what level of thread safety it supports. The following
  list summarizes levels of thread safety.
  It is not exhaustive but covers the common cases:
* * Immutable — Instances of this class appear constant. No external synchronization is necessary. Examples include
  String, Long, and BigInteger (Item 17).
* * Unconditionally thread-safe — Instances of this class are mutable, but the class has sufficient internal
  synchronization that its instances can be used concurrently without the need for any external synchronization.
  Examples include AtomicLong and ConcurrentHashMap.
* * Conditionally thread-safe — Like unconditionally thread-safe, except that some methods require external
  synchronization for safe concurrent use. Examples include the collections returned by the Collections.synchronized
  wrappers, whose iterators require external synchronization.
* * Not thread-safe — Instances of this class are mutable. To use them concurrently, clients must surround each method
  invocation (or invocation sequence) with external synchronization of the clients’ choosing. Examples include the
  general-purpose collection implementations, such as ArrayList and HashMap.
* * Thread-hostile — This class is unsafe for concurrent use even if every method invocation is surrounded by external
  synchronization. Thread hostility usually results from modifying static data without synchronization. No one
  writes a thread-hostile class on purpose; such classes typically result from the failure to consider
  concurrency. When a class or method is found to be thread-hostile, it is typically fixed or deprecated. The
  generateSerialNumber method in Item 78 would be thread-hostile in the absence of internal synchronization

Item 83 - Use lazy initialization judiciously <br>
* Lazy initialization is the act of delaying the initialization of a field until its value is
  needed. If the value is never needed, the field is never initialized. This technique is
  applicable to both static and instance fields. While lazy initialization is primarily
  an optimization, it can also be used to break harmful circularities in class and instance initialization
* As is the case for most optimizations, the best advice for lazy initialization is “don’t do it unless you need to”
  (Item 67). Lazy initialization is a double-edged sword. It decreases the cost of initializing a class or creating an
  instance, at the expense of increasing the cost of accessing the lazily initialized field.
* That said, lazy initialization has its uses. If a field is accessed only on a fraction of the instances of a class
  and it is costly to initialize the field, then lazy initialization may be worthwhile. The only way to know for sure
  is to measure the performance of the class with and without lazy initialization.
* Under most circumstances, normal initialization is preferable to lazy initialization.
* In the presence of multiple threads, lazy initialization is tricky. If two or more threads share a lazily initialized
  field, it is critical that some form of synchronization be employed, or severe bugs can result (Item 78).
* If you need to use lazy initialization for performance on an instance field, use the double-check idiom. This idiom
  avoids the cost of locking when accessing the field after initialization (Item 79). The idea behind the idiom is to
  check the value of the field twice (hence the name double-check): once without locking and then, if the field
  appears to be uninitialized, a second time with locking. Only if the second check indicates that the field is
  uninitialized does the call initialize the field. Because there is no locking once the field is initialized, it is
  critical that the field be declared volatile (Item 78).
* In summary, you should initialize most fields normally, not lazily. If you must initialize a field lazily in order
  to achieve your performance goals or to break a harmful initialization circularity, then use the appropriate lazy
  initialization technique. For instance fields, it is the double-check idiom; for static fields, the
  lazy initialization holder class idiom. For instance fields that can tolerate repeated initialization, you may also
  consider the single-check idiom.

Item 84 - Don't depend on the thread scheduler <br>
* Any program that relies on the thread scheduler for correctness or performance is likely to be nonportable.
* Threads should not busy-wait, repeatedly checking a shared object waiting for its state to change
  (see code example in SlowCountdownLatch)
* In summary, do not depend on the thread scheduler for the correctness of your program. The resulting program will be
  neither robust nor portable. As a corollary, do not rely on Thread.yield or thread priorities. These facilities are
  merely hints to the scheduler. Thread priorities may be used sparingly to improve the quality of
  service of an already working program, but they should never be used to “fix” a program that barely works.

## Chapter 12 - Serialization
Item 85 - Prefer alternatives to Java Serialization <br>
*  Object graphs are deserialized by invoking the readObject method on an ObjectInputStream. This method is essentially a
   magic constructor that can be made to instantiate objects of almost any type on the class path, so long as the type
   implements the Serializable interface. In the process of deserializing a byte stream, this method can execute code
   from any of these types, so the code for all of these types is part of the attack surface.
*  Java deserialization is a clear and present danger as it is widely used both directly by applications and indirectly
   by Java subsystems such as RMI (Remote Method Invocation), JMX (Java Management Extension), and
   JMS (Java Messaging System). Deserialization of untrusted streams can result in remote code execution (RCE),
   denial-of-service (DoS), and a range of other exploits. Applications can be vulnerable to these attacks even if they
   did nothing wrong
* Attackers and security researchers study the serializable types in the Java libraries and in commonly used third-party
  libraries, looking for methods invoked during deserialization that perform potentially dangerous activities. Such methods
  are known as gadgets. Multiple gadgets can be used in concert, to form a gadget chain. From time to time, a gadget
  chain is discovered that is sufficiently powerful to allow an attacker to execute arbitrary native code on the
  underlying hardware, given only the opportunity to submit a carefully crafted byte stream for deserialization.
* So what can you do defend against these problems? You open yourself up to attack whenever you deserialize a byte
  stream that you don’t trust. The best way to avoid serialization exploits is never to deserialize anything. In the
  words of the computer named Joshua in the 1983 movie WarGames, “the only winning move is not to play.” There is no
  reason to use Java serialization in any new system you write
* If you can’t avoid Java serialization entirely, perhaps because you’re working in the context of a legacy system
  that requires it, your next best alternative is to never deserialize untrusted data. In particular, you should never
  accept RMI traffic from untrusted sources. The official secure coding guidelines for Java say
  “Deserialization of untrusted data is inherently dangerous and should be avoided.”
  This sentence is set in large, bold, italic, red type, and it is the only text in the entire document that gets this
  treatment.
* If you can’t avoid serialization and you aren’t absolutely certain of the safety of the data you’re deserializing,
  use the object deserialization filtering added in Java 9 and backported to earlier releases (java.io.ObjectInputFilter).
  This facility lets you specify a filter that is applied to data streams before they’re deserialized. It operates at
  the class granularity, letting you accept or reject certain classes. Accepting classes by default and rejecting a
  list of potentially dangerous  ones is known as blacklisting; rejecting classes by default and accepting a list of
  those that are presumed safe is known as whitelisting. Prefer whitelisting to blacklisting, as blacklisting only
  protects you against known threats.
*  The filtering facility will also protect you against excessive memory usage, and excessively deep object graphs,
   but it will not protect you against serialization bombs like the one shown above.

Item 86 - Implement Serializable with great caution <br>
*  A major cost of implementing Serializable is that it decreases the flexibility to change a class’s implementation once
   it has been released. When a class implements Serializable, its byte-stream encoding (or serialized form)
   becomes part of its exported API. Once you distribute a class widely, you are generally required to support the
   serialized form forever, just as you are required to support all other parts of the exported API.
* If you opt to make a class serializable, you should carefully design a high-quality serialized form that
  you’re willing to live with for the long haul (Items 87, 90).
* A second cost of implementing Serializable is that it increases the likelihood of bugs and security holes (Item 85).
  Relying on the default deserialization mechanism can easily leave objects open to invariant corruption and illegal
  access (Item 88).
* A third cost of implementing Serializable is that it increases the testing burden associated with releasing a new
  version of a class.
* To summarize, the ease of implementing Serializable is specious. Unless a class is to be used only in a protected
  environment where versions will never have to interoperate and servers will never be exposed to untrusted data,
  implementing Serializable is a serious commitment that should be made with great care. Extra
  caution is warranted if a class permits inheritance.

Item 87 - Consider using a custom serialized form <br>
* Using the default serialized form when an object’s physical representation differs substantially from its logical
  data content has four disadvantages:
* * It permanently ties the exported API to the current internal representation. In the above example, the private
  StringList.Entry class becomes part of the public API. If the representation is changed in a future release, the
  StringList class will still need to accept the linked list representation on input and generate it on output.
  The class will never be rid of all the code dealing with linked list entries, even if it doesn’t use them anymore.
* * It can consume excessive space. In the above example, the serialized form  unnecessarily represents each entry in
  the linked list and all the links. These entries and links are mere implementation details, not worthy of
  inclusion in the serialized form. Because the serialized form is excessively large, writing it
  to disk or sending it across the network will be excessively slow.
* * It can consume excessive time. The serialization logic has no knowledge of the topology of the object graph,
  so it must go through an expensive graph traversal. In the example above, it would be sufficient simply to
  follow the next references.
* * It can cause stack overflows. The default serialization procedure performs a recursive traversal of the object
  graph, which can cause stack overflows even for moderately sized object graphs. Serializing a StringList
  instance with 1,000–1,800 elements generates a StackOverflowError on my machine.
  Surprisingly, the minimum list size for which serialization causes a stack
  overflow varies from run to run (on my machine). The minimum list size that
  exhibits this problem may depend on the platform implementation and
  command-line flags; some implementations may not have this problem at all.
* Regardless of what serialized form you choose, declare an explicit serial version UID in every serializable class
  you write. This eliminates the serial version UID as a potential source of incompatibility (Item 86). There is also a
  small performance benefit. If no serial version UID is provided, an expensive computation is performed to generate
  one at runtime.
* To summarize, if you have decided that a class should be serializable (Item 86), think hard about what the serialized
  form should be. Use the default serialized form only if it is a reasonable description of the logical state of the
  object; otherwise design a custom serialized form that aptly describes the object. You should allocate as much time
  to designing the serialized form of a class as you allocate to designing an exported method (Item 51). Just as you can’t
  eliminate exported methods from future versions, you can’t eliminate fields from the serialized form; they must be
  preserved forever to ensure serialization compatibility. Choosing the wrong serialized form can have a permanent, negative
  impact on the complexity and performance of a class.

Item 88 - Write readObject methods defensively <br>
* The problem is that the readObject method is effectively another public constructor, and it demands all of the same
  care as any other constructor. Just as a constructor must check its arguments for validity (Item 49) and make defensive
  copies of parameters where appropriate (Item 50), so must a readObject method.
  If a readObject method fails to do either of these things, it is a relatively simple matter for an attacker to violate
  the class’s invariants
*  The source of the problem is that Period’s readObject method is not doing enough defensive copying. When an object
   is deserialized, it is critical to defensively copy any field containing an object reference that a client must
   not possess. Therefore, every serializable immutable class containing private mutable components must defensively
   copy these components in its readObject method. The following readObject method suffices to ensure Period’s invariants
   and to maintain its immutability
* To summarize, anytime you write a readObject method, adopt the mind-set that you are writing a public constructor
  that must produce a valid instance regardless of what byte stream it is given. Do not assume that the byte stream
  represents an actual serialized instance. While the examples in this item concern a class that
  uses the default serialized form, all of the issues that were raised apply equally to classes with custom serialized
  forms. Here, in summary form, are the guidelines for writing a readObject method:
* * For classes with object reference fields that must remain private, defensively copy each object in such a
  field. Mutable components of immutable classes fall into this category.
* * Check any invariants and throw an InvalidObjectException if a check fails. The checks should follow any defensive copying.
* *  If an entire object graph must be validated after it is deserialized, use the ObjectInputValidation interface
  (not discussed in this book).
* * Do not invoke any overridable methods in the class, directly or indirectly.

Item 89 - For instance control, prefer enum types to readResolve <br>
* This method ignores the deserialized object, returning the distinguished Elvis instance that was created when the
  class was initialized. Therefore, the serialized form of an Elvis instance need not contain any real data; all
  instance fields should be declared transient. In fact, if you depend on readResolve for instance control, all
  instance fields with object reference types must be declared transient. Otherwise, it is possible for a determined
  attacker to secure a reference to the deserialized object before its readResolve method is run, using a
  technique that is somewhat similar to the MutablePeriod attack in Item 88.
* (BOOK Explains how such an attack would be performed)
*  To summarize, use enum types to enforce instance control invariants wherever possible. If this is not possible and you
   need a class to be both serializable and instance-controlled, you must provide a readResolve method and ensure that all
   of the class’s instance fields are either primitive or transient.

Item 90 - Consider serialization proxies instead of serialized instances <br>
* As mentioned in Items 85 and 86 and discussed throughout this chapter, the decision to implement Serializable increases
  the likelihood of bugs and security problems as it allows instances to be created using an extralinguistic mechanism
  in place of ordinary constructors. There is, however, a technique that greatly reduces these risks.
  This technique is known as the serialization proxy pattern.
*  Like the defensive copying approach (page 357), the serialization proxy approach stops the bogus byte-stream
   attack (page 354) and the internal field theft attack (page 356) dead in their tracks. Unlike the two previous
   approaches, this one allows the fields of Period to be final, which is required in order for the
   Period class to be truly immutable (Item 17).
*  In summary, consider the serialization proxy pattern whenever you find yourself having to write a readObject or
   writeObject method on a class that is not extendable by its clients. This pattern is perhaps the easiest way to robustly
   serialize objects with nontrivial invariants.




