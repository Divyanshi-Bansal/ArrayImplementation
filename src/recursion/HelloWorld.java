package recursion;

public class HelloWorld {
    public void printHello(int n) {
        if (n == 1) {
            System.out.println ( "Hello world..." );
        } else {
            printHello ( n - 1 );
            System.out.println ( "Helloo world..." );
        }
    }
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld ();
        hw.printHello(10);
    }
}
