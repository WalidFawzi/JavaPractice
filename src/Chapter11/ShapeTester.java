package Chapter11;

public class ShapeTester {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5,7);
        double area = rectangle.calculateArea();
        System.out.println("The area is " + area);
    }
}
