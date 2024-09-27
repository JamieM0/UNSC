public class Support {
    public static String untilSpace(String s) {
        return s.replaceAll(" .*", "");
    }
    public static String afterSpace(String s) {
        return s.replaceAll(".* ", "");
    }
    public static int numAssign(String s)
    {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        //Get number for letter
        return letters.indexOf(s) + 10;
    }
    public static String letterAssign(int i)
    {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        i-=10;
        return String.valueOf(letters.charAt(i)).toUpperCase();
    }
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
