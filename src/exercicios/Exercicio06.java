package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um ano: ");
    int ano = scanner.nextInt();
    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
    System.out.println("O ano " + ano + " � bissexto.");
    } else {
    System.out.println("O ano " + ano + " n�o � bissexto.");
    }
    scanner.close();
    }
}