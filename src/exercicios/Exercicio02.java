package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um n�mero inteiro: ");
    int numero = scanner.nextInt();
    if (numero > 0) {
    System.out.println("O n�mero � positivo.");
    } else if (numero < 0) {
    System.out.println("O n�mero � negativo.");
    } else {
    System.out.println("O n�mero � zero.");
    }
    scanner.close();
    }
}