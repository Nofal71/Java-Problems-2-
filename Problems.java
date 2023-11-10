import java.util.Scanner;

public class Problems{

public static void Q1() {
      {
        System.out.println(" Acending order  = "); 
        int Myarray[]={22,44,55,11,99};
        int result;
for(int i = 0 ; i< Myarray.length;i++)
{
  for(int j = i; j < Myarray.length;j++){
    if(Myarray[i] > Myarray[j]){
    result = Myarray[i];
    Myarray[i]=Myarray[j];
    Myarray[j]= result;
    }
    
  }
}
  for(int i : Myarray ){
    System.out.println(i);
  }
}

  
}

public static void Q2() {
      {
        System.out.println(" Decending order  = "); 
        int Myarray[]={22,44,55,11,99};
        int result;
for(int i = 0 ; i< Myarray.length;i++)
{
  for(int j = i; j < Myarray.length;j++){
    if(Myarray[i] < Myarray[j]){
    result = Myarray[i];
    Myarray[i]=Myarray[j];
    Myarray[j]= result;
    }
    
  }
}
  for(int i : Myarray ){
    System.out.println(i);
  }
}
}

public static void Q3(){
  System.out.println("Finding Index of Element in Array ");
  System.out.println("This is Array = {1,6,7,9,4,8,3,5,3} ");
 int Array[] = {1,6,7,9,4,8,3,5,3};
 Scanner Arr = new Scanner(System.in);
 System.out.print("Enter Element from above Array = "); 
 int a = Arr.nextInt();
for(int i = 0; i<Array.length;i++ ){
  if(Array[i]==a){
 Array[i]=i;
 System.out.println("Index of Array Element is "+Array[i]);
 
 }
 else{
  System.out.println("No such an Element in Array ");
  break;
 }
}
}
public static void Q4(){
  System.out.println("diagonal sum of 2D Arrays = ");
int array[][]= {
  {1, 2, 3},
  {1, 2, 3}
};
int diagonalSum = 0;

for (int i = 0; i < array.length; i++) {
  diagonalSum += array[i][i];
}

System.out.println(diagonalSum);
}

public static void Q5(){
System.out.println("Largest Elements in 2d arrays : ");
int array[][]= {
  {1, 2, 3},
  {1, 2, 3}
};

int Largest = array[0][0];
for (int i = 0; i < array.length; i++) { 
for(int j = 0; j< array[i].length ; j++){
if (Largest < array[i][j]) {
  Largest= array[i][j];
}  
}
}
System.out.println(Largest);

}
public static void Q6(){
  System.out.println("Swaping Rows to columns in 2D array ");
  int array[][] = {
      {1, 1, 1},
      {2, 2, 2},
      {3, 3, 3}
  };
  int rows = array.length;
  int columns = array[0].length;
  int matrix[][] = new int[columns][rows];

  for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
          matrix[j][i] = array[i][j];
          System.out.print(matrix[j][i] );//swaping 
      }
  
  }
} 
  

public static void Q7() {
  System.out.println("Product of 2D arrays ");
          int array1[][] = {
              {1, 1, 1},
              {2, 2, 2},
              {3, 3, 3}
          };
      
          int array2[][] = {
              {1, 1, 1},
              {2, 2, 2},
              {3, 3, 3}
          };
      int rows = array1.length;
      int columns = array1[0].length;
      int Array1[][] = new int[rows][columns];
  
      for(int i = 0;i<rows;i++){
          for(int j = 0;j<columns; j++ ){
          Array1[i][j] = array1[i][j]*array2[i][j];
          System.out.println(Array1[i][j]);      
      }    
      }
    }


public static void main(String[] args) {

  System.out.println("1 - Acending order   "); 
  System.out.println("2 - Decending order   "); 
  System.out.println("3 - Finding Index of Element in Array ");
  System.out.println("4 - diagonal sum of 2D Arrays  ");
  System.out.println("5 - Largest Elements in 2d arrays : ");
  System.out.println("6 - Swaping Rows to columns in 2D array ");
  System.out.println("7 - Product of 2D arrays ");
  Scanner input = new Scanner(System.in);
  System.out.print("Enter Question Number = ");
  int Q = input.nextInt();
  switch (Q) {
    case 1:
      Q1();
      break;
    case 2:
      Q2();
      break;
    case 3:
      Q3();
      break;
    case 4:
      Q4();
      break;
    case 5:
      Q5();
      break;
    case 6:
      Q6();
    case 7:
      Q7();
      break;
    default:
      break;
  }
    

 
  


}
}
