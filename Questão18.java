import java.util.Scanner;

public class Questão18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        double somaSalarios = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int menorSalarioIdade = 0;
        char menorSalarioSexo = ' ';
        int mulheresComSalarioBaixo = 0;

        while (true) {
            System.out.print("Digite a idade (ou idade negativa para encerrar): ");
            int idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Digite o salário: R$ ");
            double salario = scanner.nextDouble();

            somaSalarios += salario;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
                menorSalarioIdade = idade;
                menorSalarioSexo = sexo;
            }

            if (sexo == 'F' && salario <= 200.00) {
                mulheresComSalarioBaixo++;
            }

            contador++;
        }

        if (contador > 0) {
            double mediaSalarios = somaSalarios / contador;

            System.out.println("Média dos salários do grupo: R$ " + mediaSalarios);
            System.out.println("Maior idade do grupo: " + maiorIdade + " anos");
            System.out.println("Menor idade do grupo: " + menorIdade + " anos");
            System.out.println("Quantidade de mulheres com salário até R$ 200,00: " + mulheresComSalarioBaixo);

            System.out.println("Pessoa com menor salário: Idade " + menorSalarioIdade + " anos, Sexo " + menorSalarioSexo);
        } else {
            System.out.println("Nenhum dado foi fornecido.");
        }

        scanner.close();
    }
}

