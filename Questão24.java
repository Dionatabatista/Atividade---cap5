import java.util.Scanner;

public class Questão24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um valor inteiro e positivo (ou 0 para encerrar): ");
            int valor = scanner.nextInt();

            if (valor == 0) {
                break;
            } else if (valor <= 0) {
                System.out.println("Valor inválido. Insira um valor inteiro e positivo.");
            } else {
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
                if (valor < menorValor) {
                    menorValor = valor;
                }
            }
        }

        if (maiorValor != Integer.MIN_VALUE && menorValor != Integer.MAX_VALUE) {
            System.out.println("Maior valor do conjunto: " + maiorValor);
            System.out.println("Menor valor do conjunto: " + menorValor);
        } else {
            System.out.println("Nenhum valor válido foi inserido.");
        }

        scanner.close();
    }
}
