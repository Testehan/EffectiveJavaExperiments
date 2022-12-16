# EffectiveJavaExperiments

## Chapter 2 - Creating and destroying objects
Item 1 - consider static factory methods instead of constructors.<br>
Item 2 - Consider a builder when faced with many constructor parameters.<br> 
Item 3 - Enforce the singleton property with a private constructor or an enum type <br>
Item 4 - Enforce non instantiability with a private constructor <br>
Item 5 - Prefer dependency injection to hardwiring resources <br>
Item 6 - Avoid creating unnecessary objects (when you can reuse existing ones) <br>
Item 7 - Eliminate obsolete object references <br>
Item 8 - Avoid finalizers and cleaners <br>
Item 9 - Prefer try-with-resources to try-finally <br>

## Chapter 3 - Methods common to all objects
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
