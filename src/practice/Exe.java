package practice;

import java.util.Scanner;

public class Exe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int index = scanner.nextInt ();
        int data = scanner.nextInt ();
        PracticeArray practiceArray = new PracticeArray ();
        practiceArray.insert(index,data);
    }
}
