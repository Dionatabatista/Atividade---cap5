import java.util.Scanner;

public class Questão25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCliente;
        double valorInvestido;
        int tipoInvestimento;
        double rendimentoMensal;
        double totalInvestido = 0;
        double totalJurosPagos = 0;

        while (true) {
            System.out.print("Digite o código do cliente (ou código menor ou igual a 0 para encerrar): ");
            codigoCliente = scanner.nextInt();

            if (codigoCliente <= 0) {
                break;
            }

            System.out.print("Digite o tipo do investimento (1 - Poupança, 2 - Poupança Plus, 3 - Fundos de Renda Fixa): ");
            tipoInvestimento = scanner.nextInt();

            System.out.print("Digite o valor investido: R$ ");
            valorInvestido = scanner.nextDouble();

            if (valorInvestido <= 0) {
                System.out.println("Valor inválido. Insira um valor positivo.");
                continue;
            }

            switch (tipoInvestimento) {
                case 1:
                    rendimentoMensal = valorInvestido * 0.015;
                    break;
                case 2:
                    rendimentoMensal = valorInvestido * 0.02;
                    break;
                case 3:
                    rendimentoMensal = valorInvestido * 0.04;
                    break;
                default:
                    System.out.println("Tipo de investimento inválido. Escolha 1, 2 ou 3.");
                    continue;
            }

            totalInvestido += valorInvestido;
            totalJurosPagos += rendimentoMensal;

            System.out.println("Rendimento mensal do cliente " + codigoCliente + ": R$ " + rendimentoMensal);
        }

        System.out.println("Total investido pelos clientes: R$ " + totalInvestido);
        System.out.println("Total de juros pagos aos clientes: R$ " + totalJurosPagos);

        scanner.close();
    }
}
