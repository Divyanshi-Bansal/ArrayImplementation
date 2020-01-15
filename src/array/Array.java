package array;

import java.util.Arrays;

public class Array<arr> {
    private int length;
    private int index=0;
    public int [] arr;
    public int s=0;


    public Array(int length){
        this.length=length;
        int []arr =new int[length];
    }

    public void insertValue(int element,int index) {
        if (index < length) {
            arr[index] = element;
        }
        else{
            System.out.println("out of bound");
        }
    }
    
    public void deleteValue(int index){
        if(index>=0){
            arr[index]=0;
        }
        else{
            System.out.println("invalid index");
        }
    }
    
    public void displayArray(){
        System.out.println("[");
        for (int i = 0; i < length; i++) {
            System.out.printf(String.valueOf(arr[i]));
        }
        System.out.println("]");
    }

    public void bubbleSort(int[] arr){
        for(int j=0;j<arr.length-j;j++){//function of bubble sort
            for(int i=0;i<=j;i++){
                if(arr[i]>arr[i+1]){
                    swapArrayValues(i,i+1,arr);
                }
            }
        }
//        int k =Arrays.sort(arr);//utilise method
//        System.out.println(k);

    }

    public void swapArrayValues(int i, int i1,int[]arr) {
        int temp =arr[1];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }


    //public void sortArray(){
        //Arrays.sort(arr);
        //System.out.println("modified arr[] : %s", Arrays.toString(arr));
    //}

    public void sumArray(){
        for (int i = 0; i < length; i++) {
            s=s+arr[i];
        }
        System.out.println(s);
    }
}
