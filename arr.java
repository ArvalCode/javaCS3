import java.util.Arrays;

public class arr
{

public static void main(String[] args)
	{			    

    String s = "apluscompsci.com";
    String words[] = new String[s.length()];
    for (int b = s.length()-1; b>=0; b--) {
        words[b] = s.substring(b);
    }
    Arrays.sort(words);
    System.out.println(words[2].length());

    
}

}
