package chapter_1;

import java.math.BigInteger;

/*
Write a program that computes the factorial n! = 1 × 2 × ... × n, using
BigInteger. Compute the factorial of 1000.
 */
public class E6 {

    public static void main(String[] args) {


        BigInteger bigIntK = BigInteger.ONE;

        for (int i = 1; i <= 1000; i++) {
            bigIntK = bigIntK.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bigIntK);
    }


}
