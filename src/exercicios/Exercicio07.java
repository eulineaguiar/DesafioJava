package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a idade: ");
    int idade = scanner.nextInt();
    if (idade >= 0 && idade <= 12) {
    System.out.println("Crian�a");
    } else if (idade >= 13 && idade <= 17) {
    System.out.println("Adolescente");
    } else if (idade >= 18 && idade <= 59) {
    System.out.println("Adulto");
    } else if (idade >= 60) {
    System.out.println("Idoso");
    } else {
    System.out.println("Idade inv�lida");
    }
    scanner.close();
    }
}