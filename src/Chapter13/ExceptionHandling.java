package Chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
       // createNewFile();
        numberExceptionHandling();
    }
    public static void createNewFile(){
        File file = new File ("resources/nonexistent.txt");
        try {
            file.createNewFile();
        }catch (Exception e) {
            System.out.println("The directory is not exist");
            e.printStackTrace();
        }
    }
    public static void numberExceptionHandling(){
        File file = new File ("resources/numbers.txt");

        try (Scanner fileReader = new Scanner(file);){
            while (fileReader.hasNext()){
                double value = fileReader.nextDouble();
                System.out.println("Number: " + value);
            }
        }catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }

    }
}
