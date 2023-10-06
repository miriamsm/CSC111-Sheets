//Miriam_almogren_Section[#41994]_ID[#443200568]_Sheet[#7]
public class Q4 {
    public static void main(String[] args){
String array1[]=new String[]{"Ahmad", "Adam"};
String array2[]=new String[]{"Mick","Ali!"};
int n1=array1.length;
int n2=array2.length;
String []array3=new String[n1+n2];
for(int i=0;i<n1;i++){
array3[i]=array1[i];}
for(int i=n1;i<array3.length;i++){
array3[i]=array2[i-n1];
}
for(int i=0;i<array3.length;i++){
System.out.print(array3[i]+" ");}
    }}
