import java.util.Scanner;

public class Task1v4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        System.out.print("Input B: ");
        int B = in.nextInt();
        System.out.print("Input x: ");
        int x = in.nextInt();
        System.out.print("Input y: ");
        int y = in.nextInt();
        System.out.print("Input z: ");
        int z = in.nextInt();
        
        if (((A > x) && (B >y || B > z)) || 
                ((A > y) && (B > x || B > z)) || 
                ((A > z) && (B > x || B > y))) {
            System.out.println("Кирпич проходит в отверстие");
        } else {
            System.out.println("Кирпич НЕ проходит в отверстие");
        }
    }
}
