package StringSearch;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran
import java.util.ArrayList;
import static java.lang.System.*;

public class StringSearchRunner {
    public static void main(String args[]) {
        System.out.println(StringSearch.countLetters("computertscience", "t"));
        System.out.println(StringSearch.countWords("computerstocience", "to"));
        System.out.println(StringSearch.countWords("computerstocience", "o")); 
        System.out.println(StringSearch.countWords("computerstocience", "e"));  
    }
}
