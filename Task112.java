import java.util.Scanner;

public class Task12 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in.nextDouble();
        System.out.print("Input b: ");
        double b = in.nextDouble();
        System.out.print("Input c: ");
        double c = in.nextDouble();
        in.close();
        double z = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + 1 / (b * b);
        System.out.println("z = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + 1 / (b * b)");
        System.out.println("z = " + z);
    }
}
