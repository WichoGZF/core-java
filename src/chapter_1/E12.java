package chapter_1;

import java.util.Arrays;
import java.util.Scanner;

/*12. Write a switch expression that, when given a string with a compass
direction "N", "S", "E", or "W", yields an array of x- and y-offsets. For
example, "W" should yield new int[] { -1, 0 }.

 */
public class E12 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        String direction = in.nextLine();

        int[] position = switch(direction.charAt(0)) {
            case 'N' -> {
                yield new int[] { 0, 1};
            }
            case 'E' -> {
                yield new int[] {1, 1};
            }
            case 'S' -> {
                yield new int[] {0, -1};
            }
            case 'W' -> {
                yield new int[] {-1, 0};
            }
            default -> {
                yield new int[] {0, 0};
            }
        };
        System.out.println(Arrays.toString(position));

    }
}
