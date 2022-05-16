package Chapter3;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        System.out.println("Please enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;
        switch(grade){
            case "A" :
                message = "Excellent Job";
                System.out.println(message);
                break;
            case "B" :
                message = "Great Job";
                System.out.println(message);
                break;
            case "C" :
                message = "Good Job";
                System.out.println(message);
                break;
            case "D" :
                message = "You need to work a little bit hard";
                System.out.println(message);
                break;
            case "F" :
                message = "Uh Oh";
                System.out.println(message);
                break;
            default:
                message = "Error , Please enter a valid grade";
                System.out.println(message);
                break;
        }
    }
}
