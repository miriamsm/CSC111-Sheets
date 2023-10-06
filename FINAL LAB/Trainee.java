//Miriam almogren 
//443200568
//12:30
import java.lang.Math.*;
public class Trainee{
private String name;
private double weight;
private char sex;
private String courseName;
public static int numOfFemale;
public Trainee(String name, double w, char sex){
this.name=name;
this.weight=Math.abs(w);
this.sex=sex;
courseName="";
if(sex=='F')
numOfFemale++;

}
public String getName(){
return name;}
public double getWeight(){
return weight;}
public char getSex(){
return sex;}
public String getCourseName(){
return courseName;}


}