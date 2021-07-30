/**********************************************************************************************************************************************************************
 *
 * Create the Week Object having a list of WeekDay objects each storing the day (i.e S,M,T,W,Th,..) and the Date (1,2,3..) .
 * The WeekDay objects are stored in a Queue implemented using Linked List.
 * Further maintain also a Week Object in a Queue to finally display the Calendar.
 * Note - If a particular day has no date then the date is set as empty string and add it to queue.
 *
 * @author : Immanuvel Jeeva
 * @Since  : 29-07-2021
 *
 *********************************************************************************************************************************************************************/
package Calender;

import java.util.ArrayList;

public class QueueMain {
    public static void performQueueOperation(int[] days, int d, int month) {

        ArrayList<String> arrayList = new ArrayList<>();
        String[] weekDay = {"S", "M", "Tu", "W", "Th", "F", "S"};

        //Assigning 0 to the values of the week before the month begins
        for (int i = 0; i < d; i++)
            arrayList.add(weekDay[i] + 0);
        for (int i = 1; i <= days[month]; i++) {
            arrayList.add(weekDay[d] + i);
            if(d < 6)
                d++;
            else
                d = 0;
            if(i == days[month])
                break;
        }

        QueueImpl queue = new QueueImpl();
        for(int i = 0; i < arrayList.size(); i++) {
            queue.enqueue(arrayList.get(i));
        }

        System.out.println();
        System.out.println("Display using Queue\n");
        queue.display();
    }
}

