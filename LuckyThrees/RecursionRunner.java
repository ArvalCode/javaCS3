package LuckyThrees;

public class RecursionRunner {
    public static int luckyThrees(long number) {
        return luckyThreesHelper(number, false);
    }

    public static int luckyThreesHelper(long number, boolean firstDigitThree) {
        if (number == 0) {
            return 0;
        } else if (number % 10 == 3 && !firstDigitThree) {
            return luckyThreesHelper(number / 10, true);
        } else if (number % 10 == 3) {
            return 1 + luckyThreesHelper(number / 10, firstDigitThree);
        } else {
            return luckyThreesHelper(number / 10, firstDigitThree);
        }
    }

    public static void main(String[] args) {
      long testNumber1 = 33312345;
      int result1 = luckyThrees(testNumber1);
      System.out.println("Number of threes in " + testNumber1 + " is " + result1);

      long testNumber2 = 123456789;
      int result2 = luckyThrees(testNumber2);
      System.out.println("Number of threes in " + testNumber2 + " is " + result2);

      long testNumber3 = 33333;
      int result3 = luckyThrees(testNumber3);
      System.out.println("Number of threes in " + testNumber3 + " is " + result3);

      long testNumber4 = 7777777;
      int result4 = luckyThrees(testNumber4);
      System.out.println("Number of threes in " + testNumber4 + " is " + result4);
    }
}
