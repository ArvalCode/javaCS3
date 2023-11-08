// Nolan Tran
// Class 4th Period
// Date 11/4/23

import java.util.Random;

public class AtCounter 
{
    private String[][] matrix; // A 2D matrix of strings to represent the pattern of '@' and '-' symbols.

    // Constructor to create a matrix with random '@' and '-' symbols.
    public AtCounter(int height, int width) 
    {
        matrix = new String[height][width]; // Create a new matrix with the specified dimensions.
        Random random = new Random();

        // Fill the matrix randomly with '@' or '-' symbols.
        for (int row = 0; row < matrix.length; row++) 
        {
            for (int col = 0; col < matrix[row].length; col++) 
            {
                int randomValue = random.nextInt(2) + 1;
                if (randomValue == 1) 
                {
                    matrix[row][col] = "@"; // Place '@' if random value is 1.
                } else 
                {
                    matrix[row][col] = "-"; // Place '-' if random value is 2.
                }
            }
        }
    }

    // Function to count connected '@' symbols starting from a given position.
    public int countConnectedAts(int row, int col, boolean[][] visited) 
    {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length)
         {
            return 0; // If the position is out of bounds, return 0.
        }

        if (visited[row][col] || !matrix[row][col].equals("@")) 
        {
            return 0; // If the cell was already visited or doesn't contain '@', return 0.
        }

        visited[row][col] = true; // Mark the current cell as visited.

        int count = 1; // Initialize the count to 1, counting the current cell with '@'.

        // Explore neighboring cells (up, down, left, right) and recursively count connected '@' cells.
        count += countConnectedAts(row - 1, col, visited); // Up
        count += countConnectedAts(row + 1, col, visited); // Down
        count += countConnectedAts(row, col - 1, visited); // Left
        count += countConnectedAts(row, col + 1, visited); // Right

        return count; // Return the total count of connected '@' cells.
    }

    // Override the toString() method to create a string representation of the matrix.
    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();

        // Build a string representation of the matrix for display.
        for (String[] row : matrix) 
        {
            for (String cell : row) 
            {
                sb.append(cell).append(" "); // Append cell value followed by a space.
            }
            sb.append("\n"); // Add a newline after each row.
        }

        return sb.toString(); // Return the complete matrix as a string.
    }
}
