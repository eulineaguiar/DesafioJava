package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
    System.out.println("Digite o primeiro n�mero: ");
    double numero1 = scanner.nextDouble();
    System.out.println("Digite o segundo n�mero: ");
    double numero2 = scanner.nextDouble();
    System.out.println("Digite o sinal da opera��o (+, -, *, /): ");
    char operacao = scanner.next().charAt(0);
    double resultado;
    switch (operacao) {
    case '+':
    resultado = numero1 + numero2;
    break;
    case '-':
    resultado = numero1 - numero2;
    break;
    case '*':
    resultado = numero1 * numero2;
    break;
    case '/':
    if (numero2 != 0) {
    resultado = numero1 / numero2;
    } else {
    System.out.println("Erro: divis�o por zero");
    return;
    }
    break;
    default:
    System.out.println("Opera��o inv�lida");
    return;
    }
    System.out.println("O resultado da opera��o �: " + resultado);
    } finally {
    scanner.close();
    }
    }
}