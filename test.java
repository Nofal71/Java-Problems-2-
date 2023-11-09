import java.util.Scanner;

public class test {
    public static void main(String[] args) {

   int Array[] = {1,2,3,9,6,8,5};
//     System.out.println("Array = ");
//     for(int i : Array)
// {
//     System.out.println(i);
// }    
 

// int sum = 0;
// for(int i = 0; i<Array.length;i++){
//     sum+=Array[i];
// }
// System.out.println(sum);



// int Largest = Array[0];
// int Smallest = Array[0];
// for(int i = 0 ; i< Array.length;i++)
// {
    
// if (Largest < Array[i] ) {
    
//    Largest = Array[i];
// }
//   else if (Smallest > Array[i]) {

//    Smallest = Array[i];
   
//   }
// }
//   System.out.println("Largest Element is = "+ Largest);
//   System.out.println("Smallest Element is = "+ Smallest);

//  int Average = 0;
//  int result = 0;
//  for(int i = 0 ; i<Array.length; i++){
//    Average+=Array[i];
//    result = Average/Array.length;   
//  }
// System.out.println("Average Of Elements in  Array = "+ result);



//  for(int i = Array.length-1 ; i>-1; i--){
// System.out.println(Array[i]);
// }



// System.out.println("Finding Index of Element in Array ");
// System.out.println("This is Array = {1,2,3,4,5} ");
// Scanner Arr = new Scanner(System.in);
// System.out.print("Enter Element from above Array = "); 
// int a = Arr.nextInt();
// for(int i = 0; i<Array.length;i++){
// if(a==Array[i]){
//    System.out.println("Yes it is an Elemnt of array and  index is = "+ i);
//    break;
// }
// }




// for(int i = 0 ; i<Array.length-1;i++){

// if(Array[i]==Array[i+1]){
//    continue;
// }
// System.out.println(Array[i]);
// }
// System.out.println(Array[Array.length-1]);




int Largest = Array[0];

for(int i = 0 ; i< Array.length;i++)
{
    
if (Largest < Array[i] ) {
   Largest = Array[i];
}
}
  System.out.println("Largest Element is = "+ Largest);
    }
}
