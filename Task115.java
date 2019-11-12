import java.util.Scanner;

public class Task15 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input T: ");
        int T = in.nextInt();
        in.close();
        int S = T % 60;
        int H = T / 3600;
        int M = T % 3600 / 60;
        System.out.println(H + "ч " + M + "мин " + S + "c");
    }
}
