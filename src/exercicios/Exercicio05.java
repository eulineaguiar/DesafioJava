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
    System.out.println("Aluno aprovado com m�dia: " + media);
    } else if (media >= 5) {
    System.out.println("Aluno em recupera��o com m�dia: " + media);
    } else {
    System.out.println("Aluno reprovado com m�dia: " + media);
    }
    scanner.close();
    }
}