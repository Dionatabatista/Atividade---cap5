import java.util.Scanner;

public class Questão23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Novo salário");
            System.out.println("2. Férias");
            System.out.println("3. Décimo terceiro");
            System.out.println("4. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularNovoSalario(scanner);
                    break;
                case 2:
                    calcularFerias(scanner);
                    break;
                case 3:
                    calcularDecimoTerceiro(scanner);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static void calcularNovoSalario(Scanner scanner) {
        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salario = scanner.nextDouble();

        double novoSalario;
        if (salario <= 210.00) {
            novoSalario = salario + (0.15 * salario);
        } else if (salario <= 600.00) {
            novoSalario = salario + (0.10 * salario);
        } else {
            novoSalario = salario + (0.05 * salario);
        }

        System.out.println("Novo salário do funcionário: R$ " + novoSalario);
    }

    public static void calcularFerias(Scanner scanner) {
        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salario = scanner.nextDouble();

        double valorFerias = salario + (salario / 3);

        System.out.println("Valor das férias do funcionário: R$ " + valorFerias);
    }

    public static void calcularDecimoTerceiro(Scanner scanner) {
        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o número de meses de trabalho na empresa (até 12 meses): ");
        int mesesTrabalho = scanner.nextInt();

        if (mesesTrabalho > 12) {
            mesesTrabalho = 12;
        }

        double decimoTerceiro = (salario * mesesTrabalho) / 12;

        System.out.println("Valor do décimo terceiro do funcionário: R$ " + decimoTerceiro);
    }
}

