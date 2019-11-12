import java.util.Scanner;

public class Task1v2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        System.out.print("Input c: ");
        int c = in.nextInt();
        System.out.print("Input d: ");
        int d = in.nextInt();
        
        if (b < a) {
            a = b;
        }
        if (d < c ) {
            c = d;
        }
        if (c > a) {
            a = c;
        }
        System.out.println("max{min(a, b), min(c, d)} = " + a);
    }
}
