package chapter_1;

import java.util.Random;

/*10. Write a program that produces a random string of letters and digits by
generating a random long value and printing it in base 36.
 */
public class E10 {
    public static void main(String[] args){
        long randomLong = new Random().nextLong();
        System.out.println(Long.toString(randomLong, 36));
    }
}
