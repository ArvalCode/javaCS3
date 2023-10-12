package findNextLarge;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran

public class NumberSearch 
{
    public static int getNextLargest(int[] numArray, int searchNum) 
    {
        int nextLargest = -1; // Initialize with -1 to indicate no next larger number

        for (int num : numArray) // Loops through the iterations in the array
        {
            if (num > searchNum)  //Checks if the number is bigger than the searchNum
            {
                if (num < nextLargest || nextLargest == -1) 
                { //Checks for a number bigger than the find int in the runner
                    nextLargest = num; //if it does check out then it changes the value to it
                }
            }
        }

        return nextLargest; //Returns the next largest
    }
}





