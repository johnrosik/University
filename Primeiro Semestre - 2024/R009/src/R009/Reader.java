package R009;

public class Reader {
    public int number;
    public int sum = 0;
    public int odd = 1;

    public void calculateSum() {
        for (int i = 0; i < number; i++) {
            sum += odd;
            odd += 2;
        }
    }
}
