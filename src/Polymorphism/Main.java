package Polymorphism;

public class Main {
    //There are two types of polymorphism, compile time polymorphism and run-time polymorphism. The implemented calculator class is compile time polymorphism
    public static void main(String[] args){
        Calculate calculator= new Calculate();
        calculator.add(1,5);
        calculator.add(4.5, 3.2);

        //  The runtime polymorphism is checked during the runtime of the program checking weather it is called or not

        Animal a = new Animal();
        a.makeSound();

        Cat c = new Cat();
        c.makeSound();

        Dog d  = new Dog();
        d.makeSound();

    }
}
