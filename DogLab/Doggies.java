//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Nolan Tran

package DogLab;

import java.util.Arrays;

public class Doggies 
{
    private Dog[] pups; // An array to hold Dog objects

    public Doggies(int size) 
    {
        // Constructor: Initialize the Doggies with the specified size
        pups = new Dog[size]; // Initialize pups array with the given size
    }

    public void set(int spot, int age, String name) 
    {
        // Set a new Dog in the array at the specified spot (make sure spot is in bounds)
        if (spot >= 0 && spot < pups.length) {
            pups[spot] = new Dog(age, name);
        }
    }

    public String getNameOfOldest() 
    {
        if (pups.length == 0) {
            return "No dogs in the pack.";
        }

        int maxAge = pups[0].getAge();
        String oldestName = pups[0].getName();

        // Find the oldest dog in the pack
        for (int i = 1; i < pups.length; i++) {
            if (pups[i].getAge() > maxAge) {
                maxAge = pups[i].getAge(); // Update the maximum age
                oldestName = pups[i].getName(); // Update the name of the oldest dog
            }
        }

        return oldestName;
    }

    public String getNameOfYoungest() {
        if (pups.length == 0) {
            return "No dogs in the pack.";
        }

        int minAge = pups[0].getAge();
        String youngestName = pups[0].getName();

        // Find the youngest dog in the pack
        for (int i = 1; i < pups.length; i++) {
            if (pups[i].getAge() < minAge) {
                minAge = pups[i].getAge(); // Update the minimum age
                youngestName = pups[i].getName(); // Update the name of the youngest dog
            }
        }

        return youngestName;
    }

    public String toString() {
        // Convert the array of dogs to a string representation
        return Arrays.toString(pups);
    }
}
