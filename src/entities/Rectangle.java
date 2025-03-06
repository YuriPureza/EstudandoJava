package entities;

public class Rectangle {

    public double width;
    public double height;
    public double area;
    public double perimeter;
    public double diagonal;

    public void area() {
        area = width * height;
        System.out.printf("Area = %.2f\n", area);
    }

    public void perimeter() {
        perimeter = 2 * (width + height);
        System.out.printf("Perimeter = %.2f\n", perimeter);
    }

    public void diagonal() {
        diagonal = Math.sqrt(width * width + height * height);
        System.out.printf("Diagonal = %.2f\n", diagonal);
    }

}
