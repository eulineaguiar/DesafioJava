package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o c�digo do produto: ");
    int codigo = scanner.nextInt();
    String categoria;
    if (codigo >= 1 && codigo <= 10) {
    categoria = "Alimento n�o-perec�vel";
    } else if (codigo >= 11 && codigo <= 20) {
    categoria = "Alimento perec�vel";
    } else if (codigo >= 21 && codigo <= 30) {
    categoria = "Vestu�rio";
    } else if (codigo >= 31 && codigo <= 40) {
    categoria = "Eletr�nicos";
    } else {
    categoria = "C�digo inv�lido";
    }
    System.out.println("A categoria do produto �: " + categoria);
    scanner.close();
    }
}