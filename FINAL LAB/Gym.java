//443200568
//12:30
import java.util.Scanner;
public class Gym{
public static void main(String[] args){
FitnessCourse f1=new FitnessCourse("swimming",15);
FitnessCourse f2=new FitnessCourse("boxing",10);
FitnessCourse f3=new FitnessCourse("yoga",6);
Trainee t1=new Trainee("Maha Saad", 60,'F');
Trainee t2=new Trainee("Malak Ali", 52,'F');
Trainee t3=new Trainee("Hala Mohammed", 88,'F');
f1.addTrainee(t1);
f1.addTrainee(t2);
f1.addTrainee(t3);
f1.display();
System.out.println("The income for f1 is: "+f1.calculateIncome());
Scanner input=new Scanner(System.in);
System.out.println("Enter info for the boxing trainee\nName:");
String name=input.nextLine();
System.out.println("Wight:");
double wight=input.nextDouble();
System.out.println("sex:");
char sex=input.next().charAt(0);
while(!(sex=='F'||sex=='M')){
System.out.println("Wrong entry, it should be M or F. Try again.");
sex=input.next().charAt(0);
}
Trainee t4=new Trainee(name,wight,sex);
f2.addTrainee(t4);
f2.display();
Trainee t5=new Trainee("Gus Fring",77,'M');
Trainee t6=new Trainee("Kin Wex",59,'F');
f3.addTrainee(t5);
f3.addTrainee(t6);
f3.display();
Trainee t7=new Trainee("Kin Wex",59,'F');
f3.addTrainee(t7);
System.out.println("Number of female members: "+Trainee.numOfFemale);
System.out.println("Income for F1 and f3: "+calcuTotalIncome(f1,f3));

}


public static double calcuTotalIncome(FitnessCourse fc1,FitnessCourse fc2){
return fc1.calculateIncome()+fc2.calculateIncome();
}}
