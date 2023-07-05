package chapter_1;

/*
5. What happens when you cast a double to an int that is larger than the
largest possible int value? Try it out.
 */
public class E5 {
    public static void main(String[] args){
        final double EXAMPLE_DOUBLE = 214748364888.0;
        int randomInt = (int) EXAMPLE_DOUBLE;
        System.out.println(randomInt);
        System.out.println(EXAMPLE_DOUBLE);
    }
}
/*
What happens is the rest of the number is trimmed, that is only the maximum possible of int is used.
 */