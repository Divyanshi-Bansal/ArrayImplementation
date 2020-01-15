package array;

import java.util.Scanner;

public class ArrayExe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Array array = new Array(size);
        for(int i=0;i<size;i++){
            int value = sc.nextInt();
            array.insertValue(value,i);
        }

        array.bubbleSort();
//        array.deleteValue(7);
//        array.displayArray();
//        array.insertValue(67,7);
//        array.sumArray();
//        array.swapArrayValues(7,4,arr);
//        array.insertValue(1,0);
//        array.insertValue(2,1);
//        array.insertValue(3,2);
//        array.insertValue(4,3);
//        array.insertValue(5,4);

        array.displayArray();
    }
}
