import java.util.Scanner;
public class sheet3{
public static void main(String[] args){
double discount,total;
discount=-0;
Scanner input = new Scanner (System.in);
System.out.println("Enter loyalty level (S for Silver) or (G for Gold):");
String level = input.nextLine();
System.out.println("Enter the number of beans bags:");
int bags= input.nextInt();
System.out.println("Number of ordered beans:" + bags);

while (bags<0){
System.out.println("Please Enter a valid number:");
bags = input.nextInt();
}

if (level.equalsIgnoreCase("s")){
     if (bags <= 10){
       discount= -0.0;
       }
     else if (bags > 10 && bags < 15){
          discount=-(5*bags*0.1);
          }
     else{
       discount=-(5*bags*0.15);
       }
         }
  else if(level.equalsIgnoreCase("g")){
         if(bags<10){
         discount=-(5*bags*0.05);
         }
         else{
         discount=-(5*bags*0.2);
         }
         }
   else {
         System.out.printf("%n%s%n%n","invalid input of loyalty level!");
         bags=0;
         discount=-0.0;
         }
total=5*bags+discount;    
System.out.printf("%s%-6.2f%s%n","Discount value:",discount,"SR");
System.out.printf("%s%-6.2f%s","Your total charge:",total,"SR");
}
}
