package Dados;

public class Reader {
    public int i;

    // metodo

    public int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}
