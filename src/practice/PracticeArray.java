package practice;

import java.util.Scanner;

public class PracticeArray {
    Scanner sc = new Scanner ( System.in );
    int n= sc.nextInt ();
    int []arr = new int [n];
    public void insert(int index,int data){
        if(index>0) {
            arr[index] = data;
        }
        else{
            System.out.println ("invalid index");
        }
    }
}
