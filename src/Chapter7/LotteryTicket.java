package Chapter7;

import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    public static void main(String[] args){
        int [] tickets = generateNumbers ();
        printTickets(tickets);

    }

    public static int [] generateNumbers (){
        int[] tickets = new int[LENGTH];
        Random random = new Random();
        for(int i = 0; i < LENGTH; i++) {
            tickets[i] = random.nextInt();
        }
        return tickets;
    }

    public static void printTickets(int[] tickets){
        for(int i = 0; i < LENGTH; i++) {
            System.out.print(tickets[i] + " | ");
        }
    }
}
