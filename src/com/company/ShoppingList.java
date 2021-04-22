package com.company;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
  public static void main(String[] args) {

    List<String> ShoppingList = new ArrayList<>();

    ShoppingList.add(new String("Eggs"));
    ShoppingList.add(new String("Milk"));
    ShoppingList.add(new String("Fish"));
    ShoppingList.add(new String("Apples"));
    ShoppingList.add(new String("Bread"));
    ShoppingList.add(new String("Chicken"));

    System.out.println("Do we have milk or bananas on the list?");

    if (ShoppingList.contains("Milk")) {
      System.out.println("We have milk on the list.");
    }
    else {
      System.out.println("We don't have any milk on the list.");
    }

    if (ShoppingList.contains("bananas")) {
      System.out.println("We have banana on the list.");
    }
    else {
      System.out.println("We don't have any bananas on the list.");
    }

    //ADD USER INPUT ENTER AND MORE QUESTIONS!



  /*We are going to represent a shopping list in a list containing strings.

Create a list with the following items.
Eggs, milk, fish, apples, bread and chicken
Create an application which solves the following problems.
Do we have milk on the list?
Do we have bananas on the list

   */
}
}
