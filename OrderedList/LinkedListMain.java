/**********************************************************************************************************************************************************************
 *
 * a. Desc -> Read the Text from a file, split it into words and arrange it as Linked List.
 *    Take a user input to search a Word in the List.
 *    If the Word is not found then add it to the list, and if it found then remove the word from the List.
 *    In the end save the list into a file
 * b. I/P -> Read from file the list of Words and take user input to search a Text
 * c. Logic -> Create a Unordered Linked List. The Basic Building Block is the Node Object.
 *    Each node object must hold at least two pieces of information.
 *    One ref to the data field and second the ref to the next node object.
 * d. O/P -> The List of Words to a File.
 *
 * @author : Immanuvel Jeeva
 * @Since  : 29-07-2021
 *
 *********************************************************************************************************************************************************************/
package OrderedList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        ReadWriteData readWriteData = new ReadWriteData();
        ArrayList<String> dataArray = readWriteData.readFile();

        //convert the arraylist into array to pass it to the generic class
        String[] array = new String[dataArray.size()];
        array = dataArray.toArray(array);

        LinkedListOrderedImplementation<String> orderedImplementation = new LinkedListOrderedImplementation<>(array);

        orderedImplementation.insertBefore();
        orderedImplementation.insertEnd();
        orderedImplementation.insertAt();

        System.out.print("List after insertion in the linked list: ");
        orderedImplementation.display();

        System.out.println();
        //Take input from the user to search for the word
        System.out.print("Enter the word you want to search from the file: ");
        String value = input.next();

        System.out.println("Element found " +orderedImplementation.search(value));
        if(orderedImplementation.search(value) == true)
            orderedImplementation.deleteNode(value);
        else
            orderedImplementation.appendAtEnd(value);

        //sort the linked list
        orderedImplementation.sortList();

        System.out.print("New list: ");
        ArrayList<String> data = orderedImplementation.display();
        readWriteData.writeFile(data);
    }
}

