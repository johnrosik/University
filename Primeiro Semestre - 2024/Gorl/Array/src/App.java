public class App {
    public static void main(String[] args) {
        int[] a = { 99, 22, 11, 3, 11, 55, 44, 88, 2, -3 };
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 30)
                result += a[i];
        } // fim do for

        System.out.printf("Result is: %d\n", result);
    } // fim do main
} // fim da classe App
