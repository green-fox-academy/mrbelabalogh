package Week1;

import java.util.Scanner;

public class PartyIndicator {

  public static void main(String[] args) {


    Scanner partyscanner = new Scanner(System.in);

    System.out.println("Please give me the number of girls!");
    int numberOfGirls = partyscanner.nextInt();



    System.out.println("Please give me the number of boys!");
    int numberOfBoys = partyscanner.nextInt();



    if (numberOfGirls == 0) {
      System.out.println("Sausage party");
    }

    if (numberOfBoys + numberOfGirls >= 20) {
      if (numberOfBoys == numberOfGirls) {
        System.out.println("The Party is excellent!");
      }
      if (numberOfBoys != numberOfGirls) {
        System.out.println("Quite a cool party!");
      }
    } else {
      System.out.println("Average party...");
    }

    // int a =

    // Write a program that asks for two numbers
    // The first number represents the number of girls that comes to a party, the
    // second represents the number of boys
    //
    // If the the number of girls and boys are equal and 20 or more people are coming to the party
    // it should print: The party is excellent!
    //
    // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
    // it should print: Quite a cool party!
    //
    // If there are less people coming than 20
    // it should print: Average party...
    //
    // If no girls are coming, regardless the count of the people
    // it should print: Sausage party

  }
}
