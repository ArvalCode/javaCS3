package StringSearch;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran
import static java.lang.System.*;

public class StringSearch {
    /*
     * method countWords will count the occurrences of word in sent
     * there may many occurrences of word or none at all
     */

    public static int countWords(String sent, String word) {
        int count = 0;
        for (int i = 0; i < sent.length(); i++) {
            if (sent.charAt(i) == word.charAt(0)) {
                int charCount = 1;
                for (int k = i+1; k < i + word.length(); k++) {
                    if (sent.charAt(k) == word.charAt(charCount)) {
                        charCount++;
                    }
                }
                if (charCount == word.length()) {
                    count++;
                }
            }
        }
        return count;
    }
    

    /*
     * method countLetters will count the occurrences of letter in sent
     * there may many occurrences of letter or none at all
     */
    public static int countLetters(String sent, String letter) {
        int count = 0;
        for (int i = 0; i < sent.length(); i++) {
            if (sent.charAt(i) == letter.charAt(0))
            count++;
        }
        return count;
    }
}
