/**
 * @author evgen
 */
package astryakova.company;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.getSquare());
        System.out.println(circle.getPerimeter());
        Rectangle rectangle = new Rectangle(10, 15);
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.getPerimeter());
        Triangle triangle = new Triangle(2, 3, 4);
        System.out.println(triangle.getSquare());
        System.out.println(triangle.getPerimeter());
        Ellipse ellipse = new Ellipse(4, 9);
        System.out.println(ellipse.getSquare());
        System.out.println(ellipse.getPerimeter());
    }
}