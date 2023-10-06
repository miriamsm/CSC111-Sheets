import java.util.Scanner;
public class Sheet1 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
    
       System.out.println("Enter Your Name:");
       String employeesname = input.nextLine();
       System.out.println("Enter Your Mnthly Salary:");
       double monthlys = input.nextDouble();
       System.out.println("Enter The Current Day Date");
       int daydate = input.nextInt();
       int paid;
       paid = 28-daydate;
       double annual;
       annual= monthlys *12;
       System.out.println("Employee's name : " + employeesname);
       System.out.println("Employee's monthly salary : " + monthlys);
       System.out.println("Day date :" + daydate);
       System.out.println("You will be getting paid after : " + paid);
       System.out.println("Employee's annual salary:" + annual);


    }
}