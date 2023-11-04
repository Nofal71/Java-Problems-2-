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





public static void main(String[] args) {

  System.out.println("1 - Acending order   "); 
  System.out.println("2 - Decending order   "); 

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
    default:
      break;
  }
    

 
  


}
}
