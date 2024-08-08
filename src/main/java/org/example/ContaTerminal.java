package org.example;

import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeroConta;
    String agencia, cliente;
    double saldo;

    // Solicita o nome do cliente
    System.out.print("Por favor, digite o seu nome: ");
    cliente = scanner.next();

    // Solicita a agência
    System.out.print("Agora, digite a agência: ");
    agencia = scanner.next();

    // Solicita o número da conta
    System.out.print("Desta vez, digite o número da conta: ");
    numeroConta = scanner.nextInt();

    // Solicita o saldo
    System.out.print("Para finalizar, insira o valor do seu saldo: ");
    saldo = scanner.nextDouble();

    // Fecha o scanner
    scanner.close();

    // Imprime a mensagem final formatada
    System.out.printf(
            "\nOlá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta bancária número: %d, e o seu saldo bancário é de R$ %.2f%n",
            cliente, agencia, numeroConta, saldo
    );
    System.out.println("\nPara mais informações, entre em contato pelo telefone: 0800-529-0000 ou em algum de nossos canais de atendimento.");

  }
}
