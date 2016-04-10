package Chapter1;

/**
 * Created by yogeshmadaan on 11/04/16.
 */

/**
 *Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string a a b c c c c c a a a would become a2blc5a3. If the "compressed" string
 * would not become smaller than the original string, your method should return the original string.
 */
public class Solution5 {
    static int n;
    static int count =1;
    static char currentChar ;
    public static void main(String[] args) {
        String str = "aabcccaaa";
        String newString = computeString(str);
        if (newString.length()<str.length())
            System.out.println(newString);
        else
            System.out.println(str);
    }

    public static String computeString(String str)
    {
        String newString = new String();
        n = str.length();
        System.out.println("Original string length "+n);
        currentChar = str.charAt(0);
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i) == str.charAt(i+1))
                count ++;
            else
            {
//                newString.concat(Character.toString(currentChar));
                newString = newString + currentChar+count;
//                newString.concat(String.valueOf(count));
                currentChar = str.charAt(i+1);
                count = 1;
            }
        }
        newString = newString + currentChar+count;

        return newString;
    }
}
