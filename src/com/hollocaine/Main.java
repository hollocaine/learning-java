package com.hollocaine;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	  /*  double help = 5.555;
	    Date date = new Date();
        System.out.println(date.toString());
        String name = new String("Alan");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());*/
        /*Primitive types*/
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a " + a + " - b " + b);
        /*Reference types*/
        Person alex = new Person("Alex");
        Person miriam = alex;
        System.out.println("Before changing alex");
        System.out.println(alex.name + " " + miriam.name);
        alex.name = "Alexander";
        System.out.println("After changing alex");
        System.out.println(alex.name + " " + miriam.name);
    }
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
