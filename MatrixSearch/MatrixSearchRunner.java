package MatrixSearch;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran
import java.util.*;
import java.io.*;

public class MatrixSearchRunner {
    public static void main(String[] args) throws Exception {
        MatrixSearch ms = new MatrixSearch(20, 20, 40);
        System.out.println(ms.toString() + "\nOdds:" + ms.returnOdds() + "\nEvens: " + ms.returnEvens() + "\nPrimes: " + ms.returnPrime() + "\n");

        MatrixSearch two = new MatrixSearch(10, 10, 15);
        System.out.println(two.toString() + "\nOdds:" + two.returnOdds() + "\nEvens: " + two.returnEvens() + "\nPrimes: " + two.returnPrime() + "\n");
        
        MatrixSearch three = new MatrixSearch(3, 3, 5);
        System.out.println(three.toString() + "\nOdds:" + three.returnOdds() + "\nEvens: " + three.returnEvens() + "\nPrimes: " + three.returnPrime() + "\n");
        
        
    }
}