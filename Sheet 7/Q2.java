//Miriam_almogren_Section[#41994]_ID[#443200568]_Sheet[#7]
public class Q2{
public static int GetMax (int[] A ){
int maxIndex = 0;  
for (int index = 1; index < A.length; index++){
if (A[maxIndex] < A[index])       
maxIndex = index;}
int largestelement = A[maxIndex];

return largestelement;
    
}}

