package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro lado do tri�ngulo: ");
    double lado1 = scanner.nextDouble();
    System.out.println("Digite o segundo lado do tri�ngulo: ");
    double lado2 = scanner.nextDouble();
    System.out.println("Digite o terceiro lado do tri�ngulo: ");
    double lado3 = scanner.nextDouble();
    if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
    System.out.println("Os lados formam um tri�ngulo v�lido.");
    } else {
    System.out.println("Os lados n�o formam um tri�ngulo v�lido.");
    }
    scanner.close();
    }
}