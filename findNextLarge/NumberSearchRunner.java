package findNextLarge;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran

public class NumberSearchRunner
{
    public static void main( String args[] )
    {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
    int find = 5;
    System.out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array, find) + "\n");
    //add more case
    int[] array1 = {1, 2, 3, 4, 5, 3, 1, 5, 3, 2, 1, 2, 5, 4, 1};
    System.out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array1, find) + "\n");
    // Another case
    int[] array2 = {1, 2, 3, 4, 5, 3, 1, 5, 3, 2, 1, 2, 5, 4, 10000};
    System.out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array2, find) + "\n");
    }
}

