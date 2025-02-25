public class Recursy {
    public static void countdown(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            countdown(n - 1);
        }
    }
}
