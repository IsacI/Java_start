package Atividades;

import java.util.Scanner;

public class SomaOuMultiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        if (a == b) {
            int resultado = a + b;
            System.out.println("A e B são iguais. A soma de A e B é: " + resultado);
        } else {
            int resultado = a * b;
            System.out.println("A e B são diferentes. A multiplicação de A por B é: " + resultado);
        }
    }
}