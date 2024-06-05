package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a nota do aluno: ");
    double nota = scanner.nextDouble();
    char conceito;
    if (nota >= 9) {
    conceito = 'A';
    } else if (nota >= 7) {
    conceito = 'B';
    } else if (nota >= 5) {
    conceito = 'C';
    } else if (nota >= 3) {
    conceito = 'D';
    } else {
    conceito = 'F';
    }
    System.out.println("O conceito do aluno é: " + conceito);
    scanner.close();
    }
}