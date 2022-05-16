package Chapter3;

import java.util.Scanner;

public class IfStarments {
    public static void main(String [] args) {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        System.out.println("How many sales did the employee sale this week");
         Scanner scanner = new Scanner(System.in);
         int sales =scanner.nextInt();
         scanner.close();
         if (sales>quota){
              salary = salary + bonus;
         } else
             salary = salary;
        System.out.println("The employee pay is " + salary);



    }
}
