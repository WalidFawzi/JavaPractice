package Chapter2;

import java.util.Scanner;

public class Fundmentals {
    public static void main(String[] args) {
        //Task
        System.out.println("Please enter the season of the year");
        Scanner scanner = new Scanner(System.in);
        String seasonOfYear = scanner.next();
        System.out.println("Please enter how many cups you have");
        int coffeeCups =scanner.nextInt();
        System.out.println("Please enter the adjective while have the coffee");
        String adjective = scanner.next();
        System.out.println("On a "+ adjective+" "+seasonOfYear+" day" +
                ", i drink a minimum of " + coffeeCups + " cups of coffee");
    }


}
