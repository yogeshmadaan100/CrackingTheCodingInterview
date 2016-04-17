package Chapter1;

/**
 * Created by yogeshmadaan on 17/04/16.
 */
public class Solution8 {

    public static void main(String[] args) {
        System.out.println(isRotation("dog","ogd"));
    }

    public static boolean isRotation(String s1, String s2) {
        int len = s1.length();
/* check that si and s2 are equal length and not empty */
        if (len == s2.length() && len > 0) {
/* concatenate si and si within new buffer */
            String slsl = s1 + s1;
            return slsl.contains(s2);
        }
        return false;
    }
}
