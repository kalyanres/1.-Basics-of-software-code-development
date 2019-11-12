import java.util.Scanner;

public class Task1v5 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = in.nextDouble();
        double F = 0;
        
        if (x <= 3) {
            F = x * x - 3 * x + 9;
            System.out.println("F(x) = x * x - 3 * x + 9");
            System.out.println("F(x) = " + F);
        } else {
            F = 1 / (x * x * x + 6);
            System.out.println("F(x) = 1 / (x * x * x + 6)");
            System.out.println("F(x) = " + F);
        }

    }
}
