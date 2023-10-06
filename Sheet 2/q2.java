import java.util.Scanner;
public class q2 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter passenger full name:");
        String fullname = input.nextLine();
        if (fullname.length()>45)
        {fullname = fullname.substring(0,45);}
        
        System.out.println("Enter passenger flight number:");
        String flightnum= input.nextLine();
        System.out.println("Enter passenger seating:");
        String seatnum = input.nextLine();
        
        
        while (!(seatnum.matches("[a-fA-F]\\d{2}"))) {
         
        System.out.println("Please enter a valid passenger seating :");
        seatnum = input.nextLine();
        }
    
       
        
        System.out.println("Enter departure time:");
        int time = input.nextInt();
        
           while(time<0 || time>23) {
                System.out.println("Please enter a valid time:");
                 time = input.nextInt();    
                     }
        int boardt = time -1;
        if (time==0)
          boardt = 23;
          
        String boardtime = boardt+":30";

      
    
        System.out.printf("%20s%-45s%20s%-45s%n","passenger Name : ", fullname,"Flight # :",flightnum);
        System.out.printf("%20s%-45s%20s%-45s%n","Seating Line : ",seatnum.charAt(0), "Seating # :",seatnum.substring(1));
        System.out.printf("%20s%-45s","boarding time : ", boardtime);
     
   
    }
    
}
