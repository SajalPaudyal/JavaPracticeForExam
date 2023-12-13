package Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Sajal");
        names.add("Arjun");
        names.add("Sarita");
        names.add("Pooja");
        names.add("Deepak");
        names.add("Kamala");
        names.add("Poojana");
        names.add("Pita Ji");

        Stream<String> nameStream = names.stream();

        Stream<String> filteredName = nameStream.filter(name -> name.startsWith("P"));
        long count = filteredName.count();
        System.out.println("There are: "+count +" names starting with P" );
    }
}