package Chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main (String[] args){
        int rateHour = 15;
        int maxHours = 40 ;
        System.out.println("Please enter the employee working hours");
        Scanner scanner = new Scanner(System.in);
        double employeeWorkingHours = scanner.nextDouble();
    /*    if (employeeWorkingHours>maxHours){
            System.out.println("Overtime is not allowed");
        }else {
            double empSalary = employeeWorkingHours * rateHour;
            System.out.println("The employee pay is " + empSalary);
        } */
        while (employeeWorkingHours > maxHours || employeeWorkingHours <1){
            System.out.println("Overtime is not allowed , Enter hours between 1 : 40 and try again");
           employeeWorkingHours = scanner.nextDouble();
        }
        scanner.close();
        double empGrossPay = employeeWorkingHours * rateHour ;
        System.out.println("The employee pay is " + empGrossPay);
    }
    }

