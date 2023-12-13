package Abstraction;

public interface Person {
    void getName();
    void getAge();
}

// Notes on Encapsulation
/* Encapsulation is the process of giving access to only the required methods and parameters by hiding other functionalities from the users
* there are 4 keywords used in encapsulation
* 1. Private -> the scope of private is within the class, something declared private can only be used within the class and cannot be accessed from anywhere
* 2. Protected -> Protected variables,methods or parameters can be used within the same class and can also be implemented in child class, only when the super class is inherited and the protected functions are accessed from child class
* 3. Default -> Default are those parameters who do not have any specifiers and can be used within the class and in the same package.
* 4. Public -> Public parameters can be accessed from everywhere, may it be from the same class, different class of the same package, or from a class that is in the different package.
*  */
