package string_methods_examples;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //String with constructor vs string literal
        String myFirstName = new String("Bryce");
        String myLastName = "Reeder";
        String anotherName = new String("Bryce");
        String anotherLastName = "Reeder";

        System.out.println(myFirstName == anotherName);
        System.out.println(myLastName == anotherLastName);

        //to compare two objects, use .equals not ==, == is only for primitives
        System.out.println(myFirstName.equals(anotherName));

        //String length
        System.out.println(myFirstName.length());
        //substring method
        //first three chars of my name
        System.out.println(myFirstName.substring(0,3));
        //get "ce:
        System.out.println(myFirstName.substring(3));
        //indexOf
        System.out.println(myFirstName.indexOf("e"));
        System.out.println(myFirstName.indexOf("ryc"));
        //compareTo
        System.out.println(myFirstName.compareTo(anotherName));
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));
    }
}
