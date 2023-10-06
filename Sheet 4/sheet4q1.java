import java.util.Scanner;
public class sheet4q1{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Let's play");
    System.out.println("Enter number of rounds:");
    String rigged;
    int rounds=input.nextInt();
    int i,dice1=0,dice2=0,Nscore=0,Sscore=0,exchange;
    for(i= 1; i<=rounds;i++){
    System.out.println("Enter Sarah's then Nora's number(1-6)");
    dice1=input.nextInt();
    dice2=input.nextInt();
    Nscore+=dice1;
    Sscore+=dice2;
    if ((Nscore!=Sscore))
    System.out.println("Exchange");
    if ((Nscore!=Sscore)&&i<rounds){ 
        
        exchange= dice1;
        dice1=dice2;
        dice2= exchange;
    
    }

    }
    
   if(dice2>dice1)
   rigged="Dice2";
   else if (dice2<dice1)
   rigged="Dice1";
   else
   rigged= "Equal";


    
    System.out.println(rigged+ " is rigged");     
    }
}


