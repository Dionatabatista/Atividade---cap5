import java.util.Scanner;

public class Questão11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do carro: ");
        double valorCarro = scanner.nextDouble();

        double descontoAVista = 0.20; // Desconto de 20% para pagamento à vista

        System.out.println("Tabela de Preços:");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Parcelas\tPreço Final\tValor da Parcela");

        // Preço à vista
        double precoAVista = valorCarro * (1 - descontoAVista);
        System.out.println("À vista\t\t" + precoAVista + "\t\tN/A");

        int[] parcelas = { 6, 12, 18, 24, 30, 36, 42, 48, 54, 60 };
        double[] acrescimos = { 0.05, 0.08, 0.10, 0.12, 0.15, 0.18, 0.20, 0.22, 0.25, 0.30 };

        for (int i = 0; i < parcelas.length; i++) {
            int numParcelas = parcelas[i];
            double acrescimo = acrescimos[i];

            double precoParcelado = valorCarro * (1 + acrescimo);
            double valorParcela = precoParcelado / numParcelas;

            System.out.println(numParcelas + "\t\t" + precoParcelado + "\t\t" + valorParcela);
        }

        scanner.close();
    }
}
