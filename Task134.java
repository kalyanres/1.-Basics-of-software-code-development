public class Task1c4 {
    public static void main (String[] args) {
        long mult = 1L;
        for (long i = 1; i <= 200; i++) {
            mult = mult * i * i;
        }
        System.out.println("Mult = " + mult);
    }
}
