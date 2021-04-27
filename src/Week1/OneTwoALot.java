

package Week1;

import java.util.Scanner;


public class OneTwoALot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int a = scan.nextInt();

        scan.close();

        System.out.println("The number entered by the user is: " + a);

        if (a == 0) {
            System.out.println("Not enough");
        }

        if (a == 1) {
            System.out.println("One");
        }
        if (a == 2) {
            System.out.println("Two");
        }

        if (a > 2) {
            System.out.println("A lot");
        }

    }
}
// Write a program that reads a number form the standard input,
    // If the number is zero or smaller it should print: Not enough
    // If the number is one it should print: One
    // If the number is two it should print: Two
    // If the number is more than two it should print: A lot
