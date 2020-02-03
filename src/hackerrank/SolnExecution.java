package hackerrank;

import java.util.Scanner;

public class SolnExecution {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //System.out.print("enter 2 numbers: ");
        String str=sc.nextLine();
        str=str.trim();
        int s=0;
        int n=0;
        //int s= (int) str.substring(0,str.indexOf(' '));
        //int n= (int) str.substring(str.indexOf(' '));
        int []arr = new int[s];
        int []arr1 = new int[s];
        int []arr2 = new int[s];
        for(int p=0;p<s;p++){
            int k=sc.nextInt();
            arr[p]=k;
        }
        Soln soln = new Soln();
        soln.solution(n,s,arr,arr1,arr2);
    }
}
