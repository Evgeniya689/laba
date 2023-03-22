/**
 * @author evgen
 * Creating class Circle inherited from class Figure
 */
package astryakova.company;
public class Circle implements Figure {
    private double radius = 0;

    /**
     *
     * @param radius radius of circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return square or circle
     */
    @Override
    public double getSquare(){
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     *
     * @return perimeter of circle
     */
    public double getPerimeter(){return 2*Math.PI*radius;}
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}