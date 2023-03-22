/**
 * @author evgen
 * Creating class Rectangle inherited from class Figure
 */
package astryakova.company;
public class Rectangle implements Figure {
    private double a = 0;
    private double b =0;

    /**
     *
     * @param a length
     * @param b width
     */
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     *
     * @return square of rectangle
     */
    @Override
    public double getSquare() {
        return a*b;
    }

    /**
     *
     * @return perimeter of rectangle
     */
    @Override
    public double getPerimeter() {
        return (a+b)*2;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
