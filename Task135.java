import java.util.Scanner;

public class Task1c5 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input e: ");
        double e = in.nextDouble();
        System.out.print("Input n: ");
        double n = in.nextDouble();
        double a = 0;
        double sum = 0;
        for (int i = 0; i < n; i++){
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) >= e){
                sum = sum + a;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
