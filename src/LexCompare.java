public class LexCompare {
    public static String compareStrings(String a, String b) {
        int result = a.compareTo(b);
        String resultString = "Equal";
        if (result <= 0) {
            resultString = "No";
            return resultString;
        } 
        if (result > 0) {
            resultString = "Yes";
            return resultString;
        } 
        return resultString;
    }
}
