import java.util.Scanner;

public class Questão22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        double altura;
        double somaAlturas = 0;
        int contadorPessoasMaisDe50 = 0;

        while (true) {
            System.out.print("Digite a idade (ou idade menor ou igual a zero para encerrar): ");
            idade = scanner.nextInt();

            if (idade <= 0) {
                break;
            }

            System.out.print("Digite a altura (em metros): ");
            altura = scanner.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                contadorPessoasMaisDe50++;
            }
        }

        if (contadorPessoasMaisDe50 > 0) {
            double mediaAlturasMaisDe50 = somaAlturas / contadorPessoasMaisDe50;
            System.out.println("A média das alturas das pessoas com mais de 50 anos é: " + mediaAlturasMaisDe50 + " metros.");
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi considerada na média.");
        }

        scanner.close();
    }
}
