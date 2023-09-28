// Eric Yan, Tyler Getz, Nolan Tran
// Period 4
// assignment: Use a switch case to convert a ragged array of number grades to letter grades


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import junit.framework.Test;


public class SwitchCaseBlockAssignment
{
    public static void main(String[] args)
        {
            // test case ragged array
            
            int [][] TestCase = new int[3][3];

            // populate the matrix test case with values and print it out

            System.out.println("Here is the randomly generated matrix in numerical form");
            for (int row = 0; row < TestCase.length; row++)
            {
                for (int col = 0; col < TestCase[row].length; col++)
                {
                    TestCase[row][col] = (int)(Math.random() * (220+1)) -110 ;
                    System.out.print(TestCase[row][col] + " ");

                }
                System.out.println();
            }

            //  calls the assignGradeValues method and prints ut the result
            System.out.println();
            System.out.println("Here are the number grades as letter values");
            char[][] Result = assignGradeValues(TestCase);
            for(int i = 0; i < Result.length; i++)
            {
                for(int j = 0; j < Result[i].length; j++)
                {
                    System.out.print(Result[i][j] + " ");
                }
                System.out.println();
            }

        }

        //this method takes in a integer matrix and returns a character matrix with the grade values
        
        public static char[][] assignGradeValues (int[][] matrix) 
        {
            //creates a temporary matrix to return of the same length as the parameter array
            char[][] ReturnMatrix = new char[matrix.length][matrix[0].length];

            // loops through the given array to determine the letter grade for each postion using a switch statement
            for (int row = 0; row < matrix.length; row++)
            {
                for (int col = 0; col < matrix[row].length; col++)
                {
                    switch (matrix[row][col])
                    {
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        ReturnMatrix[row][col] = 'A';
                        break;
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        ReturnMatrix[row][col] = 'B';
                        break;
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        ReturnMatrix[row][col] = 'C';
                        break;
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        ReturnMatrix[row][col] = 'D';
                        break;
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        ReturnMatrix[row][col] = 'F';
                        break;
                        default:
                        ReturnMatrix[row][col] = 'X';
                        break;
                        
                    }
                }

            }
        //returns the result
        return ReturnMatrix;

        }
}




