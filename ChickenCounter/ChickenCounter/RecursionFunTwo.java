package ChickenCounter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Nolan Tran

import static java.lang.System.*;

public class RecursionFunTwo {
    public static int countChickens(String word) {
        int index = word.indexOf("chicken");
        
        if (index == -1) {
            return 0;
        }
        
        int count = 1;  // Count the visible "chicken"
        word = word.substring(0, index) + word.substring(index + 7);
        
        // Recursively count hidden "chicken" instances
        return count + countChickens(word);
    }
}