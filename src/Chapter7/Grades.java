package Chapter7;

import java.util.Scanner;

/*
 *Create a program that allows a user to enter any number of grades
 * provide them with their average,score,as well as the highest and lowest scores
 */
public class Grades {
    private static int [] grades;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("How many grades would you like to enter ");
        grades = new int [scanner.nextInt()];
        getGrades();
        System.out.println("Average is " + String.format("%.2f",calculateAvg()));
        System.out.println("Highest is " + getHighest());
        System.out.println("Lowest is " + getLowest());

    }
    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter garde #" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum(){
        int sum = 0;
        for(int grade :grades) {
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAvg() {

        return calculateSum() / grades.length;

    }

    public static int getHighest(){
        int highest = grades[0];
        for(int grade :grades) {
            if(grade>highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest() {
        int lowest = grades[0];
        for(int grade :grades) {
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }
}
