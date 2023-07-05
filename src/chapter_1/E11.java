package chapter_1;

import java.util.Scanner;

/*
11. Write a program that reads a line of text and prints all characters that are
not ASCII, together with their Unicode values.
 */
public class E11 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        String inputString = in.nextLine();

        int [] codePoints = inputString.codePoints().toArray();
        for(int codePoint: codePoints){
            if(codePoint > 127){
                System.out.printf("%d : %c \n", codePoint, codePoint);
            }
        }

    }
}
