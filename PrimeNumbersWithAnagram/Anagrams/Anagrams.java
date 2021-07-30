/******************************************************************************************************************
 *
 * Extend the Prime Number Program and store only the numbers in that range that are Anagrams.
 * For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range.
 * Further store in a 2D Array the numbers that are Anagram and numbers that are not Anagram
 *
 * @author : Immanuvel Jeeva
 * @since  : 30-07-2021
 *
 ******************************************************************************************************************/
package PrimeNumbersWithAnagram.Anagrams;

import java.util.ArrayList;

public class Anagrams {
    static final int NO_OF_CHARS = 256;

    public static ArrayList findAllAnagrams(ArrayList<String> arr, int n) {
        ArrayList<String> array = new ArrayList<>();
        System.out.println();
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                if (CheckIsAnagram(arr.get(i), arr.get(j))) {
                    System.out.println(arr.get(i) + " is anagram of " + arr.get(j));
                    array.add(arr.get(i));
                    array.add(arr.get(j));
                }

        return array;
    }

    public static boolean CheckIsAnagram(String str1, String str2) {
        int[] count = new int[NO_OF_CHARS];
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < NO_OF_CHARS; i++)
            if (count[i] != 0)
                return false;
        return true;
    }
}

