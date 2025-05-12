package dados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // instancia a classe
        Person p1 = new Person();

        System.out.println("Digite o nome da pessoa: ");
        p1.name = scanner.nextLine();

        System.out.println("Digite o ano de nascimento da pessoa: ");
        p1.birthYear = scanner.nextInt();

        System.out.println("Digite o número de filhos da pessoa: ");
        p1.numberOfChildren = scanner.nextByte();

        System.out.println("Digite o salário da pessoa: ");
        p1.salary = scanner.nextDouble();

        System.out.println("Digite o ano atual: ");
        int actualYear = scanner.nextInt();

        System.out.println("O nome da pessoa é: " + p1.name);
        System.out.println("O ano de nascimento da pessoa é: " + p1.birthYear);
        System.out.println("O número de filhos da pessoa é: " + p1.numberOfChildren);
        System.out.println("O salário da pessoa é: " + p1.salary);
        System.out.println("A idade da pessoa é: " + p1.calculateAge(actualYear));

        scanner.close();
    }
}
