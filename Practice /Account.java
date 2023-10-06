public class Account{
    private int number;
    private String name;
    private double balance;
    private String type;
    public Account(){
        number=0;
        name=" ";
        balance=0;
        type=" ";
    }
    public Account(int number,String name, double balance,String type){
        this.number=number;
        this.name=name;
        this.balance=balance;
        this.type=type;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setBalance(double balance) {
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setType(String type) {
        this.type=type;
    }
    public String getType() {
        return type;
    }
    public void deposite(double amount) {
        if(amount<100)
        System.out.println("No deposit! amount less than 100.");
        else
        {if (this.type.equalsIgnoreCase("personal"))
        balance+=amount;
        else if (this.type.equalsIgnoreCase("Business")){
        double fee;
        if(50+amount>(2.5/100)*amount)
        fee=50;
        else
        fee=(2.5/100)*amount;
        balance=balance+amount-fee;}}
    }
    public boolean withdraw(double amount){
         if (this.type.equalsIgnoreCase("personal"))
         {if (balance>=amount){
            balance-=amount;
            return true; }
            System.out.println("The balance is not enough! cannot withdraw!");
            return false;}
        else if(this.type.equalsIgnoreCase("Business")){
        }
        double fee;
        if(50+amount>(2.5/100)*amount)
        fee=50;
        else
        fee=(2.5/100)*amount;
        if (balance-fee>=amount){ 
        balance=balance-fee;
             balance=balance-amount;
            return true;}
        System.out.println("The balance is not enough! cannot withdraw!");
       return false;
}
        
        
        
    }
