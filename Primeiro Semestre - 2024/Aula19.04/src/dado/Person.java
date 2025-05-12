package dado;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name;
        int birthDate, anoAtual;
        byte childNumber;
        double salary;

        System.out.println("Escreva seu nome: ");
        name = sc.nextLine();

        System.out.println("Digite Seu Aniversário");
        birthDate = sc.nextInt();

        System.out.println("Aniversário : " + birthDate);

        System.out.println("Quantos filhos você têm? ");
        childNumber = sc.nextByte();

        System.out.println("Informe o ano atual.");
        anoAtual = sc.nextInt();

        System.out.println("Qual seu salário? ");
        salary = sc.nextDouble();

        int calcularIdade = anoAtual - birthDate;

        System.out.println("Nome: " + name);
        System.out.println("Aniversário " + birthDate);
        System.out.println("Número de filhos " + childNumber);
        System.out.println("Seu salário : " + salary);
        System.out.println("Idade : " + calcularIdade);
    }
}
