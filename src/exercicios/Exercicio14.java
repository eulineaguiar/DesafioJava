package exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    double numero = scanner.nextDouble();
    if (numero > 0) {
    double raizQuadrada = Math.sqrt(numero);
    System.out.println("O número é positivo. A raiz quadrada é: " + raizQuadrada);
    } else if (numero < 0) {
    double numeroAoQuadrado = numero * numero;
    System.out.println("O número é negativo. O número ao quadrado é: " + numeroAoQuadrado);
    } else {
    System.out.println("O número é zero, ele é neutro.");
    }
    scanner.close();
    }
}