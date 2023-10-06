//Miriam_almogren_Section[#41994]_ID[#443200568]_Sheet[#5]

import java.util.Scanner;
public class testStudent{

    public static void main (String[] args){
       Scanner input=new Scanner (System.in);
       Student obj1= new Student();
       obj1.SetInfo(4339999,"Maha mohammed","KSU", 4.5);
       
       Student obj2= new Student();
       obj2.SetInfo(4338888, "Dema saad", "PSU", 3.9);
       if (obj1.University.equalsIgnoreCase(obj2.University))
       System.out.println("They are at the same University");
       else
       System.out.println("They are not at the same University");
       System.out.println("Enter the new GPA");
       double tnewGPA=input.nextDouble();
       obj2.changeGPA(tnewGPA);      
       if(obj1.checkSameGPA(obj2))
       System.out.println("they have the same GPA");
       else 
       System.out.println("they don't have the same GPA");
 
       obj1.PrintInfo();
       obj2.PrintInfo();
 
 
 }}
 