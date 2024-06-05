package exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o valor da compra: ");
    double valorCompra = scanner.nextDouble();
    System.out.println("Digite a categoria do cliente (1 para comum, 2 para associado e 3 para VIP): ");
    int categoriaCliente = scanner.nextInt();
    double valorFinal;
    switch (categoriaCliente) {
    case 1:
    valorFinal = valorCompra;
    break;
    case 2:
    valorFinal = valorCompra * 0.9;
    break;
    case 3:
    valorFinal = valorCompra * 0.8;
    break;
    default:
    System.out.println("Categoria inválida.");
    scanner.close();
    return;
    }
    System.out.println("O valor final da compra é: " + valorFinal);
    scanner.close();
    }
}