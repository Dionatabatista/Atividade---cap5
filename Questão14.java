import java.util.Scanner;

public class Questão14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePessoas = 15;
        int somaIdadesOtimo = 0;
        int quantidadeRegular = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            System.out.print("Digite a opinião da pessoa " + i + " (ótimo=3, bom=2, regular=1): ");
            int opiniao = scanner.nextInt();

            if (opiniao == 3) {
                somaIdadesOtimo += idade;
            } else if (opiniao == 1) {
                quantidadeRegular++;
            }
        }

        if (somaIdadesOtimo > 0) {
            double mediaIdadesOtimo = (double) somaIdadesOtimo / quantidadePessoas;
            System.out.println("Média das idades das pessoas que responderam 'ótimo': " + mediaIdadesOtimo);
        } else {
            System.out.println("Nenhuma pessoa respondeu 'ótimo'.");
        }

        System.out.println("Quantidade de pessoas que responderam 'regular': " + quantidadeRegular);

        scanner.close();
    }
}
