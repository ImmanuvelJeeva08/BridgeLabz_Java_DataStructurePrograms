/**********************************************************************************************************************************************************************
 *
 * a. Desc -> Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the performance of operations.
 *    Ensure parentheses must appear in a balanced fashion.
 * b. I/P -> read in Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)
 * c. Logic -> Write a Stack Class to push open parenthesis “(“ and pop closed parenthesis “)”.
 *    At the End of the Expression if the Stack is Empty then the Arithmetic Expression is Balanced.
 *    Stack Class Methods are Stack(), push(), pop(), peak(), isEmpty(), size()
 * d. O/P -> True or False to Show Arithmetic Expression is balanced or not..
 *
 * @author : Immanuvel Jeeva
 * @Since  : 29-07-2021
 *
 *********************************************************************************************************************************************************************/
package SimpleBalancedParentheses;

import java.util.ArrayList;

public class StackMain {
    public static void main(String[] args) {
        String value = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
        int count = 0;

        for (int i = 0; i < value.length(); i++)
            if (value.charAt(i) != ' ')
                count++;

        String[] input = new String[count];
        char[] input1 = value.toCharArray();
        for (int i = 0; i < count; i++)
            input[i] = String.valueOf(input1[i]);

        StackImplementation stackImpl = new StackImplementation(input.length);
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i < input.length; i++) {
            if (!input[i].equals(")"))
                arrayList = stackImpl.push(input[i]);
            else {
                stackImpl.pop(arrayList);
            }
        }

        if(stackImpl.isEmpty())
            System.out.println("Stack is empty: Arithmetic Expression is balanced!");
        else
            System.out.println("Stack is not empty: Arithmetic Expression is not balanced!");
    }
}


