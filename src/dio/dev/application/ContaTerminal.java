package dio.dev.application;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência !");
        int agencia = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o número da conta !");
        String conta = sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agencia é " + agencia + ", conta " + conta + " e seu saldo " + saldo +
                " já está disponível para saque");

    }

}
