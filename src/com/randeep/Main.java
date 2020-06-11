package com.randeep;

import java.util.Scanner;

class Customer {
    String Name;
    int Age;
    String Password;
}

public class Main {

    public static void main(String[] args) {
	// This is the main method.
        userRegistration(); //Will call user registration class.
    }

    static void userRegistration() {
        // This is the user registration class
        Customer user;
        user = collectData(); // call the collectData class to request information from users.
        saveData(user); // call the saveData class to save information collected from users.
    }
    static Customer collectData(){
        Customer User = new Customer();
        Scanner input = new Scanner(System.in);
        System.out.print(" What is your name:  ");
        User.Name = input.nextLine();
        System.out.print("What is your age : ");
        User.Age = input.nextInt();
        System.out.print("Please enter your password: ");
        User.Password = input.next();

        return User;
    }

    static void saveData(Customer User){
        System.out.println(" Saving Data For \n" + User.Name + "\n" + User.Age + "\n" + User.Password);
        // Connect to data base
        // Save the object
        System.out.println(" Save Completed");
    }
}
