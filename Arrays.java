public class Arrays {
    public static void main(String[] args) {
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
}
