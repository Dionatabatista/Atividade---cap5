import java.util.Scanner;

public class Questão20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularMediaAritmetica(scanner);
                    break;
                case 2:
                    calcularMediaPonderada(scanner);
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    public static void calcularMediaAritmetica(Scanner scanner) {
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("A média aritmética é: " + media);
    }

    public static void calcularMediaPonderada(Scanner scanner) {
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();

        double somaPesos = peso1 + peso2 + peso3;
        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;
        System.out.println("A média ponderada é: " + media);
    }
}
