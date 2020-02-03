package myAnatomy;
import java.lang.String;

public class MyAnatomy {
    public static void soln(int x , int y) {
        int sum = x + y;
        System.out.println (sum);
        String s = Integer.toString ( x );
        char[] ch = s.toCharArray ();
        char[] ch2 = new char[ch.length];
        String s1 = Integer.toString ( y );
        char[] ch1 = s1.toCharArray();
        char[] ch3 = new char[ch1.length];

        for (int i = 0; i < s.length(); i++) {

            if (ch[i] == 5) {
                ch2[i] = 6;

            } else if (ch[i] == 6) {
                ch2[i] = 5;
            }
            else{
                ch2[i] = ch[i];
            }
        }

        for (int j = 0; j < s1.length() ; j++) {

            if (ch1[j] == 5) {
                ch3[j] = 6;

            } else if (ch1[j] == 6) {
                ch3[j] = 5;
            }
            else{
                ch3[j] = ch1[j];
            }
        }
        //System.out.printf (ch2.toString () + " " + ch3.toString ());
        for (int z = 0; z < ch.length; z++) {
            System.out.printf (ch2[z] + " ");
        }
        //System.out.println (ch2);
        //System.out.println (ch3);
        for (int z1 = 0; z1 < ch1.length; z1++) {
            System.out.printf (ch3[z1] + " ");
        }
    }
}
