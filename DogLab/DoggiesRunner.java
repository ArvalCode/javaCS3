//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Nolan Tran

package DogLab;

import java.util.Scanner;

public class DoggiesRunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many Dogs are in the pack? :: ");
        int size = keyboard.nextInt();

        // Create a pack of dogs with the specified size
        Doggies pack = new Doggies(size);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the age :: ");
            int age = keyboard.nextInt();
            System.out.print("Enter the name :: ");
            String name = keyboard.next();

            // Add a new dog to the pack with the entered age and name
            pack.set(i, age, name);
        }

        // Display the contents of the dog pack
        System.out.println("pack :: " + pack);
        
        // Find and display the name of the oldest dog in the pack
        System.out.println("NAME OF OLDEST :: " + pack.getNameOfOldest());
        
        // Find and display the name of the youngest dog in the pack
        System.out.println("NAME OF YOUNGEST :: " + pack.getNameOfYoungest());
    }
}
