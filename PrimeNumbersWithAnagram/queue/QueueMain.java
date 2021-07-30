/******************************************************************************************************************
 *
 * Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Queue using
 * the Linked List and Print the Anagrams from the Queue.
 * Note no Collection Library can be used.
 *
 * @author : Immanuvel Jeeva
 * @since  : 30-07-2021
 *
 ******************************************************************************************************************/
package PrimeNumbersWithAnagram.queue;

import PrimeNumbersWithAnagram.Anagrams.Anagrams;
import PrimeNumbersWithAnagram.FindPrimeNumbers.PrimeNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower bound of the interval: ");
        int lowerBound = sc.nextInt();

        System.out.print("Enter upper bound of the interval: ");
        int upperBound = sc.nextInt();

        PrimeNumbers prime = new PrimeNumbers();
        ArrayList<String> array = prime.checkPrime(lowerBound, upperBound);

        Anagrams anagramQueue = new Anagrams();
        int n = array.size();
        ArrayList<String> array1 = anagramQueue.findAllAnagrams(array, n);

        QueueImpl queue = new QueueImpl();
        for(int i = 0; i < array1.size(); i=i+2) {
            if((i+1) < array1.size())
                queue.enqueue(array1.get(i), array1.get(i + 1));
            else
                break;
        }
        System.out.println("\nAnagrams in Queue implemented using Linked List");
        queue.display();
    }
}
