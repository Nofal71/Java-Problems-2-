import java.util.Scanner;







public class Array {
    
    public static class Large {
        
       
      
        Scanner Scc = new Scanner(System.in);   //Input Array
        Scanner size = new Scanner(System.in);  //Size of Array
        private int s;
        private int[] array;   
        private int largest;
        private int smallest;
        
        void input(){
        System.out.print("Enter Size of Array = ");
        int s = size.nextInt();
        array = new int[s];
        System.out.print("Enter Elements of Array = ");
        
        for(int i = 0 ; i < s;i++){
            array[i]= Scc.nextInt();
        }
        }

        void find() {
            largest=array[0];
            smallest=array[0];
            for (int i = 1; i < array.length; i++) {
                if (largest < array[i]) {
                    largest = array[i];
                }
                else if (smallest > array[i]){
                    smallest = array[i];
                } 
            }
            
        }
        void Peak(){
            System.out.println("Peak Element is = "+ largest);
        }
        void minimum(){
            System.out.println("Minimum Element is = "+ smallest);
        }
        void maximum(){
            System.out.println("Maximum Element is = "+ largest);
        }
     
    
    };

 public static class ReverseArray {
 
    Scanner Arr = new Scanner(System.in);
    Scanner s = new Scanner(System.in);
    
   private int[] array;
   private int size ;
   private int[] array1;
    
    void Input(){
        System.out.print("Enter Size of Array = ");
        size = s.nextInt();
        array = new int[size];
        System.out.print("Enter Elements of Array = ");
        for(int i = 0 ; i < size ;i++){
        array[i] = Arr.nextInt();
        }
    }
    void reverse(){
        array1 = new int[size];
        int i = 0 , j = size-1;
         while (i < array.length) {
            array1[i] = array[j];
            i++;
            j--;
        }
        for (int k = 0; k < array1.length; k++) {
            System.out.print(array1[k] + " ");
        

        }
    
        
        }
    }


    public static void main(String[] args) {
        Large l = new Large();
        l.input();
        l.find();
        l.Peak();
        l.maximum();
        l.minimum();
    
       ReverseArray r = new ReverseArray();
       r.Input();
       r.reverse();




}
}
     
    
    
    

