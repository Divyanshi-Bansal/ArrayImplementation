package myAnatomy;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int x = sc.nextInt ();
        int y = sc.nextInt ();
        MyAnatomy myAnatomy = new MyAnatomy ();
        myAnatomy.soln ( x,y );
    }
}
