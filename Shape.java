import static java.lang.Math.*;
class Shape{
    private String name;
    private double area;
    private double perimeter;
    public static int numOfCircles;
    public static int numOfRectangles;

    public Shape(String n){
        name=n;
        area=0;
        perimeter=0;

    }
    public Shape (String n, double length,double width){
        name=n;
        calculateArea(length, width);
        calculatePerimeter(length, width);
        numOfRectangles++;
    }
    public Shape (String n, double radius){
        name=n;
        calculateArea(radius);
        calculatePerimeter(radius);
        numOfCircles++;

    }
    public void setName(String n){
        name=n;
    }
    public void calculateArea(double length, double width ){
        area=length*width;
    }
    public void calculateArea (double radius){
        area=PI*pow(radius, 2);
    }
    public void calculatePerimeter(double length, double width ){
        perimeter=2*(length+width);
    }
    public void calculatePerimeter(double radius ){
        perimeter=2*PI*radius;
    }
    public String getName(){
        return name;
    }
    public double getArea(){
        return area;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public boolean equals(Shape shape){
        if (shape.area==shape.perimeter)
        return true;
        else
        return false;
    }
    public static int getTotalNumberOfShapes(){
        return numOfCircles+numOfRectangles;
    }



}