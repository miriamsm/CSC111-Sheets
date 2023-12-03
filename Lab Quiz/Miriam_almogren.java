//443200568
import java.util.Scanner;
public class Miriam_almogren{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String name,ans,lastname;
    int i=0,days1;
    char type;
    double charge=0;
    do{
    System.out.print("Enter the customer's full name:");
    name=input.nextLine();
    System.out.print("Enter the number of days to book the room:");
    days1=input.nextInt();
    while(days1<0){
    System.out.println("Invalid input! try again."); 
    System.out.print("Enter the number of days to book the room:");
    days1=input.nextInt();}
    System.out.println("Type of room: Standard (S), Deluxe (D), Executive (E):");
    type=input.next().charAt(0);
    switch(type){
    case 'S':
    charge=days1*300;
    break;
    case 'D':
    if(days1>3)
    charge=days1*800-(days1*800*0.05);
    else
    charge=days1*800;
    break;
    case 'E':
    charge=days1*1000;
    break;
    default:
    charge=0;
    System.out.println("Invalid input!");}
    
    lastname=name.substring(name.indexOf(" "));
    System.out.printf("Mrs.%-20s%n",lastname);
    System.out.printf("The total charge:%.1f SR%n",charge);
 
    System.out.print("continue: y/n?");
    ans=input.next();
    i++;
    }while(ans.equalsIgnoreCase("y"));
    
    System.out.println("Number of bookings:"+i+" times");
    }}