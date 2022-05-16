package Chapter5;

import java.util.Scanner;

public class Greetings {
    public static void greetmethod(String name){
         System.out.println("Hi " + name);
    }
    public static void main(String [] args){
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetmethod(name);
    }
}
