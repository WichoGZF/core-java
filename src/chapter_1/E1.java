package chapter_1;

import java.util.Scanner;

/*1. Write a program that reads an integer and prints it in binary, octal, and
hexadecimal. Print the reciprocal as a hexadecimal floating-point number.*/
public class E1 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = in.nextInt();

        System.out.printf("""
                         Binary: %s\s
                         Octal: %o\s
                         Hexadecimal: %x\s
                         Hexadecimal reciprocal: %a   \s
                        """,
                Integer.toBinaryString(input),
                input,
                input,
                1 / (float) input);
    }
}

