package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a primeira nota: ");
    double nota1 = scanner.nextDouble();
    System.out.println("Digite a segunda nota: ");
    double nota2 = scanner.nextDouble();
    System.out.println("Digite a terceira nota: ");
    double nota3 = scanner.nextDouble();
    double media = (nota1 + nota2 + nota3) / 3;
    if (media >= 7) {
    System.out.println("Aluno aprovado com média: " + media);
    } else if (media >= 5) {
    System.out.println("Aluno em recuperação com média: " + media);
    } else {
    System.out.println("Aluno reprovado com média: " + media);
    }
    scanner.close();
    }
}