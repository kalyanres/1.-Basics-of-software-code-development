import java.util.Scanner;

public class Task1c1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = in.nextInt();
        int sum = 0;

        for (int i = 0; i <= x; i++) {
            sum = sum + i;
        }
        System.out.println("Sum all numbers is " + sum);
    }
}
