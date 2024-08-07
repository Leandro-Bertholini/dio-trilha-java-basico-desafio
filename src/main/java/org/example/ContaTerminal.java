package org.example;

import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeroConta;
    String agencia, cliente;
    double saldo;

    System.out.print("Por favor, digite o seu nome:  ");
    cliente = scanner.next();
    System.out.print("Agora, digite a agência:  ");
    agencia = scanner.next();
    System.out.print("Desta vez, digite o número da conta:  ");
    numeroConta = scanner.nextInt();
    System.out.print("Para finalizar, insira o valor do seu saldo:  ");
    saldo = scanner.nextDouble();

    System.out.printf(
            "\nOlá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta bancária número: %d, e o seu saldo bancário é de R$ %.2f%n",
            cliente, agencia, numeroConta, saldo
            );
    System.out.println("\nPara mais informações, entre em contato pelo telefone: 0800-529-0000 ou em algum de nossos canais de atendimento.");
  }
}
