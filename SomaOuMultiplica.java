package Atividades;

import java.util.Scanner;

public class SomaOuMultiplica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        if (a == b) {
            int soma = a + b;
            System.out.println("A e B são iguais. Soma: " + soma);
        } else {
            int multiplicacao = a * b;
            System.out.println("A e B são diferentes. Multiplicação: " + multiplicacao);
        }
    }
}