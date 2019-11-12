import java.util.Scanner;

public class Task1v1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input angle 1: ");
        int angle1 = in.nextInt();
        System.out.print("Input angle 2: ");
        int angle2 = in.nextInt();
        if (angle1 + angle2 < 180) {
            System.out.println("Треугольник существует");
            if (angle1 == 90 || angle2 == 90 || 
                    angle1 + angle2 == 90) {
                System.out.println(" и он прямоугольный");
            }
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}
