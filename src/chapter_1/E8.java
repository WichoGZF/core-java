package chapter_1;

import java.util.Scanner;

/*8. Write a program that reads a string and prints all of its nonempty
substrings.
 */
public class E8 {
    public static void main(String[] args){
        var in = new Scanner(System.in);
        String inputString = in.nextLine();
        String[] substrings = inputString.split(" ");
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
