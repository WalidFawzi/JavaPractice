package Chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("How many sales did the employee sale this week");
        Scanner scanner = new Scanner(System.in);
        int salesAchieved =scanner.nextInt();
        scanner.close();
        if (salesAchieved>=quota){
            System.out.println("Thank you for your efforts");

        }else {
            int salesShort = quota - salesAchieved;
            System.out.println("you didn't met the quota , you were " + salesShort + " sales short");
        }


    }
}
