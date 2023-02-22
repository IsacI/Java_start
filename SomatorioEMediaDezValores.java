package Atividades;

import java.util.Scanner;

public class SomatorioEMediaDezValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somatorio = 0;
        double media;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            double valor = scanner.nextDouble();

            somatorio += valor;
        }

        media = somatorio / 10;

        System.out.println("O somatório dos valores é: " + somatorio);
        System.out.println("A média dos valores é: " + media);
    }
}

