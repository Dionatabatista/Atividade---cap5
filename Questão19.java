import java.util.Scanner;

public class Questão19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lucroTotal = 0;
        int acoesComLucroSuperior1000 = 0;
        int acoesComLucroInferior200 = 0;

        while (true) {
            System.out.print("Digite o tipo da ação (ou 'F' para encerrar): ");
            String tipoAcao = scanner.next();

            if (tipoAcao.equals("F")) {
                break;
            }

            System.out.print("Digite o preço de compra: R$ ");
            double precoCompra = scanner.nextDouble();

            System.out.print("Digite o preço de venda: R$ ");
            double precoVenda = scanner.nextDouble();

            double lucro = precoVenda - precoCompra;
            lucroTotal += lucro;

            System.out.println("Lucro da ação " + tipoAcao + ": R$ " + lucro);

            if (lucro > 1000) {
                acoesComLucroSuperior1000++;
            } else if (lucro < 200) {
                acoesComLucroInferior200++;
            }
        }

        System.out.println("Quantidade de ações com lucro superior a R$ 1.000,00: " + acoesComLucroSuperior1000);
        System.out.println("Quantidade de ações com lucro inferior a R$ 200,00: " + acoesComLucroInferior200);
        System.out.println("Lucro total da empresa: R$ " + lucroTotal);

        scanner.close();
    }
}
