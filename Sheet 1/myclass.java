import java.util.Scanner; 

class mycalss {
  public static void main(String[] args) {
    double price, totalprice;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Name:");
    String studentname= input.nextLine();
    System.out.println("Enter Your ID:");
    int studentID = input.nextInt();
    System.out.println("Enter Locker Location: ");
    char LockerLoc = input.next().charAt(0);
    System.out.println("Enter Number Of Quarters :");
    int numberofq = input.nextInt();
    System.out.println("Enter The Rental Price:");
    double rentalprice = input.nextDouble();
    input.close();
    price = numberofq*rentalprice;
    totalprice = price+(price*0.15);
    System.out.println("Student's name: " + studentname);
    System.out.println("Student's ID: " + studentID);
    System.out.println("Locker Location : " + LockerLoc);
    System.out.println("Number Of Quarters :" + numberofq);
    System.out.println("Rental Price (Per Quarter): " + rentalprice);
    System.out.println("---------------------------------------------------------------------");
    System.out.println("The reservation is confirmed and the total price is " + totalprice);
}
}