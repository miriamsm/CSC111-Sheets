//Miriam_almogren_Section[#41994]_ID[#443200568]_Sheet[#6]
import java.util.Scanner; 
public class TestShape{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        String choice,answer;
        double rlength=0,rwidth=0,radius=0;
        do{
            System.out.println("Enter R for rectangle and C for circle");
            choice=input.next();
        if(choice.equalsIgnoreCase("R"))
        {System.out.println("Entre the length and width of the rectangle");
        rlength=input.nextDouble();
        rwidth=input.nextDouble();
        Shape rectangleShape= new Shape(choice,rlength,rwidth);
        CheckShape(rectangleShape);
        }
        else if (choice.equalsIgnoreCase("C"))
        {
            System.out.println("Entre the radius of the circle");
            radius=input.nextDouble();
        Shape circleShape=new Shape(choice,radius);
        CheckShape(circleShape);
        }
        else
        System.out.println("wrong choice");
        System.out.println("Do you want to create other shape Y/N");
        answer=input.next();
    }while(answer.equalsIgnoreCase("y"));
    System.out.println("Total number of created shapes is "+Shape.getTotalNumberOfShape());
        }
        public static void CheckShape(Shape sh){
            

            System.out.printf("area= %.2f",sh.getArea());
            System.out.printf(" perimeter= %.2f%n",sh.getPerimeter());
            System.out.println("The number Of Rectangle is "+Shape.numOfRectangle+" and number Of Circle is "+Shape.numOfCircle);
            if (sh.getArea()>100)
            System.out.println("Big shape size");
            else
            System.out.println("Small shape size");
        
    }
}
