//The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors 
//In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.
//mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

//What is the difference between checked and unchecked exceptions?
//What happens behind the code int data=50/0;?
//Why use multiple catch block?
//Is there any possibility when the finally block is not executed?
//What is exception propagation?
//What is the difference between the throw and throws keyword?
//What are the 4 rules for using exception handling with method overriding?


//The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by two subclasses: Exception and Error.


//exception keywords:


//1. TRY :
//The "try" keyword is used to specify a block where we should place an exception code
//The try block must be followed by either catch or finally.

//2. CATCH:
//The "catch" block is used to handle the exception. 
//It must be preceded by try block which means we can't use catch block alone.
//It can be followed by finally block later.

//3. FINALLY:
//The "finally" block is used to execute the necessary code of the program
//It is executed whether an exception is handled or not.

//4. THROW:
//The "throw" keyword is used to throw an exception.

//5. THROWS:
//The "throws" keyword is used to declare exceptions.
//It specifies that there may occur an exception in the method.
//It doesn't throw an exception. It is always used with method signature.

//TRY CATCH BLOCK:
//Java try block is used to enclose the code that might throw an exception. It must be used within the method.
//If an exception occurs at the particular statement in the try block, the rest of the block code will not execute.
// So, it is recommended not to keep the code in try block that will not throw an exception.
//Java catch block is used to handle the Exception by declaring the type of exception within the parameter.
//The declared exception must be the parent class exception ( i.e., Exception) or the generated exception type.
// However, the good approach is to declare the generated type of exception.
//The JVM firstly checks whether the exception is handled or not. If exception is not handled,
// JVM provides a default exception handler that performs the following tasks:
//Prints out exception description.
//Prints the stack trace (Hierarchy of methods where the exception occurred).
//Causes the program to terminate.


//MULTI CATCH BLOCK:
//At a time only one exception occurs and at a time only one catch block is executed.
//All catch blocks must be ordered from most specific to most general, 
//i.e. catch for ArithmeticException must come before catch for Exception.
//if we do notinvoke the correct exception type then parent exception will be invoked if present


//NESTED TRY:
//In Java, using a try block inside another try block is permitted. It is called as nested try block.
//Every statement that we enter a statement in try block, context of that exception is pushed onto the stack.
//Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error. 
//In such cases, exception handlers have to be nested.
//When any try block does not have a catch block for a particular exception, then the catch block of the outer (parent) try block are checked for that exception,
//and if it matches, the catch block of outer try block is executed.
//If none of the catch block specified in the code is unable to handle the exception,
// then the Java runtime system will handle the exception. 
//Then it displays the system generated message for that exception.


//FINALLY BLOCK:
//Java finally block is a block used to execute important code such as closing the connection, etc.
//Java finally block is always executed whether an exception is handled or not. 
//finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.


//THROW:
//The Java throw keyword is used to throw an exception explicitly.
//We specify the exception object which is to be thrown.
//The Exception has some message with it that provides the error description. These exceptions may be related to user inputs, server, etc.
//We can throw either checked or unchecked exceptions in Java by throw keyword.
//It is mainly used to throw a custom exception.
//syntax : throw new exception_class("error message");  
