package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a HashMap object called vehicles
        HashMap<String, String> vehicles = new HashMap<String, String>();

        // Add keys and values (Model, Make)
        vehicles.put("CIVIC", "HONDA");
        vehicles.put("ACCORD", "HONDA");
        vehicles.put("CR-V", "HONDA");
        vehicles.put("ODYSSEY", "HONDA");
        vehicles.put("PILOT", "HONDA");
        vehicles.put("COROLLA", "TOYOTA");
        vehicles.put("CAMRY", "TOYOTA");
        vehicles.put("RAV4", "TOYOTA");
        vehicles.put("SIENNA", "TOYOTA");
        vehicles.put("HIGHLANDER", "TOYOTA");

        Scanner userInput = new Scanner(System.in);
        System.out.println("What car model are you looking for?");
        String key = userInput.next().toUpperCase();

        boolean modelFound = vehicles.containsKey(key);

        // Checks to see if user input matches with what's in the hashmap
        while (!modelFound) {
            System.out.println("Car model does not exist. Please try again.");
            System.out.println("What car model are you looking for?");
            key = userInput.next().toUpperCase();
            modelFound = vehicles.containsKey(key);
        }

        System.out.println("The make for this car model is a " + vehicles.get(key) + ".");

        userInput.close();
    }
}

