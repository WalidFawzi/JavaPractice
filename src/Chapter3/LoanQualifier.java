package Chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args){
        int salary = 30000;
        int workingYears = 2;
        System.out.println("How much do you earn per year");
        Scanner scanner = new Scanner(System.in);
        int salaryEarnedPerYear = scanner.nextInt();
        System.out.println("How many years you are working for the same company");
        int yearsInOneCompany = scanner.nextInt();
        scanner.close();
        if(salaryEarnedPerYear>=salary && yearsInOneCompany>=workingYears ){
                System.out.println("You are qualified for a loan");
        }else if(salaryEarnedPerYear<salary && yearsInOneCompany<workingYears ) {
            System.out.println("You are not qualified for a loan");
        }else if(salaryEarnedPerYear>=salary &&yearsInOneCompany<workingYears) {
            System.out.println("You are not qualified for a loan");
        }else if(salaryEarnedPerYear<salary &&yearsInOneCompany>=workingYears) {
            System.out.println("You are not qualified for a loan");
        }else if (salaryEarnedPerYear<salary &&yearsInOneCompany<workingYears){
            System.out.println("You are not qualified for a loan");

        }

    }
}
