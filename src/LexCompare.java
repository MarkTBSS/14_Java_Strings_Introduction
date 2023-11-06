public class LexCompare {
    public static String compareStrings(String a, String b) {
        int result = a.compareTo(b);
        if (result <= 0) {
            return "No";
        } else if (result > 0) {
            return "Yes";
        } else {
            return "Equal";
        }
    }
}
