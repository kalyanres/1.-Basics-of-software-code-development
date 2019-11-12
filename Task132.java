import java.util.Scanner;

public class Task1c2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        System.out.print("Input h: ");
        int h = in.nextInt();
        int y = 0;

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = -i;
            }
            System.out.println("y = " + y);
        }
    }
}
