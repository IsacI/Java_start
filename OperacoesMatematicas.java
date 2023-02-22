package Atividades;


import java.util.Scanner;

public class OperacoesMatematicas {
    private double num1;
    private double num2;

    public OperacoesMatematicas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        this.num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        this.num2 = scanner.nextDouble();
    }

    public double soma() {
        return this.num1 + this.num2;
    }

    public double subtracao() {
        return this.num1 - this.num2;
    }

    public double multiplicacao() {
        return this.num1 * this.num2;
    }

    public double divisao() {
        return this.num1 / this.num2;
    }

    public static void main(String[] args) {
        OperacoesMatematicas op = new OperacoesMatematicas();

        System.out.println("Soma: " + op.soma());
        System.out.println("Subtração: " + op.subtracao());
        System.out.println("Multiplicação: " + op.multiplicacao());
        System.out.println("Divisão: " + op.divisao());
    }
}



