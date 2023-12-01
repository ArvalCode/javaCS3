package MatrixSearch2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran
import java.util.*;


import java.io.*;

public class MatrixSearch2 
{
    private int[][] mat;
    private int maxPrime = 0;
    private int maxPrimeRndSum = 0; //Stores data for the max prime surrounding sum

    public MatrixSearch2(int rows, int cols, int upper) 
    {
        mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                int randomNumber = (int) ((Math.random() * (upper - 1)) + 1); // 1-upper random number
                mat[i][j] = randomNumber; //Set the length and width
                // Checks the surrounding sum and change value of maxPrime if it's more than original
                //Checks if its prime while creating array as we don't have to do another linear search with a duplicate array
                //This would be efficient when generating a larger array
                if (isPrime(randomNumber)) 
                {
                    if ((randomNumber > maxPrime) && (getRndSum(i, j) > maxPrimeRndSum)) 
                    {
                        maxPrime = randomNumber;
                        maxPrimeRndSum = getRndSum(i, j);
                    }
                }
            }
        }
    }

    public int returnMaxPrime() 
    {
        return maxPrime;
    }

    private int getRndSum(int row, int col) 
    {
        int sum=0;

        if (inBounds(row+1, col)) 
        {
        sum+=mat[row+1][col];
        }
        if (inBounds(row-1, col)) 
        {
        sum+=mat[row-1][col];
        }
        if (inBounds(row,col+1)) 
        {
        sum+=mat[row][col+1];
        }
        if (inBounds(row, col-1)) 
        {
            sum+=mat[row][col-1];
        }

        return sum;
    }

    private boolean inBounds(int row, int col) 
    //Checks if in bounds
    {
        if ((row < 0) || (row > mat.length-1) || (col < 0) || (col > mat[0].length-1)) 
        {
            return false;
        }
        return true;
    }

    private boolean isPrime(int num) 
    { //Checks if its prime
        if (num <= 1) 
        {
            return false;
        }
        if (num <= 3) 
        {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) 
        {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6)
        {
            if (num % i == 0 || num % (i + 2) == 0) 
            {
                return false;
            }
        }
        return true;
    }



    public String toString() 
    //Uses string concatenation for better efficiency
    {
        StringBuilder sb = new StringBuilder();
        for (int[] row : mat) 
        {
            for (int i : row) 
            {
                sb.append(String.format("%-5d", i));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
