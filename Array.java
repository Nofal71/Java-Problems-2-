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
        private int index = -1;
        private int[] array = {1, 2, 5, 7, 9, 54, 3};
        private int num;

        void input() {
            System.out.print("Enter Number You Want to Search = ");
            num = scanner.nextInt();

            for (int i = 0; i < array.length; i++) {
                if (num == array[i]) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println("Index of Element is = " + index);
            } else {
                System.out.println("Element not found in the array.");
            }
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

        Array.Search search = array.new Search();
        search.input();

    
        array.scanner.close();
    }
}

     
    
    
    

