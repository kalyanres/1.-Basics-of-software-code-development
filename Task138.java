import java.util.Scanner;

public class Task1c8 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input m: ");
        int m = in.nextInt();
        System.out.print("Input n: ");
        int n = in.nextInt();
        int n1 = n;
        int temp_m = 0;
        int temp_n = 0;
        while (m != 0) {
            temp_m = m % 10;
            while (n1 != 0) {
                temp_n = n1 % 10;
                if (temp_m == temp_n)
                    System.out.print(temp_m + " ");
                n1 /= 10;
            }
            n1 = n;
            m /= 10;
        }
        System.out.println();
    }
}
