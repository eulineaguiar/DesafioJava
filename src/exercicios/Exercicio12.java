package exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um n�mero: ");
    int numero = scanner.nextInt();
    if (numero > 100) {
    System.out.println("O n�mero � maior que 100.");
    } else {
    int dobro = numero * 2;
    System.out.println("O n�mero n�o � maior que 100. O dobro dele �: " + dobro);
    }
    scanner.close();
    }
}