//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran
//Date - 10/5/23

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.*;

public class RomanNumeral 
{
   private Integer number;
   private String roman;

   // Arrays to map Roman numerals to their values
   private final static int[] ROMAN_VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
   private final static String[] ROMAN_NUMERALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

   // Constructor: Initialize RomanNumeral from a Roman numeral string
   public RomanNumeral(String romanNumeral)
   {
       roman = romanNumeral;
       number = romanToNumber(romanNumeral);
   }

   // Constructor: Initialize RomanNumeral from an integer value
   public RomanNumeral(Integer value)
   {
       number = value;
       roman = numberToRoman(value);
   }

   // Set the integer value
   public void setNumber(Integer value)
   {
       number = value;
       roman = numberToRoman(value);
   }

   // Set the Roman numeral string
   public void setRoman(String romanNumeral)
   {
       roman = romanNumeral;
       number = romanToNumber(romanNumeral);
   }

   // Get the integer value
   public Integer getNumber()
   {
       return number;
   }

   // Get the Roman numeral string
   public String toString()
   {
       return roman + "\n";
   }

   // Convert Roman numeral to an integer
   private static int romanToNumber(String roman)
   {
       int result = 0;
       int i = 0;
       
       // Iterate through the Roman numeral string
       for (int j = 0; j < ROMAN_NUMERALS.length; j++)
       {
           // Check if the Roman numeral starts with the current letter
           while (roman.startsWith(ROMAN_NUMERALS[j], i))
           {
               // Add the corresponding value to the result
               result += ROMAN_VALUES[j];
               i += ROMAN_NUMERALS[j].length();
           }
       }
       return result;
   }

   // Convert an integer to a Roman numeral string
   private static String numberToRoman(int number)
   {
       StringBuilder result = new StringBuilder();
       
       // Iterate through the Roman values
       for (int i = 0; i < ROMAN_VALUES.length; i++)
       {
           // Append the corresponding Roman numeral(s) to the result
           while (number >= ROMAN_VALUES[i])
           {
               result.append(ROMAN_NUMERALS[i]);
               number -= ROMAN_VALUES[i];
           }
       }
       return result.toString();
   }
}
