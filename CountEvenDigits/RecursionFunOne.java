//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran
import static java.lang.System.*;
public class RecursionFunOne
{
    public static int countEvenDigits(int num)
    {
        if (num == 0) 
            return 0;
            int lastDigit = num % 10;

	        int evenCount = lastDigit % 2 == 0 ? 1 : 0;

	        int newNum = num / 10;

	        return evenCount + countEvenDigits(newNum);
    }
}
