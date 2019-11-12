import java.util.Scanner;

public class Task1c6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input e: ");
        char e = in.next().charAt(0);
        int i = (int)e;
        System.out.println("Symbol \"" + e + "\" is " + i);
    }
}
