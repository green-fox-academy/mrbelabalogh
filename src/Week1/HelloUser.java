package Week1;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        //import java.util.Scanner;
        
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        System.out.println("Please enter your name!");

        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input and to press enter
        String userInput1 = scanner.nextLine();



        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        //System.out.println(userInput1);

        //System.out.println(userInput2);


        // Loads the scanner to the file
/* import java.util.Scanner;

        public class UserInput {
            public static void main(String[] args) {
                // Creates a scanner
                Scanner scanner = new Scanner(System.in);

                // The program stops and waits for user input and to press enter
                String userInput1 = scanner.nextLine();

                // It prints the whole line that was given by the user
                System.out.println(userInput1);

                // The program stops and waits for user input that is an integer and to press enter
                int userInput2 = scanner.nextInt();

                // It prints the integer
                System.out.println(userInput2); 
                */
    }
}
