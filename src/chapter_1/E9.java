package chapter_1;

/*
9. Section 1.5.3 has an example of two strings s and t so that
s.equals(t) but s != t. Come up with a different example that
doesn’t use substring.
 */
public class E9 {
    public static void main(String[] args){
        String s = "hello";
        String t = "hell";
        String x = "hell" + "o";

        System.out.printf("Equals method: %b \n1", x.equals(s));
        System.out.printf("Comparison: %b", x == s);

    }
}
