package Chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
   private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorRedo  cal = new HomeAreaCalculatorRedo();
        Rectangle kitchen = cal.getRoom();
        Rectangle bathroom = cal.getRoom();
        double totalArea = cal.calculateTotalArea(kitchen,bathroom);
        System.out.println("The total area is "+totalArea);
        cal.scanner.close();


    }
    public Rectangle getRoom(){
        System.out.println("Enter the length of your Room");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of your Room");
        double width = scanner.nextDouble();
        return new Rectangle (length, width);
    }

    public double calculateTotalArea(Rectangle rect1 ,Rectangle rect2){
        return rect1.calculateArea() + rect2.calculateArea();
    }
}
