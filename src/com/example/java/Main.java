package com.example.java;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Array of an Ice Cream Stand");
        String[] iceCreamStand = {"Dry Ice", "flavored Ice Cream", "Cones", "Cart", "Toppings"};
        Arrays.sort(iceCreamStand);
        for (String iceCream : iceCreamStand) {

            System.out.println(iceCream);
        }
    }
}