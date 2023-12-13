package Polymorphism;

public class Calculate {
    // Initialize a function add that takes two integer parameter and returns integer
    public void add(int _a, int _b){
    System.out.println(_a + _b);
    }

    //Reuse the same add function this time taking in two double parameters and returning the sum of those doubles.
    //This is called FUNCTION OVERLOADING
    public void add(double _a, double _b){
        System.out.println(_a + _b);
    }
}
