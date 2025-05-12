/* Escreva um programa e mostre os valores utilizados para calcular o quadrado de um
número positivo através do seguinte método: “O quadrado de um número positivo N é3
igual à soma dos N primeiros números ímpares”. o quadrado de 3 é 9 = 1+3+5, e o de 7 é
49 = 1+3+5+7+9+11+13.
Exemplo: Digite o número a ser elevado ao quadrado: 6 */

package R009;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Reader reader = new Reader();

        System.out.println("Digite o número a ser elevado ao quadrado: ");
        int number = scanner.nextInt();

        System.out.println("O quadrado de " + number + " é " + reader.sum);
        scanner.close();
    }
}
