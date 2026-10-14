package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
//        1. Declare a variable to store your favorite color
//        2. Declare a variable to store the year you started this class
//        3. Declare a variable to store your middle initial
//        4. Declare a variable to store whether you have pets (yes/no)
//        5. Declare a variable with a nice message or saying
//
        String color= "blue";
        int year =2026;
        char middleName='S';
        boolean hasPets = true;
        String message = "Hello World!";
        System.out.println("My favorite color is " + favoriteColor );
        System.out.println("I started this class in " + classStartYear);
        System.out.println("My middle initial is " + middleInitial );
        System.out.println("I have pets: " + hasPets );
        System.out.println("Message: " + message);

//        Step 2
//        Declare AND initialize variables for:
//        1. The number of days in a week
//        2. The price of coffee ($4.99)
//        3. Your favorite letter
//        4. Whether it's raining (true/false)
//        5. Print all values in complete sentences

        int daysInWeek = 7;
        double coffeePrice = 4.99;
        char favoriteLetter = 'M';
        boolean isRaining = false;

        System.out.println("There are " + daysInWeek + " days in a week");
        System.out.println("A coffee costs " + coffeePrice + "$");
        System.out.println("My favorite letter is " + favoriteLetter);
        System.out.println("Is it raining? " + isRaining);

//        Step 3
//        Create a new file in com.pluralsight named Receipt.java structured as
//        follows:
//        public class Receipt {
//            public static void main(String[] args) {
//                System.out.println();
//            }
//        }
//        1. Create variables for an item name (String) and item price (double)
//        2. Create a quantity variable (int)
//                3. Build and print: EX. "You bought 3 apples for $7.10"
    }
}