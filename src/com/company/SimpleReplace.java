package com.company;

public class SimpleReplace {
    public static void main(String... args) {
        String dishwasher = "In a dishwasher far far away";

        String galaxy = dishwasher.replace("dishwasher", "galaxy");

        String s = "ez egy objektum, nincs primitív típusa";


        String nemobjektum = s.replace("egy objektum", "nem egy objektum");
        System.out.println(nemobjektum);

        // I would like to replace "dishwasher" with "galaxy" in this example variable, but it has a problem
        // Please fix it for me!
        // Expected output: In a galaxy far far away

        System.out.println(dishwasher);
        System.out.println("The correct sentence: ");
        System.out.println(galaxy);
    }
}