import java.util.*;
public class testAccount{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice=0;
        double amount=0;
        System.out.print("Please enter account number, name, balance and type: ");
        int number=input.nextInt();
        String name=input.next();
        double balance=input.nextDouble();
        String type=input.next();
        Account obj=new Account(number, name, balance, type);
        System.out.println("Choose your transaction:");
        do{
            System.out.println("1)Deposit 2)Withdraw 3)Show balance 4)Exit: ");
            choice=input.nextInt();
            while (choice<1||choice>4) {
                System.out.println("Wrong input try again");
                System.out.println("1)Deposit 2)Withdraw 3)Show balance 4)Exit: ");
                choice=input.nextInt();
            }
            if(choice==1){
                System.out.print("Enter the amount you want to deposit: ");
                amount=input.nextDouble();
                obj.deposite(amount);
            }
            if(choice==2){
                System.out.print("Enter the amount you want to withdraw: ");
                amount=input.nextDouble();
                obj.withdraw(amount);
            }
            if (choice==3){
                System.out.println("Account number: "+obj.getNumber()+" For Mr."+obj.getName()+" has balance of : "+ obj.getBalance());
            }



        }while(choice!=4);
        System.out.println("Goodbye");

    }
    
}
