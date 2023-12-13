package Exceptions;

public class Main {
    public static void main(String[] args){
      try{
          AgeCheck ac = new AgeCheck(16);
      }
      catch (UnderAgeException ex){
          System.out.println("Exception caught");
          System.out.println(ex.getMessage());
      }


    }
}
