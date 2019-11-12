import java.util.Scanner;

public class Task14 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input R: ");
        double R = in.nextDouble();
        in.close();
        int n = (int)(R * 1000) % 1000;
        int d = (int)R;
        double Z = (double)n + (double)d / 1000;
        System.out.println("Result = " + Z);
    }
}
