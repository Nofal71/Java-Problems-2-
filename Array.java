import java.util.Scanner;

public class Array {
    Scanner scanner = new Scanner(System.in);

    class Large {
        private int largest;
        private int smallest;

        void find() {
            System.out.print("Enter Size of Array = ");
            int size = scanner.nextInt();
            int array[] = new int[size];

            System.out.print("Enter Elements of Array = ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            largest = array[0];
            smallest = array[0];

            for (int i = 1; i < array.length; i++) {
                if (largest < array[i]) {
                    largest = array[i];
                } else if (smallest > array[i]) {
                    smallest = array[i];
                }
            }
        }

        void peak() {
            System.out.println("Peak Element is = " + largest);
        }

        void minimum() {
            System.out.println("Minimum Element is = " + smallest);
        }

        void maximum() {
            System.out.println("Maximum Element is = " + largest);
        }
    }

    class ReverseArray {
        private int[] array;
        private int size;
        private int[] reversedArray;

        void input() {
            System.out.print("Enter Size of Array = ");
            size = scanner.nextInt();
            array = new int[size];

            System.out.print("Enter Elements of Array = ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
        }

        void reverse() {
            reversedArray = new int[size];
            int i = 0, j = size - 1;

            while (i < array.length) {
                reversedArray[i] = array[j];
                i++;
                j--;
            }

            System.out.print("Reversed Array: ");
            for (int k = 0; k < reversedArray.length; k++) {
                System.out.print(reversedArray[k] + " ");
            }
            System.out.println();
        }
    }

    class SortArray {
        private int[] array;
        private int size;

        void input() {
            System.out.print("Enter Size of Array = ");
            size = scanner.nextInt();
            array = new int[size];

            System.out.print("Enter Elements of Array = ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
        }

        void sort() {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        void output() {
            System.out.print("Sorted Array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    class Search {
        private int array[];;
        private int num;
        private int num2;
        Scanner kthLarge = new Scanner(System.in);
        Scanner KthSmall = new Scanner(System.in);
       
        public void SortingArray() {
            for (int i = 0; i < array.length-1; i++) {
           for(int j = i+1 ; j<array.length;j++){
            if(array[i]>array[j]){
                int temp = array[i];
                array[i]= array[j];
                array[j]= temp;
            }
           }
        }
    }
    public void PrintSortedArray(){

    
           for(int k : array){
            System.out.print( k+ " ");
     
        }
       System.out.println();
    }
    public void KthVAlues(){
        System.out.print("Enter kth Largest value = ");
        num = kthLarge.nextInt();
        System.out.print("Enter kth Smallest value = ");
        num2 = KthSmall.nextInt();
        if (num<=0||num>array.length||num2>array.length||num2<=0) {
            return;
        }else{
        int largest = array[array.length-num];
        int smallest = array[num2-1];
        System.out.println("Kth Largest Value is = "+ largest);
        System.out.println("Kth Smallest Value is = "+ smallest);
    }}
        
    }


    class Polymorphism{
        // Polymorphism is OOP concept 
        // different functions with same name

        String name ;
        int age ;
    public void printinfo(String name){
     System.out.println(name);
     }
    public void printinfo(int age , String name){
     System.out.println(name + age);
    }
    public void printinfo(int age){
     System.out.println(age);
    }
    }

    class Inheretence{
        String color;
        public void area(int height , int length){
            System.out.println("Display Area = "+ height*length );
        }
    }
    class shape extends Inheretence{
    public void output(int shape){
        System.out.println(shape+color);
    }
    }
    class Circle extends shape{
        int area;
        public void area(int radius){
            System.out.println("Radius of circle is = "+ radius+color);
            
        }
    } 
    public static void main(String[] args) {
        Array array = new Array();
        
        Array.Large large = array.new Large();
        large.find();
        large.peak();
        large.maximum();
        large.minimum();

        Array.ReverseArray reverseArray = array.new ReverseArray();
        reverseArray.input();
        reverseArray.reverse();

        Array.SortArray sortArray = array.new SortArray();
        sortArray.input();
        sortArray.sort();
        sortArray.output();

        Search search = array.new Search();
        search.array = new int[]{7,5,8,9,2};
        search.SortingArray();
        search.PrintSortedArray();
        search.KthVAlues();
        
        

        // Polymorphism Obj1 = array.new Polymorphism();
        // Obj1.printinfo("Nofal");
        // Obj1.printinfo(18,"Nofal"); 
        // Obj1.printinfo(18);
           
        // shape Obj = array.new shape();
        // Obj.color =" red";
        // Obj.output( 24);
        // Obj.area(10, 20);
        
        // Circle ObJ = array.new Circle();
        // ObJ.area(12);
        
        
        

    }
}

     
    
    
    

