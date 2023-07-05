package chapter_1;

import java.util.Scanner;

/*2. Write a program that reads an integer angle (which may be positive or
//negative) and normalizes it to a value between 0 and 359 degrees. Try it
//first with the % operator, then with floorMod.*/
public class E2 {
    public static void main(String[] args){
        var in = new Scanner(System.in);
        System.out.print("Enter an angle:");
        int inputInt = in.nextInt();
        System.out.printf("%% operator: %d, floorMod: %d", inputInt % 360, Math.floorMod(inputInt, 360));
    }
}
