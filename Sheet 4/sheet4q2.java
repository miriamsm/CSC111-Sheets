//Section[#41994]_ID[#443200568]_Sheet[#4]
import java.util.Scanner;
public class sheet4q2{
public static void main(String[] args){
Scanner input= new Scanner (System.in);
System.out.println("--Welcome to your active time calculator--");
System.out.println("How many weeks you have been exercising:");
int weeks=input.nextInt();
double totalhours=0,averge=0;
for(int i=1 ; i<=weeks; i++){
System.out.println("week: "+i);
System.out.println("Have you been active this week at all? (yes - no)");
String ans=input.next();
if(ans.equalsIgnoreCase("yes")){
System.out.println("How long have you been active in hours:");
System.out.print("Day1:");
int day1=input.nextInt();
System.out.print("Day2:");
int day2=input.nextInt();
System.out.print("Day3:");
int day3=input.nextInt();
System.out.print("Day4:");
int day4=input.nextInt();
System.out.print("Day5:");
int day5=input.nextInt();
System.out.print("Day6:");
int day6=input.nextInt();
System.out.print("Day7:");
int day7=input.nextInt();
totalhours+= day1+day2+day3+day4+day5+day6+day7;
}
else
continue;
}
averge=totalhours/(7*weeks);
System.out.printf("     -- Your averge is: %.2f hour per day--",averge);
}

}
