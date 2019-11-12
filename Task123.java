import java.util.Scanner;

public class Task1v3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input A x1: ");
        int x1 = in.nextInt();
        System.out.print("Input A y1: ");
        int y1 = in.nextInt();
        System.out.print("Input B x2: ");
        int x2 = in.nextInt();
        System.out.print("Input B y2: ");
        int y2 = in.nextInt();
        System.out.print("Input C x3: ");
        int x3 = in.nextInt();
        System.out.print("Input C y3: ");
        int y3 = in.nextInt();
        double a2 = (double)(y2 - y1) / (x2 - x1);
        double a3 = (double)(y3 - y1) / (x3 - x1);
        
        if (x1 != x2 || x1 != x3) {
            if (a2 == a3) {
                System.out.println("Все точки лежат на одной прямой");
            } else {
                System.out.println("Все точки НЕ лежат на одной прямой");
            }
        } else if (x1 == x2 || x1 == x3){
            if (x1 == x2 && x1 == x3) {
                System.out.println("Все точки лежат на одной прямой");
            }
        }
    }
}
