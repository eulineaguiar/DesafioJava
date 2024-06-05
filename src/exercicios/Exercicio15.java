package exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o peso (ex: 50): ");
    double peso = scanner.nextDouble();
    System.out.println("Digite a altura (ex: 1,70): ");
    double altura = scanner.nextDouble();
    double imc = peso / (altura * altura);
    String categoria;
    if (imc < 18.5) {
    categoria = "Abaixo do peso";
    } else if (imc < 25) {
    categoria = "Peso normal";
    } else if (imc < 30) {
    categoria = "Sobrepeso";
    } else if (imc < 35) {
    categoria = "Obesidade grau I";
    } else if (imc < 40) {
    categoria = "Obesidade grau II";
    } else {
    categoria = "Obesidade grau III";
    }
    System.out.println("O IMC é: " + imc);
    System.out.println("Categoria: " + categoria);
    scanner.close();
    }
}