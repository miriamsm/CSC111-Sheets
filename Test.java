
import java.util.Scanner;

import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String shapechoice,choice="";
        double length,width,radius;
        do{System.out.println("Enter R for rectangle and C for circle");
        shapechoice=input.next();
        if(shapechoice.equalsIgnoreCase("r")){
        System.out.println("Entre the length and width of the rectangle");
        length=input.nextDouble();
        width=input.nextDouble();
        Shape rectangle=new Shape(choice, length, width);
        CheckShape(rectangle);
        }
        else if(shapechoice.equalsIgnoreCase("c")){
            System.out.println("Entre the radius of the circle");
            radius=input.nextDouble();
            Shape circle=new Shape(choice, radius);
            CheckShape(circle);
        }
        else {
        System.out.println("wrong choice");}
        System.out.println("Do you want to create other shape Y/N");
        choice=input.next();

        }while(choice.equalsIgnoreCase("y"));
        System.out.println("Total number of created shapes is "+Shape.getTotalNumberOfShapes());

    }
    public static void CheckShape(Shape sh){
        System.out.println("area= "+ sh.getArea()+" perimeter= "+sh.getPerimeter());
        System.out.println("The number Of Rectangle is "+Shape.numOfRectangles +" and number Of Circle is "+ Shape.numOfCircles);
        if (sh.getArea()>100)
        System.out.println("Big Shape Size");
        else 
        System.out.println("Small Shape Size");
    }
}
