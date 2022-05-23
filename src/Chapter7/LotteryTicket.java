package Chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] args){
        int [] tickets = generateNumbers ();
        Arrays.sort (tickets);
        printTickets(tickets);
    }

    public static int [] generateNumbers (){
        int[] tickets = new int[LENGTH];
        Random random = new Random();
        for(int i = 0; i < LENGTH; i++) {
            int randomNumber;
            do {
                randomNumber =  random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search (tickets,randomNumber));
                tickets[i] =randomNumber;

        }
        return tickets;
    }

    public static void printTickets(int[] tickets){
        for(int i = 0; i < LENGTH; i++) {
            System.out.print(tickets[i] + " | ");
        }
    }

    public static boolean search (int [] array , int numberToSearchFor){
        for (int value : array){
            if(value == numberToSearchFor)
                return true;
        }
        return false;
    }

    public static boolean binarySearch (int[] array , int numberToSearchFor){
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if(index>=0){
            return true;
        }else return false;
    }
}
