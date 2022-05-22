package Chapter6;

public class HomeAreaCalculator {
    public static void main(String args[]){
        Rectangle room1 = new Rectangle();
        room1.setLength(25);
        room1.setWidth(20);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30,50);
        double areaOfRoom2 = room2.calculateArea();

        double totalAreas = areaOfRoom1 + areaOfRoom2 ;

        System.out.println("The total area is " + totalAreas);

    }

}
