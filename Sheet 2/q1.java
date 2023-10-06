import java.util.Scanner;
public class q1{
public static void main(String[] args){
    System.out.println("Enter Student full name and KSU email in the following format: \nfirstName lastName_KSUemail");
    Scanner input= new Scanner (System.in);
    String str= input.nextLine();
    System.out.print("First name is ");
    String name = str.substring(0,(str.indexOf(" ")));
    name = name.substring(0,1 ).toUpperCase() + name.substring(1);

    System.out.println(name);
    System.out.print("Student ID is ");
    System.out.println(str.substring((str.indexOf("_")+1),(str.indexOf("@"))));
    System.out.print("The enrollment year in Higri is 14");
    System.out.println(str.substring((str.indexOf("_")+1),(str.indexOf("_")+3)));
}
}