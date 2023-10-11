package findNextLarge;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran

public class NumberSearch {
    public static int getNextLargest(int[] numArray, int searchNum) {
        int nextLargest = -1; // Initialize with -1 to indicate no next larger number

        for (int num : numArray) {
            if (num > searchNum) {
                if (nextLargest == -1 || num < nextLargest) {
                    nextLargest = num;
                }
            }
        }

        return nextLargest;
    }
}





