package chapter_1;

import java.util.Scanner;

/*
     Using only the conditional operator, write a program that reads three
     integers and prints the largest. Repeat with Math.max.
*/
public class E3 {
    public static void main(String[] args){
        var in = new Scanner(System.in);
        System.out.print("Enter integer one: ");
        int numberOne = in.nextInt();
        System.out.print("Enter integer two: ");
        int numberTwo = in.nextInt();
        System.out.print("Enter integer three: ");
        int numberThree = in.nextInt();

        int largestInteger;
        if(numberOne > numberTwo){
            if(numberOne > numberThree){
                largestInteger = numberOne;
            }
            else{
                largestInteger = numberThree;
            }
        }
        else if (numberTwo > numberThree){
            largestInteger = numberTwo;
        }
        else{
            largestInteger = numberThree;
        }
        System.out.println("Using conditionals: " + largestInteger);

        largestInteger = Math.max(Math.max(numberOne, numberTwo), numberThree);

        System.out.println("Using Math.max: " + largestInteger );
    }
}
