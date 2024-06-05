package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o código do produto: ");
    int codigo = scanner.nextInt();
    String categoria;
    if (codigo >= 1 && codigo <= 10) {
    categoria = "Alimento não-perecível";
    } else if (codigo >= 11 && codigo <= 20) {
    categoria = "Alimento perecível";
    } else if (codigo >= 21 && codigo <= 30) {
    categoria = "Vestuário";
    } else if (codigo >= 31 && codigo <= 40) {
    categoria = "Eletrônicos";
    } else {
    categoria = "Código inválido";
    }
    System.out.println("A categoria do produto é: " + categoria);
    scanner.close();
    }
}