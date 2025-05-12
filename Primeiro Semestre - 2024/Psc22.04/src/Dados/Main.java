// Código da classe Main.java
package Dados;

import java.util.Scanner;

class Main {
    static Scanner scanner = new Scanner(System.in);

    Reader reader = new Reader();

    public static void main(String[] args) {
        Reader reader = new Reader();
        System.out.println("Digite um número para calcular o fatorial: ");
        int i = scanner.nextInt();
        System.out.println("O fatorial de " + i + " é " + reader.fatorial(i));
    }

}