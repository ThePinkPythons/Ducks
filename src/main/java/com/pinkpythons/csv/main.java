package com.pinkpythons.csv;

/**
 * The Csv Data class.
 *
 * @author Theo White
 */


import java.io.IOException;
import java.util.Scanner;

/**
 * Main class designed to run the code
 */
public class main {
    public static void main(String[] args) throws IOException {
        handleUserInput();
    }

    /*
     * Performs user request to; create, read, update, delete.
     */
    public static void handleUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to (CREATE,READ,UPDATE,DELETE,EXIT)?");
        while (true) {
            String userRequest = input.nextLine().toUpperCase();
            switch (userRequest) {
                case "CREATE":
                    System.out.println("Create");
                    //Insert your code to 'create'
                    break;
                case "READ":
                    //Insert your code to 'read'
                    break;
                case "UPDATE":
                    //Insert your code to 'update'
                    break;
                case "DELETE":
                    //Insert your code to 'delete'
                    break;
                case "EXIT":
                    System.out.println("Exiting program...");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Could not find that operation | "  + userRequest);
                    break;
            }
        }
    }
}
