import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Digite Um número: ");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();

        System.out.println("Agora Digite Outro Número: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.printf("%d é maior que %d\n", numero1, numero2);
        } else if (numero1 < numero2) {
            System.out.printf("%d é menor que %d\n", numero2, numero1);
        } else {
            System.out.println("Os Números são iguais");
        }

    }
}
