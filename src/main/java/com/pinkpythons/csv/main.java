package com.pinkpythons.csv;
import com.pinkpythons.csv.crud.read.Delete;

/**
 * The Csv Data class.
 *
 * @author Theo White
 */


import com.pinkpythons.csv.crud.read.ReadData;

import java.io.IOException;
import java.util.Scanner;

/**
 * Main class designed to run the code
 */
public class main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        handleUserInput();
    }

    /*
     * Performs user request to; create, read, update, delete.
     */
    public static void handleUserInput() {
        try {
            System.out.println("Would you like to (CREATE,READ,UPDATE,DELETE,EXIT)?");
            while (true) {
                String userRequest = input.nextLine().toUpperCase();
                switch (userRequest) {
                    case "CREATE":
                        System.out.println("Create");
                        //Insert your code to 'create'
                        break;
                    case "READ":
                        System.out.println("Please provide query in the following format? (product_id = 1, wholesale_cost >= 0)");
                        String newLine = input.nextLine();
                        System.out.println("Provide a File Name");
                        String fileName = input.nextLine();
                        ReadData.selectFromString(newLine, fileName);
                        break;
                    case "UPDATE":
                        //Insert your code to 'update'
                        break;
                    case "DELETE":
                        Delete.question();
                        //Insert your code to 'delete'
                        break;
                    case "EXIT":
                        System.out.println("Exiting program...");
                        input.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Could not find that operation | " + userRequest);
                        break;
                }
            }
        }catch(IllegalStateException e){
            System.out.println("Please Provide the Correct Input");
        }catch(IllegalArgumentException ex){
            System.out.println("e");
        }
    }
}
