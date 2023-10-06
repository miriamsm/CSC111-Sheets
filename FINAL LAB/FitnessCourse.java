//Miriam almogren 
//443200568
//12:30
public class FitnessCourse{
private String name;
private int num;
private int numOfOW;
private String members;
private int capacity;

public FitnessCourse(String n, int capa){
name=n;
capacity=capa;
num=0;
numOfOW=0;
members="";
}
public boolean addTrainee(Trainee t){

if(isFull()){
System.out.println("Cannot add the trainee");
return false;}
if (isMember(t)){
System.out.println("Cannot add the trainee");
return false;}
members=members+"_"+t.getName();
num++;
if(t.getWeight()>80)
numOfOW++;
System.out.println("The trainee is added successfully to "+name);
return true;
}
public boolean isMember(Trainee t){

    /* This was my try in the exam
String checking="";
for(int i=0; i<members.length();i++){
checking="";
for(int j=0;j<t.getName().length();j++){
if(members.charAt(i)==t.getName().charAt(j))
checking=checking+t.getName().charAt(j);
}
}
if(checking.equals(t.getName()))
return true; 
return false;
*/
    //found this solution after the exam
    if(members.contains(t.getName()))
    return true;
    return false;

}
public boolean isFull(){
if (capacity==num)
return true;
return false;
}
public double calculateIncome(){
double price=0;
switch(name){
case "swimming":
price=100*0.5*numOfOW+100*(num-numOfOW);
break;
case "boxing":
price=120*0.5*numOfOW+120*(num-numOfOW);
break;
case "yoga":
price=170*0.5*numOfOW+170*(num-numOfOW);
break;}

return price;
}
public void display(){
System.out.printf("Name: %20s%n",name);
System.out.printf("Capacity: %10d%n",capacity);
System.out.printf("Trainee names:%s%n",getMembers());
if(isFull())
System.out.println("Availabilty: This course is full");
else
System.out.println("Availabilty: You can book this course");
System.out.println("*************************************");

}
public String getMembers(){
members=members.replace('_','\n');
return members;}
}