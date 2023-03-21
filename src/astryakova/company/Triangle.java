/**
 * @author evgen
 * Creating class Triangle inherited from class Figure
 */
package astryakova.company;
public class Triangle implements Figure {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    /**
     *
     * @param a first side
     * @param b second side
     * @param c third side
     */
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     *
     * @return square of triangle
     */
    @Override
    public double getSquare() {
        return Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
    }

    /**
     *
     * @return perimeter of triangle
     */
    @Override
    public double getPerimeter() {
        return a + b + c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
