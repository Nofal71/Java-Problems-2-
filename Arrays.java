public class Arrays {
    public static void main(String[] args) {
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
    }


