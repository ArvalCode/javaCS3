package MatrixSearch2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran
import java.util.*;
import java.io.*;

public class MatrixSearchRunner2 {
    public static void main(String[] args) throws Exception {

        long startTime = System.nanoTime();

        MatrixSearch2 ms = new MatrixSearch2(1, 1, 20);
        System.out.println(ms.toString() + "\n Max Prime: " + ms.returnMaxPrime() + "\n");

        // MatrixSearch2 two = new MatrixSearch2(10, 10, 60);
        // System.out.println(two.toString() + "\n Max Prime: " + two.returnMaxPrime() + "\n");

        // MatrixSearch2 three = new MatrixSearch2(5, 5, 10);
        // System.out.println(three.toString() + "\n Max Prime: " + three.returnMaxPrime() + "\n");

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime*(1*Math.pow(10, 9)));

    }
}