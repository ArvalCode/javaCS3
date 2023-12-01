package MatrixSearch;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran
import java.util.*;
import java.io.*;

public class MatrixSearch {
    private int[][] mat;
    private int odd = 0;
    private int even = 0;
    private int prime = 0;
    
    // Got rid of the function countOdds/Evens and others as it's much more efficient to count as we make the array
    // By doing so we don't have to do check one by one seperately

    public MatrixSearch(int rows, int cols, int upper) {
        mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int randomNumber = (int) ((Math.random() * (upper - 1)) + 1); // 1-upper random number
                mat[i][j] = randomNumber;
                if (isPrime(randomNumber)) {
                    prime+=1;
                }
                if (randomNumber % 2 != 0) {
                    odd++;
                }
                else {
                    even++;
                }
            }
        }
    }

    public int returnOdds() { //Return methods
        return odd;
    }

    public int returnEvens() {
        return even;
    }

    public int returnPrime() {
        return prime;
    }

    private boolean isPrime(int num) { //Checks if its prime
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }



    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : mat) {
            for (int i : row) {
                sb.append(String.format("%-5d", i));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
