/**********************************************************************************************************************************************************************
 *
 * Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. Store the prime numbers in a 2D Array.
 * The first dimension represents the range 0-100, 100-200, and so on.
 * While the second dimension represents the prime numbers in that Range.
 * Extend the Prime Number Program and store only the numbers in that range that are Anagrams.
 * For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range.
 * Further store in a 2D Array the numbers that are Anagram and numbers that are not Anagram
 *
 * @author : Immanuvel Jeeva
 * @since  : 30-07-2021
 *
 *********************************************************************************************************************************************************************/
package PrimeNumbersWithAnagram.twoDArray;

import PrimeNumbersWithAnagram.Anagrams.Anagrams;
import PrimeNumbersWithAnagram.FindPrimeNumbers.PrimeNumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoDArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower bound of the interval: ");
        int lowerBound = sc.nextInt();

        System.out.print("Enter upper bound of the interval: ");
        int upperBound = sc.nextInt();

        PrimeNumbers prime = new PrimeNumbers();
        ArrayList<String> array = prime.checkPrime(lowerBound, upperBound);

        int arr[][] = new int[upperBound][upperBound];
        System.out.print("2D Array of Prime Numbers: ");
        for(int i=lowerBound; i<upperBound; i++) {
            System.out.println("i = "+i);
            for(int j = 0; j < upperBound; j++) {
                if(j < array.size()){
                    int value = Integer.parseInt(array.get(j));
                    arr[i][value] = value;
                    System.out.print(arr[i][value] + " ");
                }
                else
                    break;
            }
            break;
        }
        System.out.println();

        Anagrams anagram2DArray = new Anagrams();
        int n = array.size();
        ArrayList<String> array1 = anagram2DArray.findAllAnagrams(array, n);
        //System.out.println(array1);

        System.out.print("Anagrams are: ");
        for(int i=0; i<array1.size(); i++) {
            for(int j = 0; j < array1.size(); j++) {
                arr[i][j] = Integer.parseInt(array1.get(j));
                System.out.print(arr[i][j] + " ");
            }
            break;
        }
        System.out.println();

        System.out.print("Non-anagrams are: ");
        Set<String> array2 = new HashSet<>();
        for(int i=0; i< array.size(); i++) {
            for (int j = 0; j < array1.size(); j++) {
                if (array.get(i) != array1.get(j)) {
                    array2.add(array.get(i));
                }
            }
        }
        System.out.println(array2);
    }
}
