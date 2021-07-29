/***********************************************************************************************************************************************************************
 *
 * A - Desc -> Create a Program which creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash.
 *     Have an input panel to add people to Queue to either deposit or withdraw money and dequeue the people.
 *     Maintain the Cash Balance.
 * b - I/P -> Panel to add People to Queue to Deposit or Withdraw Money and dequeue
 * c - Logic -> Write a Queue Class to enqueue and dequeue people to either deposit or withdraw money and maintain the cash balance
 * d - O/P -> True or False to Show Arithmetic Expression is balanced or not.
 *
 * @author : Immanuvel Jeeva
 * @Since  : 29-07-2021
 *
 ***********************************************************************************************************************************************************************/
package BankingCashCounter;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PersonInfo person1 = new PersonInfo("Immanuvel", 12345, 10000);
        PersonInfo person2 = new PersonInfo("Jeeva", 67890, 12000);
        PersonInfo person3 = new PersonInfo("Surya", 24680, 14000);

        ArrayList<PersonInfo> personInfos = new ArrayList<>();
        personInfos.add(person1);
        personInfos.add(person2);
        personInfos.add(person3);

        String[] personNumber = new String[personInfos.size()];
        for(int i=0; i<personNumber.length; i++)
            personNumber[i] = Long.toString(personInfos.get(i).getAccountNumber());

        QueueImpl queue = new QueueImpl(personNumber.length);

        for(int i = 0; i < personNumber.length; i++)
            queue.enqueue(personNumber[i]);

        for(int i = 0; i < personNumber.length; i++) {
            boolean flag = true;
            System.out.println("\nPerson" + +(i+1));
            System.out.println("Press 1 to withdraw money :");
            System.out.println("Press 2 to deposit money :");
            int choice = input.nextInt();

            switch(choice) {
                case 1:
                    while (flag == true) {
                        System.out.print("Enter your account number: ");
                        String accNumber = input.next();
                        if (personNumber[i].equals(accNumber)) {
                            long balance = personInfos.get(i).getTotalBalance();
                            System.out.println("Balance = "+balance);
                            System.out.print("Enter the amount you want to withdraw: ");
                            long amount = input.nextLong();
                            personInfos.get(i).setTotalBalance(balance - amount);
                            System.out.println("Current Balance = "+personInfos.get(i).getTotalBalance());
                            queue.dequeue();
                            flag = false;
                        }
                        else
                            flag = true;
                    }
                    break;
                case 2:
                    while (flag == true) {
                        System.out.print("Enter your account number: ");
                        String accountNumber = input.next();
                        if (personNumber[i].equals(accountNumber)) {
                            long balance = personInfos.get(i).getTotalBalance();
                            System.out.println("Balance = "+balance);
                            System.out.print("Enter the amount you want to deposit: ");
                            long amount = input.nextLong();
                            personInfos.get(i).setTotalBalance(balance + amount);
                            System.out.println("Current Balance = "+personInfos.get(i).getTotalBalance());
                            queue.dequeue();
                            flag = false;
                        }
                        else
                            flag = true;
                    }
                    break;
            }
        }

        if(queue.isEmpty())
            System.out.println("\nQueue is empty. Arithmetic Expression is balanced.");
        else
            System.out.println("\nQueue is not empty. Arithmetic Expression is not balanced.");
    }
}

