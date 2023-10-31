package SumOddDigits;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import static java.lang.System.*;
public class RecursionFunFour
    {
    //sum all odd digits
        public static int sumOddDigits(int num)
        {   
            if (num == 0) 
            return 0;
            int lastDigit = num % 10;

	        int evenCount = lastDigit % 2 != 0 ? lastDigit : 0; // Sets even count to if the lastDigit is not equal to 0, it sets the value to lastDigit

	        int newNum = num / 10;

	        return evenCount + sumOddDigits(newNum); // Returns
        }
}
