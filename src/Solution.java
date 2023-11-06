//import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "hello\n" +
                        "java";
        Scanner scanner = new Scanner(mockInput);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(a.length() + b.length());
        scanner.close();

        int compareResult = LexCompare.compareStrings(a, b);
        System.out.println(compareResult);

        String aUpper = a.substring(0, 1).toUpperCase()
        + a.substring(1);
        System.out.println(aUpper);

        String bUpper = b.substring(0, 1).toUpperCase()
        + b.substring(1);
        System.out.println(bUpper);

        String aPlusB = aUpper + " " + bUpper;
        System.out.println(aPlusB);
    }
}
