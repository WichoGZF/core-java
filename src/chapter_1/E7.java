package chapter_1;

import java.util.Scanner;

/*
7. Write a program that reads in two integers between 0 and 4294967295,
stores them in int variables, and computes and displays their unsigned
sum, difference, product, quotient, and remainder. Do not convert them to
long values.
 */
public class E7 {
    public static void main(String[] args){
            int numberOne;
            int numberTwo;
            var in = new Scanner(System.in);
            numberOne = in.nextInt();
            numberTwo = in.nextInt();

            System.out.println(Integer.toUnsignedString(numberOne + numberTwo));
            System.out.println(Integer.toUnsignedString((numberOne - numberTwo)));
            System.out.println(Integer.toUnsignedString((numberOne * numberTwo)));
            System.out.println(Integer.toUnsignedString((numberOne / numberTwo)));
            System.out.println(Integer.toUnsignedString((numberOne % numberTwo)));
    }
}
