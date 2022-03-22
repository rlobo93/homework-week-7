package homeworkweek7;

/**
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double
 */
public class Program15Wall {

    double width, height;

    public static void main(String[] args) {

        Program15Wall wall = new Program15Wall(25, 10);

        System.out.println("Area= " + wall.getArea());
        wall.setHeight(10);
        System.out.println("Width= " + wall.getWidth());
        System.out.println("Height= " + wall.getHeight());
        System.out.println("Area= " + wall.getArea());

    }

    //constructor 1
    public Program15Wall() {

    }

    //constructor 2 with parameters
    public Program15Wall(double w, double h) {

        width = w;
        height = h;


    }
    //method 1

    public double getWidth() {

        return width;

    }

    //method 2

    public double getHeight() {
        return height;
    }


    //method 3
    public void setWidth(double w) {

        if (w < 0) {
            width = 0;

        } else {

            width = w;
        }
    }


    //method 4

    public void setHeight(double h) {

        if (h < 0) {
            height = 0;
        } else {
            height = h;
        }

    }


    //method 5
    public double getArea() {
        double area;

        area = height * width;
        return area;

    }
}
