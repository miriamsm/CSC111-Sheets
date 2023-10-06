//Miriam_almogren_Section[#41994]_ID[#443200568]_Sheet[#7]
public class Q3 {
    public static void main(String[] args){
        int array[]=new int[]{9,1,2,5,3,2};
        System.out.println("Original Array:");
        int temp=0;
for(int i=0;i<array.length;i++)
System.out.print(array[i]+" ");
for(int i=0;i<array.length;i++){

for(int j=0;j<array.length;j++){
if (array[i]<array[j])
{
    temp=array[i];
    array[i]=array[j];
    array[j]=temp;

}}}
    System.out.println("\nAfter sorting in ascending order:");
    for(int i=0;i<array.length;i++)
System.out.print(array[i]+" ");


}}
