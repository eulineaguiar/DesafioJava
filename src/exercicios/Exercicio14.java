package exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um n�mero: ");
    double numero = scanner.nextDouble();
    if (numero > 0) {
    double raizQuadrada = Math.sqrt(numero);
    System.out.println("O n�mero � positivo. A raiz quadrada �: " + raizQuadrada);
    } else if (numero < 0) {
    double numeroAoQuadrado = numero * numero;
    System.out.println("O n�mero � negativo. O n�mero ao quadrado �: " + numeroAoQuadrado);
    } else {
    System.out.println("O n�mero � zero, ele � neutro.");
    }
    scanner.close();
    }
}