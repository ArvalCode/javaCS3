
//Name: Nolan Tran

public class RecursionRunner
{
    public static int luckyThrees(int number)
    {
        int NumberThree = 0;
        // converts to string
        String NumThrees = Integer.toString(number);
        // if it ends it return 0
        if (NumThrees.length() == 1) {
            return 0;
        }
        // add one to the counter if it isn't compared to the first digit of the number and the digit is 3, add one to the counter
        if (NumThrees.length() != 1 && NumThrees.charAt(NumThrees.length()-1) =='3') {
            NumberThree+=1;
        }
        // return the counter with 1 less digit
    return NumberThree + luckyThrees(number/10);
    }
    public static void main(String[] args)
    {
    // test cases
        System.out.println(luckyThrees(3));
        System.out.println(luckyThrees(30));
        System.out.println(luckyThrees(134523));
        System.out.println(luckyThrees(192333));
        System.out.println(luckyThrees(182383));
        System.out.println(luckyThrees(123323));
    }
}
