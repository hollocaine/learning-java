package com.hollocaine;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    double help = 5.555;
	    Date date = new Date();
        System.out.println(date.toString());
        String name = new String("Alan");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());


    }
}
