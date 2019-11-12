import java.util.Scanner;

public class Task16 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = in.nextInt();
        System.out.print("Input y: ");
        int y = in.nextInt();
        boolean answer;
        if (((x >= -2 && x <= 2) && (y > 0 && y <= 4)) || 
                ((x >= -4 && x <= 4) && (y <= 0 && y >= -4))) {
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer);
    }
}
