package Exceptions;

public class AgeCheck {
    public AgeCheck(int _age) throws  UnderAgeException{
        if(_age< 18){
            throw  new UnderAgeException("You are underage");
        }
        else {
            System.out.println("You are eligible to vote");
        }
    }
}
