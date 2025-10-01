//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Pseudocode:
        // Ask user for party (D, R, I)
        // If D → Democratic Donkey
        // Else if R → Republican Elephant
        // Else if I → Independent Person
        // Else → Other

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your party affiliation (D, R, I): ");
        String choice = in.nextLine().toUpperCase();

        if (choice.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other.");
        }
    }
}