//Miriam_almogren_Section[#41994]_ID[#443200568]_Sheet[#6]
import java.lang.Math;
public class Shape{
private String name;
private double area;
private double perimeter;
public static int numOfCircle;
public static int numOfRectangle;
public Shape(){
    name="";
    area=0;
    perimeter=0;
    numOfCircle=0;
    numOfRectangle=0;
}
public Shape(String n){
name=n;
}
public Shape (String n,double length, double width ){
    name=n;

  calculateArea(length, width);
  calculatePerimeter(length, width);
numOfRectangle++;
    
}
public Shape (String n, double radius){
    name=n;
    calculateArea(radius);
    calculatePerimeter(radius);
    numOfCircle++;
}
public void setName(String n){
    this.name=n;
}

public void calculateArea (double length, double width){
    this.area=length*width;

}
public void calculateArea(double radius){
    this.area=Math.PI* Math.pow(radius,2);
}
public void  calculatePerimeter(double length, double width ){
this.perimeter=2*(length+width);
}
public void calculatePerimeter(double radius ){
this.perimeter=2*radius*Math.PI;
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
public static int getTotalNumberOfShape(){
return numOfCircle+numOfRectangle;
}
}