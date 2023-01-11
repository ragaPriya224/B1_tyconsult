Q ) What do you mean by Constructor?

Answer: Constructor can be explained in detail with enlisted points:

When a new object is created in a program a constructor gets invoked corresponding to the class.
The constructor is a method which has the same name as the class name.
If a user doesn’t create a constructor implicitly a default constructor will be created.
The constructor can be overloaded.
If the user created a constructor with a parameter then he should create another constructor explicitly without a parameter.


Q 2)What are the OOPs concepts?

Answer: OOPs concepts include:

Inheritance
Encapsulation
Polymorphism
Abstraction
Interface

Q #3) What is method overloading?

Answer: When two or more methods with the same name have either a different number of parameters or different types of parameters, these methods may have or may not have different return types, then they are overloaded methods, and the feature is method overloading. Method overloading is also called compile-time polymorphism.

Q #4) What is method overriding?

Answer: When a method of sub class (derived, child class) has the same name, parameters (signature), and same return type as the method in its super class (base, parent class) then the method in the subclass is said to be overridden the method in the superclass. This feature is also known as runtime polymorphism.

Q #5) When the finalize method is used?

Answer: finalize method is called just before the object is about to be garbage collected. This method overrides to minimize memory leaks, undertake cleanup activities by removing system resources.

Q #6)  Difference in Set and List interface?   

Set and List both are child interface of Collection interface. There are following two main differences between them

List can hold duplicate values but Set doesn’t allow this.
In List interface data is present in the order you inserted but in the case of Set insertion order is not preserved.


Q #7) How many types of constructors can be used in Java? Please explain.

Answer: There are basically three types of constructors in Java.

These are: 

Default constructor: This constructor is without any parameter and invokes every time you create an instance of a class (object). If a class is an Employee, then the syntax of the default constructor will be Employee().
No-arg constructor: As the name implies, a constructor without any argument is called a no-arg constructor.
Parameterized constructor: Constructor with a number of parameters is called a parameterized constructor. You are required to provide arguments, i.e. initial values with respect to the data type of parameters in that constructor.

Q #8)What is the difference between ‘throw’ and ‘throws’ in Java Exception Handling?

Following are the differences between two:

throw keyword is used to throw Exception from any method or static block whereas throws is used to indicate that which Exception can possibly be thrown by this method
If any method throws checked Exception, then caller can either handle this exception(using try catch block )or can re throw it by declaring another ‘throws’ clause in method declaration.
throw clause can be used in any part of code where you feel a specific exception needs to be thrown to the calling method
E.g. throw throw new Exception(“You have some exception”) throw new IOException(“Connection failed!!”) throws throws IOException, NullPointerException, ArithmeticException
